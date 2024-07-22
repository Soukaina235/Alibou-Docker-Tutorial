package com.soukaina.demoapplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    // to insert a new line into our table
    @Bean
    public CommandLineRunner commandLineRunner(DemoRepository repository) {
        return args -> {
            repository.save(new DemoEntity("Docker", "Docker is very useful"));
        };
    }
}
