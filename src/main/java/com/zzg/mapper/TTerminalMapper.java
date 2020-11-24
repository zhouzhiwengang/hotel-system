package com.zzg.mapper;

import java.util.List;
import java.util.Map;

import com.zzg.entity.TTerminal;

public interface TTerminalMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(TTerminal record);

    int insertSelective(TTerminal record);

    TTerminal selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(TTerminal record);

    int updateByPrimaryKey(TTerminal record);
    
	/**
	 * 方法拓展
	 */
	List<TTerminal> select(Map<String, Object> parame);

	Integer count(Map<String, Object> parame);

	void batchInsert(List<TTerminal> list);

	void batchUpdate(List<TTerminal> list);
}