package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;*/

//mvn spring-boot:run

@SpringBootApplication
//@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	/*@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "WorldRaciel") String name){
		return String.format("Hello %s!", name);
	}*/

}
	/*<dependency>
  			<groupId>org.springframework.boot</groupId>
 		    <artifactId>spring-boot-starter-jdbc</artifactId>
	   </dependency>*/