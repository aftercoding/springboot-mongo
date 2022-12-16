package com.sean.springbootmongodbdemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @description: some desc
 * @author: congjun
 * @email: 66@7788.com
 * @date: 2022-12-08 14:49
 */
@Controller
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyController {
    @Autowired
    MyService userService;
    public String control(){

        return userService.serve();
    }
}
