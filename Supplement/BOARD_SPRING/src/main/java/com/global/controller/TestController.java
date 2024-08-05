package com.global.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.global.service.TestService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/test/*")
@AllArgsConstructor
public class TestController {
	
	private TestService testService;
	
	@GetMapping("/")
	public String test(Model model) {
		log.info(this);
		model.addAttribute("now", testService.getNow());
		return "test";
	}

}
