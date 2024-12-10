package com.anwar.blog;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BlogApplicationApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogApplicationApiApplication.class, args);
    }
    //@Bean should not be declared within the main method

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}

