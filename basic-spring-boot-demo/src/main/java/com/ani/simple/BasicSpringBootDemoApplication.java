package com.ani.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import java.util.Arrays;

@SpringBootApplication
public class BasicSpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx  = SpringApplication.run(BasicSpringBootDemoApplication.class, args);

		Arrays.stream(ctx.getBeanDefinitionNames()).forEach( nm -> {
			System.out.println(nm);
		});

		Environment env = ctx.getEnvironment();
		String name = env.getProperty("my.nm");
		System.out.println("name is "+name);
	}

}
