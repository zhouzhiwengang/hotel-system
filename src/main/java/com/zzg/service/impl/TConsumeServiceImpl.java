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
import com.zzg.entity.TConsume;
import com.zzg.mapper.TConsumeMapper;
import com.zzg.service.TConsumeService;

@Service
public class TConsumeServiceImpl extends AbstractService<TConsume> implements TConsumeService {
	@Autowired
	TConsumeMapper mapper;
	
	public int insert(TConsume record) {
		// TODO Auto-generated method stub
		return mapper.insert(record);
	}

	public int insertSelective(TConsume record) {
		// TODO Auto-generated method stub
		return mapper.insertSelective(record);
	}

	public TConsume selectByPrimaryKey(Integer sid) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(sid);
	}

	public int updateByPrimaryKeySelective(TConsume record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TConsume record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKey(record);
	}

	public void deleteByPrimaryKey(Integer sid) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(sid);
	}

	public PageDate<TConsume> selectPage(Map<String, Object> parame, PageParam rb) {
		// TODO Auto-generated method stub
		PageHelper.startPage(rb.getPageNo(), rb.getLimit());
		List<TConsume> rs = mapper.select(parame);
		PageInfo<TConsume> pageInfo = new PageInfo<TConsume>(rs);
		return super.page(pageInfo.getList(), pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getTotal());
	}

	public List<TConsume> select(Map<String, Object> parame) {
		// TODO Auto-generated method stub
		return mapper.select(parame);
	}

	public Integer count(Map<String, Object> parame) {
		// TODO Auto-generated method stub
		return mapper.count(parame);
	}

	public void batchInsert(List<TConsume> list) {
		// TODO Auto-generated method stub
		mapper.batchInsert(list);
	}

	public void batchUpdate(List<TConsume> list) {
		// TODO Auto-generated method stub
		mapper.batchUpdate(list);
	}

}
