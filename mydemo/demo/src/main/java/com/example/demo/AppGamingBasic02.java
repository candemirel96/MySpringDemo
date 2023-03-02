package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingBasic02 {

    public static void main(String[] args) {

        //Launch a Spring Context

        var context = new AnnotationConfigApplicationContext(HelloWorldCOnfiguration.class);

        //Configure the things that we want Spring to manage - @Configuration

        //retreiving Beans managed by String
        System.out.println(context.getBean("name"));

    }

}

