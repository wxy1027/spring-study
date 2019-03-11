package image;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

public class ImageCopy {
    /*打日志*/
    private static final Logger logger = LoggerFactory.getLogger(ImageCopy.class);

    public void copyImage()throws IOException{
        logger.info("开始将图片从D盘复制到E盘...");
//        源文件位置
        File srcFile = new File("D:/bg.jpg");
//        目标文件位置
        File destFile= new File("E:/bg.jpg");
        InputStream in =new FileInputStream(srcFile);
        OutputStream out = new FileOutputStream(destFile);
//        字节数组
        byte[]bytes = new byte[(int)srcFile.length()];
        int len;
        while ((len= in.read(bytes))!= -1){
            out.write(bytes,0,len);
        }
        in.close();
        out.close();
    }
}
