package com.kasi.fruit.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:spring/dubbo-customer.xml")
public class FruitCustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FruitCustomerApplication.class, args);
    }
}
