package com.example.demo;
import org.springframework.web.bind.annotation.GetMa    pping;
import org.springframework.web.bind.annotation.RestC    ontroller;

@RestController
public class Controller{
  @GetMapping("/greet")
  String greet(){
    return "welcome.iam YOGETH😃";
  }
}