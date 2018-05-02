package com.cht.integration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * com.cht.integration.controller
 *
 * @author chenhaiting
 * @name com.cht.integration.controller.Hello
 * @description
 * @date 2018-04-30 18:11
 * <p>
 * <p>
 * Copyright (c) 2018   版权所有
 */
@Controller
@RequestMapping("hello")
public class Hello {

    @RequestMapping("/test")
    public String toHello(){
        System.out.println("springmvc与spring整合成功！");
        return "hello";
    }

}
