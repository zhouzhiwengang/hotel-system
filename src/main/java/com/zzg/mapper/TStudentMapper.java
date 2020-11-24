package com.zzg.mapper;

import java.util.List;
import java.util.Map;

import com.zzg.entity.TStudent;

public interface TStudentMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(TStudent record);

    int insertSelective(TStudent record);

    TStudent selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(TStudent record);

    int updateByPrimaryKey(TStudent record);
    
	/**
	 * 方法拓展
	 */
	List<TStudent> select(Map<String, Object> parame);

	Integer count(Map<String, Object> parame);

	void batchInsert(List<TStudent> list);

	void batchUpdate(List<TStudent> list);
}