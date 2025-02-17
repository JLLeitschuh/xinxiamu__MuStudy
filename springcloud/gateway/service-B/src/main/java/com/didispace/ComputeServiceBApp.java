package com.didispace;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ComputeServiceBApp {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ComputeServiceBApp.class).web(true).run(args);
	}

}
