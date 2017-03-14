package com.bokesoft.cloud_netflix_ribbon.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NetflixFeignClient {

	@Autowired
	ServerBClient serverBClient;
	
	@Autowired 
	ServerAClient serverAClient;

	// feign引入`APPLICATION NAME = SERVICE-B`的服务
	@FeignClient(name = "SERVICE-B")
	interface ServerBClient {
		@RequestMapping(value = "/add", method = RequestMethod.GET)
		String add(@RequestParam Map<String, Object> map);
	}
	// feign引入`APPLICATION NAME = DIDISPACE`的服务
	@FeignClient(name = "DIDISPACE")
	interface ServerAClient {
		@RequestMapping(value = "/callServiceB", method = RequestMethod.GET)
		String invokeServiceB(@RequestParam Map<String, Object> map);
	}

	@RequestMapping(value = "/callServerB", method = RequestMethod.GET)
	public String callServerB(@RequestParam Integer a, @RequestParam Integer b) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("a", a);
		map.put("b", b);
		return serverBClient.add(map);
	}
	
	@RequestMapping(value = "/callServerA", method = RequestMethod.GET)
	public String callServerA(@RequestParam Integer a, @RequestParam Integer b) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("a", a);
		map.put("b", b);
		return serverAClient.invokeServiceB(map);
	}
	

//	 @FeignClient(name = "SERVICE-B")
//	 interface HelloClient {
//	 @RequestMapping(value="/", method = RequestMethod.GET)
//	 String index();
//	 }
//	
//	 @RequestMapping(value="/index", method = RequestMethod.GET)
//	 public String index() {
//	 return client.index();
//	 }
}
