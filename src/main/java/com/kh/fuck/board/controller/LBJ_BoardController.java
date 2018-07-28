package com.kh.fuck.board.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kh.fuck.board.model.service.BoardService;
import com.kh.fuck.board.model.vo.Board;
import com.kh.fuck.common.controller.PagingController;

@Controller
public class LBJ_BoardController extends PagingController{
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value="lbjGoBoard")
	public ModelAndView goLbjBoard(ModelAndView mv){
		ArrayList<Board> lbjBoard = (ArrayList<Board>)boardService.selectAllLbjBoard();
		System.out.println("lbjBoard size = " + lbjBoard.size());
		mv.addObject("lbjBoard", lbjBoard);
		mv.setViewName("A1.LBJ/lbjBoard");
		return mv;
	}
	
	
	
}
