package com.app.boot.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * @description
 * @author:ligang
 * @date: 2022/10/25/ 22:36
 **/

/*针对springboot的配置，不仅可以通过yml文件，还可以通过注解@SpringBootApplication来实现
* 但需要注意的是，同时设置配置文件，代码配置会覆盖yml配置。
* 因为spring Boot会先加载yml配置文件，然后加载类文件，使用代码内容会覆盖配置文件。
* */
@SpringBootConfiguration
public class WebConfig extends WebMvcConfigurationSupport {

    @Override
    protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        super.configureMessageConverters(converters);
        FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
        FastJsonConfig config = new FastJsonConfig();
        config.setSerializerFeatures(SerializerFeature.PrettyFormat);
        List<MediaType> mediaTypeList = new ArrayList<>();
//        设置编码为utf8


        mediaTypeList.add(MediaType.APPLICATION_JSON_UTF8);
        converter.setSupportedMediaTypes(mediaTypeList);
        converter.setFastJsonConfig(config);
        converters.add(converter);
    }


}
/*public class WebConfig implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {


    @Override
    public void customize(ConfigurableServletWebServerFactory factory) {
//        给代码设置启动端口
        factory.setPort(8888);
    }
    @Bean
    public Person person(){
        Person person = new Person();
        person.setName("里斯");
        return person;
    }
}*/
