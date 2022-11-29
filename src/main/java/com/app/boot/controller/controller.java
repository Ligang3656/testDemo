package com.app.boot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description
 * @author:ligang
 * @date: 2022/10/25/ 22:17
 **/


@RestController
public class controller {
    @Value("${self.message.data}")
    private String value;
//  @RequestMapping(value = "hello",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//  当配置的返回对象是我们自定义的属性时，而且是String时，需要指定解析类型，处理编码问题
    @RequestMapping(value = "hello")
    /*
   这里的controller类，必须在Application类的同级文件目录下，mapping地址才生效
    */
    public String hello(){
        return value;
    }
}
