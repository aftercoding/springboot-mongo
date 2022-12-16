package com.sean.springbootmongodbdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @description: some desc
 * @author: congjun
 * @email: 66@7788.com
 * @date: 2022-12-07 20:28
 */
//@Controller
@Service
public class DBTest {
//    @Autowired
//    private MongoTemplate mongoTemplate;
    @Autowired
    Student s;
    public void test(){
//        mongoTemplate.createCollection("products");
        s.learning();
    }
    public DBTest(){

    }
}
