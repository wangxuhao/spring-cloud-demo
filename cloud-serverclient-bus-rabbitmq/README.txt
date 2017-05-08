+ 介绍
 - spring-cloud-bus 消息总线(集成rabbitmq)
  - 集成需要依赖`spring-cloud-starter-bus-amqp`
  - `Camden.SR5`版本有问题， `Spring cloud bus refresh doesnt work with local repository`,
  无法刷新一个实例，所有实例都跟着更新；后来换成`Brixton.SR5`版本；
  参考:`https://github.com/spring-cloud/spring-cloud-config/issues/196`解决
  - 需要安装`rabbitmq`
  - 配置`rabbitmq`
  - 修改`bootstrap.properties`中`server.port`,启动两个实例，修改`cloud-config-server`中对应的配置的参数值，
           执行`localhost:${server.port}/bus/refresh`，然后分别访问两个实例；`localhost:${server.port}/from`查看值；
  - `/bus/refresh`默认更新所有的集群应用； 如果只想更新指定应用，可以使用`/bus/refresh?destination=${spring.application.name}:${server.port}`来更新指定的应用
  