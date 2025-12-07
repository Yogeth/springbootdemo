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
@Component
public class Controller{
    void greet(){
        return "Hello World !";
    }
}