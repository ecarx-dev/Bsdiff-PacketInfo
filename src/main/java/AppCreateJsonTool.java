import utils.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by zhaochong on 2017/6/2.
 */

public class AppCreateJsonTool {
    private static String channel;
    private static String packkageName;

    /**
     * 生成apk的json模板
     *
     * @param apkPath
     */
    public static void readApk(String apkPath) {
        Map<String, Object> mapApk = ReadUtil.readAPK(apkPath);
        String savePath = getAppPackageName(mapApk) + "\\android.json";

        FileUtils.createOrExistsDir(getAppChannel(mapApk));
        FileUtils.createOrExistsDir(getAppPackageName(mapApk));
        FileIOUtils.writeFileFromString(savePath, createAppJson(apkPath, mapApk));
        System.out.println("android file create success" + savePath);
    }


    private static String createAppJson(String apk, Map<String, Object> mapApk) {
        File file = new File(apk);
        List<AppInfoBean.DataBean.AndroidBean> androidBeanList = new ArrayList<>();
        AppInfoBean appInfoBean = new AppInfoBean();
        AppInfoBean.DataBean dataBean = new AppInfoBean.DataBean();
        AppInfoBean.DataBean.AndroidBean androidBean = new AppInfoBean.DataBean.AndroidBean();

        androidBean.setDownload_url("http://www.bai.com/");

        androidBean.setApp_id((String) mapApk.get("package"));
        androidBean.setV_code((String) mapApk.get("versionCode"));
        androidBean.setV_name((String) mapApk.get("versionName"));
        androidBean.setV_size(FileUtils.getFileSize(apk));

        androidBean.setForce(false);
        androidBean.setUpdate_content("海量更新");
        androidBean.setUpdate_content_en("Massive update content, please enjoy");
        androidBean.setApp_name(file.getName());
        androidBean.setV_md5(Md5Tool.getMD5(file));
        androidBean.setIs_web(0);
        androidBeanList.add(0, androidBean);
        dataBean.setAndroid(androidBeanList);
        appInfoBean.setCode(0);
        appInfoBean.setData(dataBean);
        System.out.println("-------------");
        System.out.println(com.alibaba.fastjson.JSON.toJSONString(appInfoBean));
        return JsonFormatUtil.formatJson(com.alibaba.fastjson.JSON.toJSONString(appInfoBean));
    }

    private static String getAppChannel(Map<String, Object> mapApk) {
//        channel = (String) mapApk.get("GL_CHANNEL");
        channel = "ECARX";
        return "C:\\Users\\ecarx\\Desktop\\" + channel;
    }

    private static String getAppPackageName(Map<String, Object> mapApk) {
        packkageName = (String) mapApk.get("package");
        return getAppChannel(mapApk) + "\\" + packkageName;
    }

}
