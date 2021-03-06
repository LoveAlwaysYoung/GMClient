package com.lip.gmclient.utils;

import java.net.URL;

public class Constant {

    /**
     * 全局TAG
     */
    public static final String TAG="lip";

    /**
     * SharePreference
     */
    public static final String ACCESSTOKEN="ACCESSTOKEN";
    public static final String USERID="USERID";
    public static final String PRIORITY="USERPRIORITY";


    /**
     * 和风天气
     */
    public static final String HEWEATHER_KEY="81ff5d6c263441d8bfbed6c043ca6bcb";
    public static final String HEWEATHER_URL="https://free-api.heweather.com/s6/weather/now";
    public static final String HEWEATHER_LOCATION="CN101190201";

    /**
     * 腾讯AI开放平台
     */
    public static final String Tencent_AppID="1106793063";
    public static final String Tencent_AppKey="QRvsQOB9dfq6m3Jb";
    public static final String Tencent_API="https://api.ai.qq.com/fcgi-bin/vision/vision_imgidentify";
    /**
     * 地区信息
     */
    public static final String[] AREAINFO={"牡丹园","桂花园","西瓜园","樱花园","桔子园","小花园","大花园"};

    /**
     * 网络请求URL
     */
    public static final String URL_HEAD="http://10.0.2.2:8080/gm";
    public static final String URL_IMGHEAD="http://10.0.2.2:8080/img";

    // 获取viewpager
    public static final String URL_VIEWPAGER=URL_HEAD+"/common/vplist";

    // 获取任务列表
    public static final String URL_TASKLIST=URL_HEAD+"/task/list";

    // 获取历史任务列表
    public static final String URL_HISTORYTASKLIST=URL_HEAD+"/task/history";

    // 获取地区列表
    public static final String URL_AREALIST=URL_HEAD+"/area/list";

    // 使用密码登陆
    public static final String URL_PWDLOGIN=URL_HEAD+"/security/pwdlogin";

    // 使用Token登陆
    public static final String URL_TOKENLOGIN=URL_HEAD+"/security/tokenlogin";

    // 获取植物信息列表
    public static final String URL_PLANTLIST=URL_HEAD+"/plant/list";

    // 获取用户信息
    public static final String URL_USERINFO= URL_HEAD+"/userinfo/get";

    // 提交反馈信息
    public static final String URL_FEEDBACK=URL_HEAD+"/feedback/commit";

    // 接受任务
    public static final String URL_ACCEPTTASK=URL_HEAD+"/task/accept";

    // 完成新增任务
    public static final String URL_FINISHADDTASK=URL_HEAD+"/task/add";

    // 完成移除任务
    public static final String URL_FINISHDELTASK=URL_HEAD+"/task/del";

    // 完成移植任务
    public static final String URL_FINISHREPLACETASK=URL_HEAD+"/task/replace";

    // 完成维护任务
    public static final String URL_FINISHMAITAINTASK=URL_HEAD+"/task/maintain";

    // 获取活动列表
    public static final String URL_ACTIVITYLIST=URL_HEAD+"/common/avlist";

}
