- Apache Kafka 分布式消息队列中间件安装与配置
 - http://blog.csdn.net/wangjia184/article/details/37921183
- 操作步骤
 - 启动`cloud-eureka-server`注册发现中心
 - 修改`cloud-config-server`工程`pom`中引入
        `<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-bus-kafka</artifactId>
		</dependency>`
 - 启动`cloud-config-server`配置中心
 - 修改`cloud-serverclient-bus-kafka` 工程`application.properties`中`server.port`值；启动三次；
 - 访问`/from`请求，查看页面中返回的信息；
 - 对应修改`cloud-config-server`中from值；再次查看页面返回内容，没有变化；post请求`/bus/refresh`后查看值变化;同rabbitmq操作
 - 启动zookeeper `zookeeper-server-start config/zookeeper.properties`
 - 启动kafka`kafka-server-start config/server.properties`
 - 查看当前kafka的Topic`kafka-topics --list --zookeeper localhost:2181`
 - 注意：
  - `<!-- 这个版本对bus的refresh不支持整体刷新 -->
	<version>Camden.SR5</version>
	<!-- 这个版本支持bus的refresh整体刷新;但集成kafka会报java.lang.ClassNotFoundException: kafka.serializer.Decoder错误；请使用两者兼容版本-->
	<!-- <version>Brixton.SR5</version> -->`