package com.bokesoft.cloud_serverclient_bus_kafka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServerBusKafkaApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(ServerBusKafkaApplication.class).web(true).run(args);
	}
}
