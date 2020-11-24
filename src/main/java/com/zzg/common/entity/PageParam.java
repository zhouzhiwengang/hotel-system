package com.zzg.common.entity;

public class PageParam implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6546262537179268627L;

	public PageParam(int pageNo, int limit){
		this.pageNo = pageNo;
		this.limit = limit;
	}
	
	
	// 一页显示的记录数
    /** The limit. */
    private int limit;
    // 当前页码
    /** The page no. */
    private int pageNo;
    
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
}
