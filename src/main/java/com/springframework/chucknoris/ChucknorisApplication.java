package com.springframework.chucknoris;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class ChucknorisApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChucknorisApplication.class, args);
    }

}
