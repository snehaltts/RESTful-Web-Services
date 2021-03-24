package com.ltts.Microserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicroserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserverApplication.class, args);
	}

}
