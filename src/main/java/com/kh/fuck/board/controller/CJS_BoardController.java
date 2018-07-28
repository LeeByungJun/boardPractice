package com.kh.fuck.board.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.kh.fuck.board.model.vo.Board;
import com.kh.fuck.board.model.service.BoardService;
import com.kh.fuck.board.model.service.BoardService2;

@Controller
public class CJS_BoardController {
	
	@Autowired
	private BoardService2 boardService;
	
	@RequestMapping(value="cjsmovigpage")
	public ModelAndView movigpage(ModelAndView mv) {
	ArrayList<Board> al=(ArrayList<Board>)boardService.selectAllcjsBoard();
	System.out.println(al);
    mv.addObject("cjaboard",al);
    mv.setViewName("A2.CJS/cjsBoard");
    
    
    
	return mv;	
	}
	
}
