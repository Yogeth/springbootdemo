
package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;


@Component
public class Student{
  //field injection 
 @Autowired
  private Pen pen;
  //setter injection
 @Autowired
  public void setPen(Pen pen){
    System.out.println("this is setter injection❕");
    this.pen=pen;
  } 
  //constructor injection
  @Autowired
  Student(Pen pen){
    System.out.println("This is constructor injecton✨!!");
    this.pen=pen;
  }
  
  public void note(){
    System.out.println("im note book");
    pen.write();
  }
}