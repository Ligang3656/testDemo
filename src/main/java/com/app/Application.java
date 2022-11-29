package com.app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

/**
 * @description
 * @author:ligang
 * @date: 2022/10/25/ 21:39
 **/

@SpringBootApplication
//@PropertySource ("app.properties")
public class Application {
    public static void main(String[] args) throws IOException {
        SpringApplication springApplication = new SpringApplication(Application.class);
/*//      创建properties对象
        Properties properties = new Properties();
//      通过当前类的ClassLoader
        InputStream inputStream=Application.class.getClassLoader().getResourceAsStream("application.properties");
//      将输入流读取成properties
        properties.load(inputStream);

        springApplication.setDefaultProperties(properties);*/
        springApplication.run(args);
//      SpringApplication.run(Application.class,args);
    }
}
