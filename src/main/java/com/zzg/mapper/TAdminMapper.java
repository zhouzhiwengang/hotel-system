package com.zzg.mapper;

import java.util.List;
import java.util.Map;

import com.zzg.entity.TAdmin;

public interface TAdminMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(TAdmin record);

    int insertSelective(TAdmin record);

    TAdmin selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(TAdmin record);

    int updateByPrimaryKey(TAdmin record);
    
    /**
                  * 方法拓展
     */
    List<TAdmin> select(Map<String,Object> parame);
    
    Integer count(Map<String,Object> parame);
    
    void batchInsert(List<TAdmin> list);
    
    void batchUpdate(List<TAdmin> list);
    
  
}