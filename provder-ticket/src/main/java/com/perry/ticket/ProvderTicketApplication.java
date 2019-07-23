package com.perry.ticket;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProvderTicketApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProvderTicketApplication.class, args);
    }

}
