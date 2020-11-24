package com.zzg.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zzg.common.AbstractService;
import com.zzg.common.entity.PageDate;
import com.zzg.common.entity.PageParam;
import com.zzg.entity.TStudent;
import com.zzg.mapper.TStudentMapper;
import com.zzg.service.TStudentService;

@Service
public class TStudentServiceImpl extends AbstractService<TStudent> implements TStudentService {
	@Autowired
	TStudentMapper mapper;
	
	public int insert(TStudent record) {
		// TODO Auto-generated method stub
		return mapper.insert(record);
	}

	public int insertSelective(TStudent record) {
		// TODO Auto-generated method stub
		return mapper.insertSelective(record);
	}

	public TStudent selectByPrimaryKey(Integer sid) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(sid);
	}

	public int updateByPrimaryKeySelective(TStudent record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TStudent record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKey(record);
	}

	public void deleteByPrimaryKey(Integer sid) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(sid);
	}

	public PageDate<TStudent> selectPage(Map<String, Object> parame, PageParam rb) {
		// TODO Auto-generated method stub
		PageHelper.startPage(rb.getPageNo(), rb.getLimit());
		List<TStudent> rs = mapper.select(parame);
		PageInfo<TStudent> pageInfo = new PageInfo<TStudent>(rs);
		return super.page(pageInfo.getList(), pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getTotal());
	}

	public List<TStudent> select(Map<String, Object> parame) {
		// TODO Auto-generated method stub
		return mapper.select(parame);
	}

	public Integer count(Map<String, Object> parame) {
		// TODO Auto-generated method stub
		return mapper.count(parame);
	}

	public void batchInsert(List<TStudent> list) {
		// TODO Auto-generated method stub
		mapper.batchInsert(list);
	}

	public void batchUpdate(List<TStudent> list) {
		// TODO Auto-generated method stub
		mapper.batchUpdate(list);
	}

}
