package com.example.springBoot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
      @RequestMapping(method=RequestMethod.GET,produces = "/hello-world")
	 public String helloWorld() {
		 //devlop
		 return "Hello World";
		 
	 }
}
