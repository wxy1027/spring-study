package com.spring;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;
import cn.hutool.extra.qrcode.QrConfig;
import sun.security.krb5.Config;

import java.awt.*;

public class QrCodeTest {
    public static void main(String[] args) {
        QrConfig config = new QrConfig(300,300);
        config.setMargin(3);
        Color foreColor =new Color(224,64,251);
        Color bgColor = new Color(132,112,255);
        int foreColorRGB = foreColor.getRGB();
        int bgColorRGB = bgColor.getRGB();
        config.setForeColor(foreColorRGB);
        config.setBackColor(bgColorRGB);
        QrCodeUtil.generate("https://www.jianshu.com/u/feefa6f6349c",config, FileUtil.file("d:/my_code.jpg"));
        QrCodeUtil.generate(//
                "https://www.jianshu.com/u/feefa6f6349c", //二维码内容
                QrConfig.create().setImg("d:/my_head.png"), //附带logo
                FileUtil.file("d:/my_code.jpg")//写出到的文件
        );







    }
}
