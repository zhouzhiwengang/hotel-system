package com.zzg.common;

import java.util.List;

import com.zzg.common.entity.PageDate;

/**
 * 公共服务之分页服务接口
 * @author zzg
 *
 * @param <T>
 */
public abstract class AbstractService<T> {
	/**
	 * 分页抽象服务方法
	 * @param list
	 * @param pageNum
	 * @param pageSize
	 * @param totla
	 * @return
	 */
	public PageDate<T> page(List<T> list,Integer pageNum, Integer pageSize, Long totla){
		PageDate<T> page = new PageDate<T>();		
		page.setData(list);
		page.setPageNum(pageNum);
		page.setPageSize(pageSize);
		page.setTotalCount(totla);
		return page;
	}
}
