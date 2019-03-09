package com.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserDaoImpl implements UserDao {
    private static final Logger logger= LoggerFactory.getLogger(UserDaoImpl.class);
    @Override
    public void insert() {
        logger.info("开始插入一条数据。。。");
    }
}
