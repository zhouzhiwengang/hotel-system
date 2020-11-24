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
import com.zzg.entity.TTerminal;
import com.zzg.mapper.TTerminalMapper;
import com.zzg.service.TTerminalService;

@Service
public class TTerminalServiceImpl extends AbstractService<TTerminal> implements TTerminalService {
	@Autowired
	 TTerminalMapper mapper;
	public int insert(TTerminal record) {
		// TODO Auto-generated method stub
		return mapper.insert(record);
	}

	public int insertSelective(TTerminal record) {
		// TODO Auto-generated method stub
		return mapper.insertSelective(record);
	}

	public TTerminal selectByPrimaryKey(Integer sid) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(sid);
	}

	public int updateByPrimaryKeySelective(TTerminal record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TTerminal record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKey(record);
	}

	public void deleteByPrimaryKey(Integer sid) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(sid);
	}

	public PageDate<TTerminal> selectPage(Map<String, Object> parame, PageParam rb) {
		// TODO Auto-generated method stub
		PageHelper.startPage(rb.getPageNo(), rb.getLimit());
		List<TTerminal> rs = mapper.select(parame);
		PageInfo<TTerminal> pageInfo = new PageInfo<TTerminal>(rs);
		return super.page(pageInfo.getList(), pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getTotal());
	}

	public List<TTerminal> select(Map<String, Object> parame) {
		// TODO Auto-generated method stub
		return mapper.select(parame);
	}

	public Integer count(Map<String, Object> parame) {
		// TODO Auto-generated method stub
		return mapper.count(parame);
	}

	public void batchInsert(List<TTerminal> list) {
		// TODO Auto-generated method stub
		mapper.batchInsert(list);
	}

	public void batchUpdate(List<TTerminal> list) {
		// TODO Auto-generated method stub
		mapper.batchUpdate(list);
	}

}
