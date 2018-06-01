package com.kim.another;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.goalkeeper.hcb.security"}) 
public class AnotherRestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnotherRestServiceApplication.class, args);
	}
}
