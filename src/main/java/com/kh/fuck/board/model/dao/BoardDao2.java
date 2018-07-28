package com.kh.fuck.board.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.fuck.board.model.vo.Board;

@Repository("boardDao2")
public class BoardDao2 {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	public List<Board> selectAllcjsBoard() {
	return sqlSession.selectList("selectAllcjsBoard");
	}
}
