package com.cht.integration.vo;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import java.util.Date;

/**
 * com.cht.integration.bean
 *
 * @author chenhaiting
 * @name User
 * @description
 * @date 2018-04-30 20:11
 * <p>
 * <p>
 * Copyright (c) 2018   版权所有
 */
public class User {

    private Integer id;

    private String userName;

    private String password;

    private Integer age;

    @NumberFormat(pattern = "###,###.##")
    private Double height;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", date=" + date +
                '}';
    }
}
