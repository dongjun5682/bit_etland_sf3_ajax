package com.bit_etland.web.proxy;

import javax.servlet.http.HttpServletRequest;


public class Pagination implements Proxy{
	private int pageNum,pageSize,
			blockSize,
			startRow,endRow,
			startPage,endPage,blockNum,
			prevBlock,nextBlock,totalCount;
	private boolean existPrev, existNext;
	
	@Override
	public void carryOut(Object o) {
		System.out.println("?Ž˜?´ì§??„¤?´?…˜ ?‚´ë¶? ");
		HttpServletRequest request = (HttpServletRequest) o;
		System.out.println("page_size : "+ request.getParameter("page_size"));
		System.out.println("page_num : "+ request.getParameter("page_num"));
		pageSize = (request.getParameter("page_size") == null)	? 5 : Integer.parseInt(request.getParameter("page_size"));
		pageNum = (request.getParameter("page_num") == null) ? 1 : Integer.parseInt(request.getParameter("page_num"));
		/* totalCount = CustomerServiceImpl.getInstance().countCustomers(null); */
		int pageCount = (totalCount % pageSize != 0) ?  totalCount/pageSize+1:totalCount/pageSize;
		String _blockSize = request.getParameter("block_size");
		blockSize = (_blockSize == null) ? 5 : Integer.parseInt(_blockSize);
		startRow = (pageNum -1) *pageSize + 1;
		endRow = (totalCount > pageNum * pageSize)? pageNum * pageSize: totalCount;
		
		blockNum = (int)(Math.ceil(pageNum / (double)blockSize) * blockSize);
		endPage = blockNum;
		startPage = (endPage - blockSize) + 1; 
		endPage = (blockNum > pageCount ) ? pageCount :blockNum ;
		
		existNext = (startPage + pageSize) < pageCount;
		existPrev = (startPage - pageSize) > 0 ;
		
		prevBlock = startPage - pageSize;
		nextBlock = startPage + pageSize;
		
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getBlockSize() {
		return blockSize;
	}

	public void setBlockSize(int blockSize) {
		this.blockSize = blockSize;
	}

	public int getStartRow() {
		return startRow;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	public int getEndRow() {
		return endRow;
	}

	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public int getBlockNum() {
		return blockNum;
	}

	public void setBlockNum(int blockNum) {
		this.blockNum = blockNum;
	}

	public int getPrevBlock() {
		return prevBlock;
	}

	public void setPrevBlock(int prevBlock) {
		this.prevBlock = prevBlock;
	}

	public int getNextBlock() {
		return nextBlock;
	}

	public void setNextBlock(int nextBlock) {
		this.nextBlock = nextBlock;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public boolean isExistPrev() {
		return existPrev;
	}

	public void setExistPrev(boolean existPrev) {
		this.existPrev = existPrev;
	}

	public boolean isExistNext() {
		return existNext;
	}

	public void setExistNext(boolean existNext) {
		this.existNext = existNext;
	}
	
}
