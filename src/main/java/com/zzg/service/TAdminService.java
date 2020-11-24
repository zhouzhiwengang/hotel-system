package com.zzg.service;

import java.util.List;
import java.util.Map;

import com.zzg.common.BaseService;
import com.zzg.common.entity.PageDate;
import com.zzg.common.entity.PageParam;
import com.zzg.entity.TAdmin;

public interface TAdminService extends BaseService<TAdmin> {
	/**
	 * 自定义分页
	 * 
	 * @param parame
	 * @param rb
	 * @return
	 */
	public PageDate<TAdmin> selectPage(Map<String, Object> parame, PageParam rb);
	
	/**
	   *    自定义查询
	 * @param parame
	 * @return
	 */
	public List<TAdmin> select(Map<String, Object> parame);
	
	/**
	 * 自定义统计
	 * @param parame
	 * @return
	 */
	public Integer count(Map<String, Object> parame);
	
	/**
	 * 自定义批量插入
	 * @param list
	 */
	public void batchInsert(List<TAdmin> list);
	
	/**
	 * 自定义批量更新
	 * @param list
	 */
	public void batchUpdate(List<TAdmin> list);

}
