package com.yojik.spring.security.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.yojik.spring.security")
@EnableWebMvc
public class MyConfig {

    @Bean
    public ViewResolver viewResolveriewResolver(){
        ViewResolver viewResolver = new InternalResourceViewResolver("/WEB-INF/view/",".jsp");
        return viewResolver;
    }
}
