package com.practise.springboot;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ Author     ：lch
 * @ Date       ：Created on 2020/7/15 14:53
 * @ Description：springboot测试
 */
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello spring boot";
    }
}
