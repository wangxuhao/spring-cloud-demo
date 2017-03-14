package com.bokesoft.cloud_hystrix.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HystrixService {
	@Autowired
	private RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "fallback1")
	public String add1(Long a, Long b) {
		return restTemplate.getForEntity("http://SERVICE-B/add?a=" + a + "&b=" + b, String.class).getBody();
	}

	public String fallback1(Long a, Long b) {
		return "fall1";
	}
	
	@HystrixCommand(fallbackMethod = "fallback2")
	public String add2() {
		return restTemplate.getForEntity("http://SERVICE-B/add?a=" + 1 + "&b=" + 1, String.class).getBody();
	}

	public String fallback2() {
		return "fall2";
	}
	
}
