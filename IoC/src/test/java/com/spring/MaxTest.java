package com.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.logging.Logger;

import static org.junit.Assert.*;
/*指定单元测试环境*/
@RunWith(SpringJUnit4ClassRunner.class)
/*指定配置文件路径*/
@ContextConfiguration(locations = {"/bean.xml"})

public class MaxTest {

@Autowired
private Max max;
    @Test
    public void getMax() {
       assertEquals(20,max.getMax());
    }

}