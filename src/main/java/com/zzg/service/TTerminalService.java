package com.zzg.service;

import java.util.List;
import java.util.Map;

import com.zzg.common.BaseService;
import com.zzg.common.entity.PageDate;
import com.zzg.common.entity.PageParam;
import com.zzg.entity.TTerminal;

public interface TTerminalService extends BaseService<TTerminal> {
	/**
	 * 自定义分页
	 * 
	 * @param parame
	 * @param rb
	 * @return
	 */
	public PageDate<TTerminal> selectPage(Map<String, Object> parame, PageParam rb);
	
	/**
	   *    自定义查询
	 * @param parame
	 * @return
	 */
	public List<TTerminal> select(Map<String, Object> parame);
	
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
	public void batchInsert(List<TTerminal> list);
	
	/**
	 * 自定义批量更新
	 * @param list
	 */
	public void batchUpdate(List<TTerminal> list);
}
