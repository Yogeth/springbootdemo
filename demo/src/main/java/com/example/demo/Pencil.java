package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;

@Component
@Primary
public class Pencil implements Writer{
  public void writing(){
    System.out.println("writing using pencil ");
  }
}