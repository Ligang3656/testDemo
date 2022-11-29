package com.app.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description
 * @author: ligang
 * @date: 2022/10/26/ 00:18
 **/

@Controller
//这里的注解必须换成Controller，而不是RestController，因为RestController等于
// ResponseBody和Controller的结合，不会调用 springMVC 的 ViewResolver（视图解析器）
public class PageController {
    @RequestMapping("/index.html")
public String index(){
    return "index";
}

}
