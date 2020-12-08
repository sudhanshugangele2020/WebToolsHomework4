package edu.neu.hw4Q6.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import org.springframework.web.servlet.view.InternalResourceViewResolver;

import edu.neu.hw4Q6.interceptor.XssInterceptor;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "edu.neu.hw4Q6")
public class WebConfig implements WebMvcConfigurer {
    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/jsp/");
        viewResolver.setSuffix(".jsp");

        return viewResolver;
    }
    
    @Override
	public void addInterceptors(InterceptorRegistry registry) {
    	registry.addInterceptor(new XssInterceptor());
    }

}