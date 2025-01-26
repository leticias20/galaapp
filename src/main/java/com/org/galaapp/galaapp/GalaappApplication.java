package com.org.galaapp.galaapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@ComponentScan({"com.org.galaapp"})
@EntityScan("com.org.galaapp.entity")
@EnableJpaRepositories("com.org.galaapp.repository")
@SpringBootApplication()
public class GalaappApplication {

	public static void main(String[] args) {
		SpringApplication.run(GalaappApplication.class, args);
	}

}
