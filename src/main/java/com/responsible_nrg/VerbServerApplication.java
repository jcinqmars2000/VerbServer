package com.responsible_nrg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class VerbServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(VerbServerApplication.class, args);
	}
}
