package com.leonid.springcoreunderstanding;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext("com.leonid.springcoreunderstanding");

        Person person = annotationConfigApplicationContext.getBean(Person.class);
        System.out.println(person);
    }
}
