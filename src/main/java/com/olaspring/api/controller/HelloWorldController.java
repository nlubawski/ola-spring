package com.olaspring.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

  @GetMapping
  public String getHelloWorld(){
    return "Olá Spring"; 
  }
}
