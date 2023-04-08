package com.example.minikubeapp.web;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/echo")
@RestController
public class EchoController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String repeatInputParameter(String param){
        return param;
    }
}
