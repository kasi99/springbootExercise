package com.kasi.fruit.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = "classpath:spring/fruit-provider.xml")
public class FruitProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(FruitProviderApplication.class, args);
    }
}
