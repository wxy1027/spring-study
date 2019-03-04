package com.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
/*指定单元测试环境*/
@RunWith(SpringJUnit4ClassRunner.class)
/*指定配置文件路径*/
@ContextConfiguration(locations = {"/bean.xml"})

public class MaxTest {
/*自动注入max*/
    @Autowired
    private Max max;

    @Test
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/bean.xml");
        Max max = (Max) context.getBean(Max.class);
        System.out.println(max.getMax());
    }

}