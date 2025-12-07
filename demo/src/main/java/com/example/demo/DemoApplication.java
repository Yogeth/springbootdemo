package com.example.demo;
// applcon
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(DemoApplication.class, args);
		Controller con=context.getBean(Controller.class);
		
		con.age=45;
		con.greet();
		Controller con2=context.getBean(Controller.class);
		System.out.print(con.age+":"+con2.age);
	}

}
