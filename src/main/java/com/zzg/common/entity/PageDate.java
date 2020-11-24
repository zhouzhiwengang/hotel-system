package com.zzg.common.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义分页实体对象
 * @author zzg
 *
 * @param <T>
 */
public class PageDate<T> implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6552522645407013282L;
	private int pageNum; // 当前页
	private int pageSize;// 每页数量
	private long totalCount;// 总条数
	private int totalPageNum;// 总页数
	private List<T> data;// 当前页返回数据
	
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
	public long getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}
	public int getTotalPageNum() {
		return totalPageNum;
	}
	public void setTotalPageNum(int totalPageNum) {
		this.totalPageNum = totalPageNum;
	}
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
		this.data = data;
	}
	public PageDate(){
		data = new ArrayList<T>();
	}
	
}
