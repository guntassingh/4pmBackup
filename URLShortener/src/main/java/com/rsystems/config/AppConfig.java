package com.rsystems.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.ticket.springboot.service")
@PropertySource(value = { "classpath:messages.properties" })
public class AppConfig {

	
}
