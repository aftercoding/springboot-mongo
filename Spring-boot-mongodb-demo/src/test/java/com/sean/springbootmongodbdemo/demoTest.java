package com.sean.springbootmongodbdemo;

import com.sean.springbootmongodbdemo.SpringBootMongodbDemoApplicationTests;
import com.sean.springbootmongodbdemo.MyComponent;
import com.sean.springbootmongodbdemo.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @description: some desc
 * @author: congjun
 * @email: 66@7788.com
 * @date: 2022-12-15 23:45
 */

public class demoTest extends SpringBootMongodbDemoApplicationTests {
    @Autowired
    private MyController myController;
    @Test
    public void test(){
        myController.control();
    }
}
