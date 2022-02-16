package com.docker.custompom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CustompomApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustompomApplication.class, args);
	}

	@GetMapping("/index")
	public String indexPage()
	{
		return "Welcome to the Application";
	}

}
