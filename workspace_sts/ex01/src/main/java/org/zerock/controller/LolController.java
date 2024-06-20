package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.domain.LolDTO;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/lol/*")
@Log4j
public class LolController {
	
	@GetMapping("/get")
	public String get(@RequestParam("lolID") String lolID, @RequestParam("tier") String tier) {
		//http://localhost:8080/lol/get?lolID=123&tier=gold
		log.info("lolID: " + lolID);
		log.info("tier: " + tier);

		return "get";
	}
	
	@GetMapping("/info")
	//http://localhost:8080/lol/info?lolID=123&tier=gold
	public String info(LolDTO dto) {
		log.info("" + dto);
		return "info";
	}
	
	@PostMapping("/info")
	public String info2(LolDTO dto) {
		log.info("" + dto);
		return "info";
	}

}
