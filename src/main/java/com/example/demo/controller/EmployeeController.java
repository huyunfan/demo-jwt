package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Date: 2017/11/16
 * Time: 10:32
 * Email: hyf_spring@163.com
 *
 * @author huyunfan
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {


    @GetMapping("/greeting")
    public String greeting() {
        return "Hello,World!";
    }

}
