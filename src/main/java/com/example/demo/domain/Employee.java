package com.example.demo.domain;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * Date: 2017/11/16
 * Time: 10:31
 * Email: hyf_spring@163.com
 *
 * @author huyunfan
 */
@Data
public class Employee {
    private String id;
    private String username;
    private String password;

    public Employee() {
        this.setId("testId");
        this.setUsername("testUsername");
        this.setPassword("testPassword");
    }
}
