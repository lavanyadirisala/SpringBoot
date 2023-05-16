package com.springboot.learn.CourseAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//servlet container
@SpringBootApplication
public class CourseAPIApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseAPIApplication.class, args);
		System.out.print("Starting up here");
	}

}
