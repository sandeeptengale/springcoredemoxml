package com.sandeep.javaconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.sandeep.javaconfig")
@PropertySource("classpath:info.properties")
public class InfoConfig {

}
