package ru.basanov.appproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class AppProxyApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppProxyApplication.class, args);
    }

}
