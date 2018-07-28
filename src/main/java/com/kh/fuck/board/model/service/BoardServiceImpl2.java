package com.kh.fuck.board.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.fuck.board.model.dao.BoardDao;
import com.kh.fuck.board.model.dao.BoardDao2;
import com.kh.fuck.board.model.vo.Board;

@Service("boardService2")
public class BoardServiceImpl2 implements BoardService2{
	
	@Autowired
	private BoardDao2 boardDao;

	@Override
	public List<Board> selectAllcjsBoard() {
		// TODO Auto-generated method stub
		return boardDao.selectAllcjsBoard();
	}
	
}
