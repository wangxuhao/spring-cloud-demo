package com.bokesoft.cloud_server_B2;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServerB2Application {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ServerB2Application.class).web(true).run(args);
	}

}
