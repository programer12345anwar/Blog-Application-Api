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
    //@Bean should not be declared within the main method ,we declare in this class b'z of @SpringBootApplication or we can create 
    //a separate class for bead declaration

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}

