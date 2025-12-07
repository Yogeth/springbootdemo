package com.example.demo;

/*import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/greet")
    public String greet() {
        return "welcome.Iam Yogeth😃";
    }
}
*/
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;

@Component
@Scope("singleton")// dont create new object for every refereces one object can share by multiple Beans.
//@Scope("prototype")//creates new beans every time when creating new references .
public class Controller{
    public int age;
    void greet(){
        System.out.println("Hello World");
    }
}