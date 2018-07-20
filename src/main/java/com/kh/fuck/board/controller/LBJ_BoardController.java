package com.kh.fuck.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kh.fuck.board.model.service.BoardService;

@Controller
public class LBJ_BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value="lbjGoBoard")
	public ModelAndView goLbjBoard(ModelAndView mv) {
		mv.setViewName("A1.LBJ/lbjBoard");
		return mv;
	}
}
