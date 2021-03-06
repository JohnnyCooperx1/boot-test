package com.ez.boottest.boottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@SpringBootApplication
@ComponentScan(basePackages = { "com.ez.boottest.boottest.controller","com.ez.boottest.boottest.dao","com.ez.boottest.boottest.model"} )
public class BootTestApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(BootTestApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BootTestApplication.class);
	}

}
