package com.example.projet_micro_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class ProjetMicroServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjetMicroServiceApplication.class, args);
    }

}
