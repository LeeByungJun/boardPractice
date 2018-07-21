package com.kh.fuck.board.model.vo;

import java.io.Serializable;
import java.sql.Date;

import org.springframework.stereotype.Component;

@Component("board")
public class Board implements Serializable{

	private static final long serialVersionUID = 9494L;
	
	private int lbj_bno;
	private String lbj_btitle;
	private String lbj_bwriter;
	private String lbj_bcontent;
	private String lbj_bfile;
	private int lbj_bview;
	private Date lbj_bdate;
	
	public Board() {
		
	}

	public Board(int lbj_bno, String lbj_btitle, String lbj_bwriter, String lbj_bcontent, String lbj_bfile,
			int lbj_bview, Date lbj_bdate) {
		super();
		this.lbj_bno = lbj_bno;
		this.lbj_btitle = lbj_btitle;
		this.lbj_bwriter = lbj_bwriter;
		this.lbj_bcontent = lbj_bcontent;
		this.lbj_bfile = lbj_bfile;
		this.lbj_bview = lbj_bview;
		this.lbj_bdate = lbj_bdate;
	}

	public int getLbj_bno() {
		return lbj_bno;
	}

	public void setLbj_bno(int lbj_bno) {
		this.lbj_bno = lbj_bno;
	}

	public String getLbj_btitle() {
		return lbj_btitle;
	}

	public void setLbj_btitle(String lbj_btitle) {
		this.lbj_btitle = lbj_btitle;
	}

	public String getLbj_bwriter() {
		return lbj_bwriter;
	}

	public void setLbj_bwriter(String lbj_bwriter) {
		this.lbj_bwriter = lbj_bwriter;
	}

	public String getLbj_bcontent() {
		return lbj_bcontent;
	}

	public void setLbj_bcontent(String lbj_bcontent) {
		this.lbj_bcontent = lbj_bcontent;
	}

	public String getLbj_bfile() {
		return lbj_bfile;
	}

	public void setLbj_bfile(String lbj_bfile) {
		this.lbj_bfile = lbj_bfile;
	}

	public int getLbj_bview() {
		return lbj_bview;
	}

	public void setLbj_bview(int lbj_bview) {
		this.lbj_bview = lbj_bview;
	}

	public Date getLbj_bdate() {
		return lbj_bdate;
	}

	public void setLbj_bdate(Date lbj_bdate) {
		this.lbj_bdate = lbj_bdate;
	}

	@Override
	public String toString() {
		return "Board [lbj_bno=" + lbj_bno + ", lbj_btitle=" + lbj_btitle + ", lbj_bwriter=" + lbj_bwriter
				+ ", lbj_bcontent=" + lbj_bcontent + ", lbj_bfile=" + lbj_bfile + ", lbj_bview=" + lbj_bview
				+ ", lbj_bdate=" + lbj_bdate + "]";
	}
	
}
