package com.kh.fuck.board.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.fuck.board.model.dao.BoardDao;
import com.kh.fuck.board.model.vo.Board;

@Service("boardService")
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardDao boardDao;
	
	@Override
	public List<Board> selectAllLbjBoard() {
		return boardDao.selectAllLbjBoard();
	}
}
