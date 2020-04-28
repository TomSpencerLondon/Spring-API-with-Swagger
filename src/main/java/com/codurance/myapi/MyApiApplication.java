package com.codurance.myapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class MyApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(MyApiApplication.class, args);
	}
}
