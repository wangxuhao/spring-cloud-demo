package com.bokesoft.cloud_server_A.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CallServerB {
	@Autowired
	RestTemplate restTemplate;
	@RequestMapping(value="callServiceB", method=RequestMethod.GET)
	public String invokeServiceB(@RequestParam Integer a, @RequestParam Integer b){
//		return restTemplate.getForObject("http://wangxh.bokesoft.com:4444/add?a="+a+"&b="+b, String.class);
		return restTemplate.getForEntity("http://RIBBON-CONSUMER/add?a="+a+"&b="+b, String.class).getBody();
	}
}
