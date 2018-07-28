package com.kh.fuck.board.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@RequestMapping(value="lbjGoBoardWrite")
	public String goLbjBoardWrite() {
		return "A1.LBJ/lbjBoardWrite";
	}
	
	@RequestMapping(value="lbjBoardWrite")/*,method=RequestMethod.POST*/
	public void lbjBoardWriteMethod(Board board,
				@RequestParam("file") String fileName) {
		System.out.println("file = " + fileName);
		System.out.println("Board = " + board);
	}
}
