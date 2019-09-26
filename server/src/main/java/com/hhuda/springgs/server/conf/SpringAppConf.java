package com.hhuda.springgs.server.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringAppConf {
    @Value("appName")
    private String appName;

    @Bean
    public String getAppName(){
        return appName;
    }

    @Bean
    public io.opentracing.Tracer tracer() {
        //return //new // tracer instance of your choice (Zipkin, Jaeger, LightStep)
        return null;
    }
}
