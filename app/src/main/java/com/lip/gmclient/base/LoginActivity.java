package com.lip.gmclient.base;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;
import com.lip.gmclient.R;
import com.lip.gmclient.adapter.TaskListViewAdapter;
import com.lip.gmclient.domain.ResponseBean;
import com.lip.gmclient.domain.TaskBean;
import com.lip.gmclient.domain.UserBean;
import com.lip.gmclient.utils.Constant;
import com.lip.gmclient.utils.Md5Util;
import com.lip.gmclient.utils.SharedPreferencesUtil;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;

public class LoginActivity extends AppCompatActivity {

    public Activity context;

    private EditText et_username;
    private EditText et_password;

    private String username;
    private String password;
    private String  md5pwd;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context=this;
        initView();
    }

    private void initView(){
        setContentView(R.layout.activity_login);

        et_username=(EditText) findViewById(R.id.activity_login_username);
        et_password=(EditText) findViewById(R.id.activity_login_password);
    }

    /**
     * 登陆监听
     */
    public void onClickLoginBtn(View view){
        username=et_username.getText().toString();
        password=et_password.getText().toString();
        md5pwd= Md5Util.md5(password);
        OkGo.<String>post(Constant.URL_PWDLOGIN)
                .params("uid",username)
                .params("pwd",md5pwd)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(Response<String> response) {
                        Gson gson=new Gson();
                        UserBean userBean=gson.fromJson(response.body(),UserBean.class);
                        int status=userBean.getStatus();
                        if(status==200){
                            //登陆成功
                            SharedPreferencesUtil.setParam(context,Constant.ACCESSTOKEN,userBean.getData().getAccesstoken());
                            SharedPreferencesUtil.setParam(context,Constant.USERID,username);
                            SharedPreferencesUtil.setParam(context,Constant.PRIORITY,userBean.getData().getPriority());
                            Intent intent=new Intent();
                            intent.setClass(context,MainActivity.class);
                            startActivity(intent);
                        }else if(status==400){
                            // 密码错误
                            Toast.makeText(context,"密码错误！",Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(context,"服务器错误，请联系管理员！",Toast.LENGTH_SHORT).show();
                        }
                    }
                    @Override
                    public void onError(Response<String> response) {
                        // 用户尚未注册
                        Toast.makeText(context,"用户未注册！",Toast.LENGTH_SHORT).show();
                    }
                });
    }

}
