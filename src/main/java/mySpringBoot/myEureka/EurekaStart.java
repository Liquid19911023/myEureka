package mySpringBoot.myEureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 服务注册中心
 * @author Administrator
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaStart {
    public static void main( String[] args ){
        SpringApplication.run(EurekaStart.class, args);
    }
}
