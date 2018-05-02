package com.cht.integration.service;

import com.cht.integration.bean.User;

import java.util.List;

/**
 * com.cht.integration.service
 *
 * @author chenhaiting
 * @name UserService
 * @description
 * @date 2018-05-01 17:22
 * <p>
 * <p>
 * Copyright (c) 2018  版权所有
 */
public interface UserService {

    int add(User user);

    int  delete(Integer id);

    int update(User user);

    List<User> get(User user);

}
