package com.yee.spring5x.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yusheng
 * @version 1.0.0
 * @datetime 2020/10/3 12:29
 */
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        //返回hello页面
        return  "hello";
    }

    @GetMapping("/hello2")
    @ResponseBody
    public String hello2(){
        //返回字符串
        return  "hello2 字符串";
    }

}
