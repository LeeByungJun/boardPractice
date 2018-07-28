package com.kh.fuck.board.model.vo;

import java.io.Serializable;
import java.sql.Date;

import org.springframework.stereotype.Component;

@Component("board2")
public class Board2 implements Serializable{

	private static final long serialVersionUID = 14394L;
	
	private int cjs_bno;
	private String cjs_btitle;
	private String cjs_bwriter;
	private String cjs_bcontent;
	private String cjs_bfile;
	private int cjs_bview;
	private Date cjs_bdate;
	
	public Board2() {
		
	}

	public Board2(int cjs_bno, String cjs_btitle, String cjs_bwriter, String cjs_bcontent, String cjs_bfile,
			int cjs_bview, Date cjs_bdate) {
		super();
		this.cjs_bno = cjs_bno;
		this.cjs_btitle = cjs_btitle;
		this.cjs_bwriter = cjs_bwriter;
		this.cjs_bcontent = cjs_bcontent;
		this.cjs_bfile = cjs_bfile;
		this.cjs_bview = cjs_bview;
		this.cjs_bdate = cjs_bdate;
	}

	public int getcjs_bno() {
		return cjs_bno;
	}

	public void setcjs_bno(int cjs_bno) {
		this.cjs_bno = cjs_bno;
	}

	public String getcjs_btitle() {
		return cjs_btitle;
	}

	public void setcjs_btitle(String cjs_btitle) {
		this.cjs_btitle = cjs_btitle;
	}

	public String getcjs_bwriter() {
		return cjs_bwriter;
	}

	public void setcjs_bwriter(String cjs_bwriter) {
		this.cjs_bwriter = cjs_bwriter;
	}

	public String getcjs_bcontent() {
		return cjs_bcontent;
	}

	public void setcjs_bcontent(String cjs_bcontent) {
		this.cjs_bcontent = cjs_bcontent;
	}

	public String getcjs_bfile() {
		return cjs_bfile;
	}

	public void setcjs_bfile(String cjs_bfile) {
		this.cjs_bfile = cjs_bfile;
	}

	public int getcjs_bview() {
		return cjs_bview;
	}

	public void setcjs_bview(int cjs_bview) {
		this.cjs_bview = cjs_bview;
	}

	public Date getcjs_bdate() {
		return cjs_bdate;
	}

	public void setcjs_bdate(Date cjs_bdate) {
		this.cjs_bdate = cjs_bdate;
	}

	@Override
	public String toString() {
		return "Board [cjs_bno=" + cjs_bno + ", cjs_btitle=" + cjs_btitle + ", cjs_bwriter=" + cjs_bwriter
				+ ", cjs_bcontent=" + cjs_bcontent + ", cjs_bfile=" + cjs_bfile + ", cjs_bview=" + cjs_bview
				+ ", cjs_bdate=" + cjs_bdate + "]";
	}
	
}
