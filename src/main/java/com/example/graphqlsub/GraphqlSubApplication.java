package com.example.graphqlsub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableWebFlux
public class GraphqlSubApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraphqlSubApplication.class, args);
    }

}
