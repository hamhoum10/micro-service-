package tn.esprit.MicroChat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroChatApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroChatApplication.class, args);
    }

}
