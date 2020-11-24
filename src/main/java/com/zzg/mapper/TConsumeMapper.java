package com.zzg.mapper;

import java.util.List;
import java.util.Map;

import com.zzg.entity.TConsume;

public interface TConsumeMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(TConsume record);

    int insertSelective(TConsume record);

    TConsume selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(TConsume record);

    int updateByPrimaryKey(TConsume record);
    
	/**
	 * 方法拓展
	 */
	List<TConsume> select(Map<String, Object> parame);

	Integer count(Map<String, Object> parame);

	void batchInsert(List<TConsume> list);

	void batchUpdate(List<TConsume> list);
}