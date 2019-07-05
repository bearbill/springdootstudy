package com.lele.springdootstudy;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication()
@ComponentScan("com.lele.*")
public class SpringdootstudyApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringdootstudyApplication.class, args);
    }

}
