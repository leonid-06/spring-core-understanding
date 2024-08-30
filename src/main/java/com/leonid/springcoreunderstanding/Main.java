package com.leonid.springcoreunderstanding;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Person person = annotationConfigApplicationContext.getBean("china", Person.class);
        System.out.println(person);
    }
}
