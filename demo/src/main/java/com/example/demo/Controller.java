package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller{
  @GetMapping("/greet")
  String greet(){
    return "welcome.iam YOGETH😃";
  }
}