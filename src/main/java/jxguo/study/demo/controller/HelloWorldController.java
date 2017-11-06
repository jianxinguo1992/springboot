package jxguo.study.demo.controller;


import jxguo.study.demo.configuration.Properties;
import jxguo.study.demo.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String index(){
        return new Properties().getTitle();
    }

    @RequestMapping("/getUser")
    public User getUser(){
        User user = new User("张三","123456");
        return user;
    }
}
