
package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;


@Component
public class Student{
  //field injection 
//  @Autowired
  private Pen pen;
  //setter injection
  @Autowired
  public void setPen(Pen pen){
    this.pen=pen;
  }
  public void note(){
    System.out.println("im note book");
    pen.write();
  }
}