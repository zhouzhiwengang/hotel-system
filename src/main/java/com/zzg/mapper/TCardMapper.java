package com.zzg.mapper;

import java.util.List;
import java.util.Map;

import com.zzg.entity.TCard;

public interface TCardMapper {
	int deleteByPrimaryKey(Integer sid);

	int insert(TCard record);

	int insertSelective(TCard record);

	TCard selectByPrimaryKey(Integer sid);

	int updateByPrimaryKeySelective(TCard record);

	int updateByPrimaryKey(TCard record);

	/**
	 * 方法拓展
	 */
	List<TCard> select(Map<String, Object> parame);

	Integer count(Map<String, Object> parame);

	void batchInsert(List<TCard> list);

	void batchUpdate(List<TCard> list);
}