package com.bokesoft.cloud_eureka_server1_cluster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerClusterApp 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(EurekaServerClusterApp.class, args);
    }
}
