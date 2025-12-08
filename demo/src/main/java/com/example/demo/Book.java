package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class Book{
  @Autowired
  private Writer writer;
  void papper(){
    writer.writing();
  }
}