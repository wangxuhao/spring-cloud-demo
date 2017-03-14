## spring-cloud 调研demo ##

每个目录为单个eclipse项目
- 
- `cloud-config-server`：配置中心
- `cloud-eureka-server`： 发现中心
- `cloud-service-B`：提供服务`SERVICE-B`(提供一个add加法接口)
- `cloud-service-B2`：提供服务`SERVICE-B`(提供一个add加法接口)
- `cloud-netflix-ribbon`：提供服务`RIBBON-CONSUMER`;使用`@EnableFeignClients`
	- `ConsumerController.java` 使用了`RestTemplate`调用`SERVICE-B`的`add`接口
	- `NetflixFeignClient.java`使用了Netflix-feignClient`@FeignClient`调用`SERVICE-B`服务的`add`接口
- `cloud-service-A`：提供服务`DIDISPACE`;
	- `TestController.java`使用了配置中心的配置;
	- `CallServerB.java`使用`RestTemplate`调用`RIBBON-CONSUMER`服务的add接口
- `cloud-netflix-zuul` : 提供服务 `API-GATEWAY`(路由服务)
- `cloud-hystrix` : 提供服务`HYSTRIX`(熔断服务)
- `cloud-hystrix-dashboard`：提供服务`HYSTRIX-DASHBOARD`(熔断服务监控)