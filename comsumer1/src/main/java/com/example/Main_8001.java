package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableEurekaClient   //使用eureka作为注册中心
@EnableFeignClients      //使用feign实现消费
@EnableCircuitBreaker //能使用熔断器
@EnableZuulProxy //能使用zuul网关
public class Main_8001 {
    public static void main(String[] args) {
        SpringApplication.run(Main_8001.class,args);
    }

//    @Bean
//    public ServletRegistrationBean getservlet(){
//        HystrixMetricsStreamServlet hystrixMetricsStreamServlet = new HystrixMetricsStreamServlet();
//        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(hystrixMetricsStreamServlet);
//        servletRegistrationBean.setLoadOnStartup(1);
//        servletRegistrationBean.addUrlMappings("/hystrix.stream");
//        servletRegistrationBean.setName("hystrix");
//        return servletRegistrationBean;
//    }

}
