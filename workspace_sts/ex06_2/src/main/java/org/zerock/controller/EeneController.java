package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.service.BoardService;
import org.zerock.service.EeneService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/eene/*")
@AllArgsConstructor
public class EeneController {
	
	private EeneService eeneService;
	
	@GetMapping("/testRead")
	public void testRead() {
		eeneService.testRead();
	}

}
