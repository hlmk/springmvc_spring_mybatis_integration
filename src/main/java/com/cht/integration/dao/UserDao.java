package com.cht.integration.dao;

import com.cht.integration.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * com.cht.integration.dao
 *
 * @author chenhaiting
 * @name sysDao
 * @description
 * @date 2018-05-01 16:45
 * <p>
 * <p>
 * Copyright (c) 2018  版权所有
 */
@Repository
public interface UserDao {

    int add(User user);

    int delete(Integer id);

    int update(User user);

    List<User> get(User user);
}
