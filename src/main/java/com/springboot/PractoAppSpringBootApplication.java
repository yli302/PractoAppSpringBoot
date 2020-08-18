package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = "classpath:/application-${spring.profile.active}.properties")
public class PractoAppSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(PractoAppSpringBootApplication.class, args);
	}

}
