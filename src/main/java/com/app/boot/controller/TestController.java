package com.app.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description
 * @author:ligang
 * @date: 2022/10/25/ 22:24
 **/

@RestController
public class TestController {

        @RequestMapping("wel")
        public String hello()   {
            return "welcome";
        }

}
