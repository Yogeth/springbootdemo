package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Book{
  @Autowired
  @Qualifier("chalk")
  private Writer writer;
  void papper(){
    writer.writing();
  }
}