package com.bokesoft.cloud_hystrix_dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrix  
@EnableHystrixDashboard
@SpringBootApplication
@EnableDiscoveryClient
public class DashBoard 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(DashBoard.class, args);
    }
}
