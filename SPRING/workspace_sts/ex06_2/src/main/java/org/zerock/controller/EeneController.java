package org.zerock.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.domain.EeneVO;
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
	
//	@GetMapping("/testRead")
//	public void testRead(
////			@RequestParam(name = "name") String name
////			, @RequestParam(name = "location") String location
//			
////			@RequestParam Map map
//	
//			EeneVO eeneVO
//			) {
////		log.info("*******name" + name);
////		log.info("*******location" + location);
//		
////		log.info("*******name" + map.get("name"));
////		log.info("*******location" + map.get("location"));
//		
//		log.info("*******bno" + eeneVO.getBno());
//		log.info("*******eewriter" + eeneVO.getEewriter());
//		
//		eeneService.testRead();
//	}
	
	@PostMapping("/testRead")
	public void testRead(EeneVO eeneVO) {
		log.info("*******bno" + eeneVO.getBno());
		log.info("*******eewriter" + eeneVO.getEewriter());
		
		eeneService.testRead();
	}
	
	@PostMapping("/insert")
	public void insert(EeneVO eeneVO) {
		log.info(this);
		eeneService.insert(eeneVO);
	}

}
