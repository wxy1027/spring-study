package image;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ImageCopyApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        ImageCopy imageCopy = context . getBean(ImageCopy.class);
//        捕获异常
        try {
            imageCopy.copyImage();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
