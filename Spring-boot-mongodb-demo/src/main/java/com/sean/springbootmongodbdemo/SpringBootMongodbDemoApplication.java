package com.sean.springbootmongodbdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@ComponentScan("com.sean")
//@Controller
public class SpringBootMongodbDemoApplication {
    @Autowired
    private MyController myController;
    public static void main(String[] args) {
        SpringApplication.run(SpringBootMongodbDemoApplication.class, args);
//        DBTest dt = new DBTest();
//        dt.test();
//        MyService myService = new MyService();
//        myService.serve();
//        myController.control();

    }

}
