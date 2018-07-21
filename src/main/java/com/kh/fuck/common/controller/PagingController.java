package com.kh.fuck.common.controller;

public class PagingController{
	//이 class는 페이징 처리를 위한 클래스 입니다.
	private int limit;
	private int currentPage;
	private int startPage;
	private int maxPage;
	//쿼리문에서 꺼낼 데이터 갯수 정하는 넘들
	private int startRow;
	private int endRow;
	///////////////////////////
	private int endFor;
	
	public PagingController() {
		currentPage = 1;
		startPage = 1;
		startRow = 1;
		endRow = 1;
		maxPage = 1;
		endFor = 1;
		limit = 6;
	}	
	
	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public void setCurrentPage(int page) {
		this.currentPage = page;
	}

	public int getCurrentPage() {
		return currentPage;
	}
	
	public int setStartPage() {
		this.startPage = (((int) ((double) currentPage / limit + 0.999999)) - 1) * limit + 1;
		return startPage;
	}
	
	public int getStartPage() {
		return this.setStartPage();
	}

	public int getMaxPage() {
		return maxPage;
	}

	public void setMaxPage(int listCount) {
		this.maxPage = (int)((double)listCount / limit + 0.9);;
	}

	public int getStartRow() {
		return this.setStartRow();
	}

	public int setStartRow() {
		this.startRow = (currentPage-1)*limit+1;
		return startRow;
	}

	public int getEndRow() {
		return this.setEndRow();
	}

	public int setEndRow() {
		this.endRow = startRow + limit - 1;
		return endRow;
	}

	public int getEndFor() {
		return this.setEndFor();
	}

	public int setEndFor() {
		this.endFor = (((int) ((double) currentPage / limit + 0.999999)) - 1) * limit + limit;
		return endFor;
	}

	@Override
	public String toString() {
		return "PagingController [limit=" + limit + ", currentPage=" + currentPage + ", startPage=" + startPage
				+ ", maxPage=" + maxPage + ", startRow=" + startRow + ", endRow=" + endRow + ", endFor=" + endFor + "]";
	}
	
}
