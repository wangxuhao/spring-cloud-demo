package com.bokesoft.cloud_server_yigo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;
import org.springframework.context.annotation.Bean;

import com.bokesoft.cloud_server_yigo.cassandra.CassandraHealthCheckHandler;
import com.netflix.appinfo.HealthCheckHandler;

@EnableSidecar
@SpringBootApplication
public class ServerYigoApp {
	public static void main(String[] args) {
		 new SpringApplicationBuilder(ServerYigoApp.class).web(true).run(args);
	}

	@Bean
    public HealthCheckHandler healthCheckHandler() {
        return new CassandraHealthCheckHandler();
    }
}
