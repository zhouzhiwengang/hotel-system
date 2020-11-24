package com.zzg.common;
/**
 * 公共服务方法之基础接口服务
 * @author zzg
 *
 * @param <T>
 */
public interface BaseService<T> {
	/**
	 * 创建实体对象
	 * 
	 * @param entity
	 */
    int insert(T record);
    /**
	 * 创建实体对象
	 * 
	 * @param entity
	 */
    int insertSelective(T record);
    /**
	 * 根据主键查找
	 * 
	 * @param sid
	 */
    T selectByPrimaryKey(Integer sid);
    /**
	 * 更新实体对象中非空的字段
	 * 
	 * @param entity
	 */
    int updateByPrimaryKeySelective(T record);
    /**
   	 * 更新实体对象中非空的字段
   	 * 
   	 * @param entity
   	 */
    int updateByPrimaryKey(T record);
    /**
	 * 根据主键删除找
	 * 
	 * @param sid
	 */
	void deleteByPrimaryKey(Integer sid);
}
