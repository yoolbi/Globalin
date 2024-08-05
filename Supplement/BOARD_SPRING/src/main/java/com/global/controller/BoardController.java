package com.global.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.global.service.BoardService;
import com.global.vo.BoardVO;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/board/*")
@AllArgsConstructor
public class BoardController {
	
	private BoardService boardService;
	
	@GetMapping("/insertForm")
	public String insertForm() {
		return "board/insertForm";
	}
	
	@PostMapping("/insert")
	public String insert(BoardVO boardVO) {
		boardService.insert(boardVO);
		return "redirect:/list";
	}

	@GetMapping("/list")
	public String list(Model model, BoardVO boardVO) {
		model.addAttribute("list", boardService.select(boardVO));
		return "board/list";
	}
	
	@GetMapping("/read")
	public String read(Model model, BoardVO boardVO) {
		model.addAttribute("list", boardService.select(boardVO));
		return "board/read";
	}
	
	@GetMapping("/delete")
	public String delete(BoardVO boardVO) {
		boardService.delete(boardVO);
		return "common/success";
	}
	
	@GetMapping("/updateForm")
	public String updateForm(Model model, BoardVO boardVO) {
		model.addAttribute("list", boardService.select(boardVO));
		return "board/updateForm";
	}
	
	@PostMapping("/update")
	public String update(BoardVO boardVO) {
		boardService.update(boardVO);
		return "common/success";
	}
	
	
	
	
	
}
