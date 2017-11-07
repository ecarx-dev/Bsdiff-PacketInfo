import java.util.List;

/**
 * Created by zhaochong on 2017/6/2.
 */

public class AppInfoBean {

    /**
     * code : 0
     * data : {"android":[{"download_url":"http://ykt-update.oss-cn-hangzhou.aliyuncs.com/G-NetLink/gl_debug/auto_update_apk/G-netlink_debug.apk","force":false,"update_content":"海量更新内容，请尽情体验","update_content_en":"Massive update content, please enjoy","v_code":"99999","v_name":"v1.0.0.16070810","app_name":"G-netlink_debug.apk","v_md5":"e8e346650300c175b69c28ced55ee16d","v_size":12365909,"app_id":"package_id","is_web":0}]}
     */

    private int code;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private List<AndroidBean> android;

        public List<AndroidBean> getAndroid() {
            return android;
        }

        public void setAndroid(List<AndroidBean> android) {
            this.android = android;
        }

        public static class AndroidBean {
            /**
             * download_url : http://ykt-update.oss-cn-hangzhou.aliyuncs.com/G-NetLink/gl_debug/auto_update_apk/G-netlink_debug.apk
             * force : false
             * update_content : 海量更新内容，请尽情体验
             * update_content_en : Massive update content, please enjoy
             * v_code : 99999
             * v_name : v1.0.0.16070810
             * app_name : G-netlink_debug.apk
             * v_md5 : e8e346650300c175b69c28ced55ee16d
             * v_size : 12365909
             * app_id : package_id
             * is_web : 0
             */

            private String download_url;
            private boolean force;
            private String update_content;
            private String update_content_en;
            private String v_code;
            private String v_name;
            private String app_name;
            private String v_md5;
            private String v_size;
            private String app_id;
            private int is_web;

            public String getDownload_url() {
                return download_url;
            }

            public void setDownload_url(String download_url) {
                this.download_url = download_url;
            }

            public boolean isForce() {
                return force;
            }

            public void setForce(boolean force) {
                this.force = force;
            }

            public String getUpdate_content() {
                return update_content;
            }

            public void setUpdate_content(String update_content) {
                this.update_content = update_content;
            }

            public String getUpdate_content_en() {
                return update_content_en;
            }

            public void setUpdate_content_en(String update_content_en) {
                this.update_content_en = update_content_en;
            }

            public String getV_code() {
                return v_code;
            }

            public void setV_code(String v_code) {
                this.v_code = v_code;
            }

            public String getV_name() {
                return v_name;
            }

            public void setV_name(String v_name) {
                this.v_name = v_name;
            }

            public String getApp_name() {
                return app_name;
            }

            public void setApp_name(String app_name) {
                this.app_name = app_name;
            }

            public String getV_md5() {
                return v_md5;
            }

            public void setV_md5(String v_md5) {
                this.v_md5 = v_md5;
            }

            public String getV_size() {
                return v_size;
            }

            public void setV_size(String v_size) {
                this.v_size = v_size;
            }

            public String getApp_id() {
                return app_id;
            }

            public void setApp_id(String app_id) {
                this.app_id = app_id;
            }

            public int getIs_web() {
                return is_web;
            }

            public void setIs_web(int is_web) {
                this.is_web = is_web;
            }
        }
    }
}
