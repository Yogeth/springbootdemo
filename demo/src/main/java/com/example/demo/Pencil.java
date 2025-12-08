package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Pencil implements Writer{
  public void writing(){
    System.out.println("writing using pencil ")
  }
}