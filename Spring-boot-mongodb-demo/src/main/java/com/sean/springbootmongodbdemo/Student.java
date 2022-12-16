package com.sean.springbootmongodbdemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @description: some desc
 * @author: congjun
 * @email: 66@7788.com
 * @date: 2022-12-08 12:52
 */
@Service
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    private int ID;
    public void learning(){
        System.out.println("i am learning !");
    }
}
