package com.springboot.studyjihun.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MethodStudyController {
	@GetMapping({"/", "/index"})
	public String getMethod() {
		return "method/get";
	}
}
