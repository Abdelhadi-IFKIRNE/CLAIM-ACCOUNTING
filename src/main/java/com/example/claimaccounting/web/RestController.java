package com.example.claimaccounting.web;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/")
    public String getMessage(){
        return "CLAIM ACCOUNTING START ....";
    }
}
