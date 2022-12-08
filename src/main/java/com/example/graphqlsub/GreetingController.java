package com.example.graphqlsub;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SubscriptionMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.time.Instant;
import java.util.stream.Stream;

@Controller
public class GreetingController {
    @QueryMapping
    String sayHello() {
        return "Hello!";
    }

    @SubscriptionMapping
    Flux<String> greeting(@Argument int count) {
        return Flux.fromStream(Stream.generate(() -> "Hello @ " + Instant.now()))
                .delayElements(Duration.ofSeconds(1))
                .take(count);
    }
}
