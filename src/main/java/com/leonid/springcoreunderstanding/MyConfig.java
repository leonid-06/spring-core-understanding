package com.leonid.springcoreunderstanding;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public Person person2() {
        return new Person("Leo", 20);
    }

    @Bean(name = "china")
    public Person person1() {
        return new Person("MEo", 20);
    }
}
