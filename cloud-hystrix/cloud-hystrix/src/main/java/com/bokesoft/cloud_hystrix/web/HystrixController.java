package com.bokesoft.cloud_hystrix.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bokesoft.cloud_hystrix.service.HystrixService;

@RestController
public class HystrixController {
	@Autowired
	private HystrixService hystrixService;

	@RequestMapping(value = "/add1", method = RequestMethod.GET)
	public String add(@RequestParam Long a,@RequestParam Long b) {
		return this.hystrixService.add1(a, b);
	}
	
	@RequestMapping(value = "/add2", method = RequestMethod.GET)
	public String add() {
		return this.hystrixService.add2();
	}
}
