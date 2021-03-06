package com.springwebflux.bootcamp.service.bussines.app;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class SpringwebfluxBootcampServiceBusinessApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringwebfluxBootcampServiceBusinessApplication.class, args);
	}

}
