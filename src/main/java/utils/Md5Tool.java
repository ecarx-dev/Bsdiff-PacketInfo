package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5Tool {
    
   /* public static void main(String[] args){
        if(args.length < 1) return;
        File file = new File(args[0]);
        String md5 = getMD5(file);
        System.out.print(md5);
    }*/

   public static String getMD5(File file) {
        FileInputStream fis = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            fis = new FileInputStream(file);
            byte[] buffer = new byte[8192];
            int length = -1;
           
            while ((length = fis.read(buffer)) != -1) {
                md.update(buffer, 0, length);
            }
          
            byte[] b = md.digest();
            int i = 0;
            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0)
                    i += 256;
                if (i < 16)
                    buf.append("0");
                buf.append(Integer.toHexString(i));
            }
            return buf.toString();
        } catch (IOException ex) {
            return null;
        } catch (NoSuchAlgorithmException ex) {
            return null;
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}