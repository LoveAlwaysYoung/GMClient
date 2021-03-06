package com.lip.gmclient.domain;

import com.lip.gmclient.utils.Constant;

import java.util.List;

public class WeatherBean {

    private List<HeWeather6Bean> HeWeather6;

    public List<HeWeather6Bean> getHeWeather6() {
        return HeWeather6;
    }

    public void setHeWeather6(List<HeWeather6Bean> HeWeather6) {
        this.HeWeather6 = HeWeather6;
    }

    public static class HeWeather6Bean {
        /**
         * basic : {"cid":"CN101190201","location":"无锡","parent_city":"无锡","admin_area":"江苏","cnty":"中国","lat":"31.57472992","lon":"120.30166626","tz":"+8.00"}
         * update : {"loc":"2018-04-25 13:47","utc":"2018-04-25 05:47"}
         * status : ok
         * now : {"cloud":"13","cond_code":"100","cond_txt":"晴","fl":"19","hum":"36","pcpn":"0.0","pres":"1017","tmp":"21","vis":"20","wind_deg":"9","wind_dir":"北风","wind_sc":"2","wind_spd":"9"}
         */

        private BasicBean basic;
        private UpdateBean update;
        private String status;
        private NowBean now;

        public BasicBean getBasic() {
            return basic;
        }

        public void setBasic(BasicBean basic) {
            this.basic = basic;
        }

        public UpdateBean getUpdate() {
            return update;
        }

        public void setUpdate(UpdateBean update) {
            this.update = update;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public NowBean getNow() {
            return now;
        }

        public void setNow(NowBean now) {
            this.now = now;
        }

        public static class BasicBean {
            /**
             * cid : CN101190201
             * location : 无锡
             * parent_city : 无锡
             * admin_area : 江苏
             * cnty : 中国
             * lat : 31.57472992
             * lon : 120.30166626
             * tz : +8.00
             */

            private String cid;
            private String location;
            private String parent_city;
            private String admin_area;
            private String cnty;
            private String lat;
            private String lon;
            private String tz;

            public String getCid() {
                return cid;
            }

            public void setCid(String cid) {
                this.cid = cid;
            }

            public String getLocation() {
                return location;
            }

            public void setLocation(String location) {
                this.location = location;
            }

            public String getParent_city() {
                return parent_city;
            }

            public void setParent_city(String parent_city) {
                this.parent_city = parent_city;
            }

            public String getAdmin_area() {
                return admin_area;
            }

            public void setAdmin_area(String admin_area) {
                this.admin_area = admin_area;
            }

            public String getCnty() {
                return cnty;
            }

            public void setCnty(String cnty) {
                this.cnty = cnty;
            }

            public String getLat() {
                return lat;
            }

            public void setLat(String lat) {
                this.lat = lat;
            }

            public String getLon() {
                return lon;
            }

            public void setLon(String lon) {
                this.lon = lon;
            }

            public String getTz() {
                return tz;
            }

            public void setTz(String tz) {
                this.tz = tz;
            }
        }

        public static class UpdateBean {
            /**
             * loc : 2018-04-25 13:47
             * utc : 2018-04-25 05:47
             */

            private String loc;
            private String utc;

            public String getLoc() {
                return loc;
            }

            public void setLoc(String loc) {
                this.loc = loc;
            }

            public String getUtc() {
                return utc;
            }

            public void setUtc(String utc) {
                this.utc = utc;
            }
        }

        public static class NowBean {
            /**
             * cloud : 13
             * cond_code : 100
             * cond_txt : 晴
             * fl : 19
             * hum : 36
             * pcpn : 0.0
             * pres : 1017
             * tmp : 21
             * vis : 20
             * wind_deg : 9
             * wind_dir : 北风
             * wind_sc : 2
             * wind_spd : 9
             */

            private String cloud;
            private String cond_code;
            private String cond_txt;
            private String fl;
            private String hum;
            private String pcpn;
            private String pres;
            private String tmp;
            private String vis;
            private String wind_deg;
            private String wind_dir;
            private String wind_sc;
            private String wind_spd;

            public String getCloud() {
                return cloud;
            }

            public void setCloud(String cloud) {
                this.cloud = cloud;
            }

            public String getCond_code() {
                return cond_code;
            }

            public void setCond_code(String cond_code) {
                this.cond_code = cond_code;
            }

            public String getCond_txt() {
                return cond_txt;
            }

            public void setCond_txt(String cond_txt) {
                this.cond_txt = cond_txt;
            }

            public String getFl() {
                return fl;
            }

            public void setFl(String fl) {
                this.fl = fl;
            }

            public String getHum() {
                return hum;
            }

            public void setHum(String hum) {
                this.hum = hum;
            }

            public String getPcpn() {
                return pcpn;
            }

            public void setPcpn(String pcpn) {
                this.pcpn = pcpn;
            }

            public String getPres() {
                return pres;
            }

            public void setPres(String pres) {
                this.pres = pres;
            }

            public String getTmp() {
                return tmp;
            }

            public void setTmp(String tmp) {
                this.tmp = tmp;
            }

            public String getVis() {
                return vis;
            }

            public void setVis(String vis) {
                this.vis = vis;
            }

            public String getWind_deg() {
                return wind_deg;
            }

            public void setWind_deg(String wind_deg) {
                this.wind_deg = wind_deg;
            }

            public String getWind_dir() {
                return wind_dir;
            }

            public void setWind_dir(String wind_dir) {
                this.wind_dir = wind_dir;
            }

            public String getWind_sc() {
                return wind_sc;
            }

            public void setWind_sc(String wind_sc) {
                this.wind_sc = wind_sc;
            }

            public String getWind_spd() {
                return wind_spd;
            }

            public void setWind_spd(String wind_spd) {
                this.wind_spd = wind_spd;
            }
        }
    }

    // 获取天气更新时间
    public String getUpdateTime(){
        if(HeWeather6==null||HeWeather6.size()==0){
            return "--:-- --";
        }
        String time=HeWeather6.get(0).getUpdate().loc.substring(11,16);
        return time+" 更新";
    }

    // 获取风向
    public String getWindDirection(){
        if(HeWeather6==null||HeWeather6.size()==0){
            return "风向--";
        }
        String wind_dir=HeWeather6.get(0).getNow().getWind_dir();
        String dir=wind_dir.substring(0,wind_dir.length()-1);
        return "风向 "+dir;
    }

    // 获取风力
    public String getWindPower(){
        if(HeWeather6==null||HeWeather6.size()==0){
            return "风力--";
        }
        return "风力 "+HeWeather6.get(0).getNow().getWind_sc();
    }

    // 获取实况天气
    public String getWeather(){
        if(HeWeather6==null||HeWeather6.size()==0){
            return "- -";
        }
        return HeWeather6.get(0).getNow().getCond_txt();
    }

    // 获取实况天气代码
    public String getWeatherImgURL(){
        if(HeWeather6==null||HeWeather6.size()==0){
            return "999.png";
        }
        String w_code=HeWeather6.get(0).getNow().cond_code;
        return Constant.URL_IMGHEAD+"/weather/"+w_code+".png";
    }

    // 获取温度
    public String getTempeture(){
        if(HeWeather6==null||HeWeather6.size()==0){
            return "--";
        }
        return HeWeather6.get(0).getNow().tmp;
    }
}
