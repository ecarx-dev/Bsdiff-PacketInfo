/**
 * Created by zhaochong on 2017/11/6.
 */

public class Client {
    public static void main(String[] args) {
       /* String apkPath = "C:\\Users\\ecarx\\Desktop\\coolqiv2.1.9_219_jiagu_sign.apk";
        AppCreateJsonTool.readApk(args[0]);*/
        try {
            String cmdStr1="bsdiff.exe  app-old.apk app-new.apk  com.ecarx.glautoupdatesdk.gnetlink_1_400_ECARX.patch";
            Runtime.getRuntime().exec("cmd.exe /c start "+cmdStr1);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
