package com.bokesoft.cloud_hystrix_dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableCircuitBreaker
@EnableHystrixDashboard
@Controller
public class HystrixDashboardApp {
	@RequestMapping("/")
	public String home() {
		return "forward:/hystrix";
	}

	public static void main(String[] args) {
		SpringApplication.run(HystrixDashboardApp.class, args);
	}
}
