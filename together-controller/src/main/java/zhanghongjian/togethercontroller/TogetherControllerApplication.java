package zhanghongjian.togethercontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TogetherControllerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TogetherControllerApplication.class, args);
    }

}
