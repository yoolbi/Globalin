package com.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.mvc.domain.PostDTO"})
public class MelodytalkApplication {

	public static void main(String[] args) {
		SpringApplication.run(MelodytalkApplication.class, args);
	}

}
