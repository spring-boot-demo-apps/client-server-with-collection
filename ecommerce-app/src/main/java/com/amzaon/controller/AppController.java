package com.amzaon.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/rest")
public class AppController {

    // http: GET, POST, PUT, DELETE, PATCH
    // rest/active
    @GetMapping("/active")
    public String showResponse()
    {
        return new Date().toString();
    }
}
