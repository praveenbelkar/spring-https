package com.praveen.httpsexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class SecureWorldController {

    @GetMapping
    public String hello() {
        return "Hello Secure World";
    }
}
