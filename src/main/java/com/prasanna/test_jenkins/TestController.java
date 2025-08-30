package com.prasanna.test_jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class TestController {

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello I am from the Spring boot app !";
    }

    @GetMapping("/test-1")
    public String testApi(){
        return "Test controller !";
    }

}
