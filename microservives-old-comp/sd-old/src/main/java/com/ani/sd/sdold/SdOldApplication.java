package com.ani.sd.sdold;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SdOldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SdOldApplication.class, args);
	}

}
