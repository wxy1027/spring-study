package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class meetingApp {
    public static void main(String[] args) {
        @SuppressWarnings("sources")
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Meeting meeting = context.getBean(Meeting.class);
        System.out.println(meeting);

    }
}
