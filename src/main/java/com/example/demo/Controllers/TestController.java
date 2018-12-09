package com.example.demo.Controllers;

import com.example.demo.Models.Test;
import com.example.demo.Services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService testService;
    @RequestMapping(method = RequestMethod.POST, value = "/test")
    public void createTestObject(@RequestBody Test test) {
        testService.addTest(test);
    }
}