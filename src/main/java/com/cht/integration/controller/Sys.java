package com.cht.integration.controller;

import com.cht.integration.bean.User;
import com.cht.integration.constans.Result;
import com.cht.integration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.json.Json;
import javax.json.JsonObject;

/**
 * com.cht.integration.controller
 *
 * @author chenhaiting
 * @name Sys
 * @description
 * @date 2018-04-30 20:10
 * <p>
 * <p>
 * Copyright (c) 2018   版权所有
 */
@Controller
@RequestMapping("sys")
public class Sys {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public String login(User user, Model model){
        System.out.println(user.toString());
        model.addAttribute("message",user);
        return "registerSuccess";
    }


    /**
     * @param user
     * @return
     */
    @PostMapping("/register")
    @ResponseBody
    public Result register(@RequestBody User user){
        Result result = null;
        System.out.println(user.toString());
        try {
            int addNum = userService.add(user);
            if(addNum <= 0){
                result = new Result("500","添加失败","");
            }else{
                result = new Result("200","添加成功","");
            }
        } catch (Exception e) {
            e.printStackTrace();
            result = new Result("500","添加失败","");
        }
        return result;
    }


}
