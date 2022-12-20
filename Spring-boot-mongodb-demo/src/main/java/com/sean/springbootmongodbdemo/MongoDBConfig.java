package com.sean.springbootmongodbdemo;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @description: some desc
 * @author: congjun
 * @email: 66@7788.com
 * @date: 2022-12-07 19:56
 */
@Configuration
//@Component
public class MongoDBConfig {
    @Bean
    public MongoClient mongoClient() {
        MongoClient m = MongoClients.create("mongodb://8.134.161.68:27017");
        return m;
    }
    @Bean
    public MongoTemplate mongoTemplate() {
        MongoTemplate mt = new MongoTemplate(mongoClient(), "test");
        return mt;
    }

//    @Bean
//    public Student student() {
//        return new Student();
//    }
}
