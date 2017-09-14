package com.firefighter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Andrew on 6/5/2017.
 */

@SpringBootApplication
@ComponentScan(basePackages = {"com.firefighter.model", "com.firefighter.service", "com.firefighter.repository","com.firefighter.web"})
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Main.class, args);
    }

}
