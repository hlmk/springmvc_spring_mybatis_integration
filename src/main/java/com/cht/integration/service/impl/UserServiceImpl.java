package com.cht.integration.service.impl;

import com.cht.integration.bean.User;
import com.cht.integration.dao.UserDao;
import com.cht.integration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * com.cht.integration.service.impl
 *
 * @author chenhaiting
 * @name UserServiceImpl
 * @description
 * @date 2018-05-01 17:24
 * <p>
 * <p>
 * Copyright (c) 2018  版权所有
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public int add(User user) {
//        int i = 1/0;//测试事务是否有效
        return userDao.add(user);
    }

    @Override
    public int delete(Integer id) {
        return userDao.delete(id);
    }

    @Override
    public int update(User user) {
        return userDao.update(user);
    }

    @Override
    public List<User> get(User user) {
        return userDao.get(user);
    }
}
