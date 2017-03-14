package com.bokesoft.cloud_server_B;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class ServerBApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ServerBApplication.class).web(true).run(args);
	}

}
