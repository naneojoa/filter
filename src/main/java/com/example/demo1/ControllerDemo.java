package com.example.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
public class ControllerDemo {
	@GetMapping("/index")
	public String index() {
		log.debug("test-----------");
		return "welcome to dongsu CustomFilter comming";
	}
}
