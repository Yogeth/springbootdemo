package com.example.demo;
import org.springframework.stereotype.Component;

@Component
pubilc class Chalk implements Writer{
  public void writing(){
    System.out.println("writing using chalk piece !!");
  }
}