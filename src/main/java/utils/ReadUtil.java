package utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhaochong on 2017/11/6.
 */

public class ReadUtil {
    private static Map<String, Object> map = new HashMap<>();

    public static Map<String, Object> readAPK(String apkPath) {
        map.put("package","com.ecarx.gnetlink");
        map.put("versionCode","11");
        map.put("versionName","1.4.1.4");
        return map;
    }
}
