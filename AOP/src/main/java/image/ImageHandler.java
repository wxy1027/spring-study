package image;

import cn.hutool.core.util.ImageUtil;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

/*图片处理类*/
@Aspect
public class ImageHandler {
    private static final Logger logger = LoggerFactory.getLogger(ImageHandler.class);
//    切点函数，必须为空
    @Pointcut("execution(* image.ImageCopy.copyImage())")
    public void handleImage(){

    }
//    前置增强类
    @Before(value = "handleImage()")
    public void pressTextOnImage() throws IOException {
        logger.info("开始给图片添加水印");
        File srcFile = new File("D:/bg.jpg");
//        通过字节输入流创建一个BufferedImage对象
        InputStream input = new FileInputStream(srcFile);
        BufferedImage srcImg = ImageIO.read(input);
        int width = srcImg.getWidth();
        int height = srcImg.getHeight();
        System.out.println("原图宽："+width+",原图高："+height);
        File destFile = new File("D:/bg1.jpg");
//        水印颜色
        Color color = new Color(0,0,0);
//        水印字体大小颜色
        int size =20;
        Font font =new Font("微软雅黑",Font.BOLD,25);
//        写入文件
        String  text = "Spring AOP水印";
        ImageUtil.pressText(srcFile,destFile,text,color,font,(width -  text.length()* size)/2,height/2 - size,1.0f);
    }
//    后置类
    @AfterReturning("handleImage()")
    public void  grayImage(){
        logger.info("开始将图片转成黑白");
        File srcFile = new File("E:/bg.jpg");
        File destFile = new File("E:/bg1.jpg");
        ImageUtil.gray(srcFile,destFile);
    }
}
