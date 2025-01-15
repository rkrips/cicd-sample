package com.rkrips.cicd_sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CicdSampleApplication {

	public static void main(String[] args) {
		System.out.println("Hello");
		SpringApplication.run(CicdSampleApplication.class, args);
	}

}
