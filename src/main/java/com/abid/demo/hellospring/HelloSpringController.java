package com.abid.demo.hellospring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringController {

	@RequestMapping("/helloworld")
	public String helloByName() {
		System.out.println("recieving a request in Abids App....");
		return "helloIndia";
	}
}
