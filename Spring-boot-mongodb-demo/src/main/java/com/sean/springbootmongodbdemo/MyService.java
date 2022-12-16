package com.sean.springbootmongodbdemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: some desc
 * @author: congjun
 * @email: 66@7788.com
 * @date: 2022-12-08 14:47
 */
@Service
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyService {
    @Autowired
    MyComponent myComponent;
    public  String serve(){
        myComponent.doWork();
        return "success!";
    }
}
