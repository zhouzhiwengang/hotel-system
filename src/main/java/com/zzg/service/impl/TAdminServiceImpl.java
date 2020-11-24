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
import com.zzg.entity.TAdmin;
import com.zzg.mapper.TAdminMapper;
import com.zzg.service.TAdminService;

@Service
public class TAdminServiceImpl extends AbstractService<TAdmin> implements TAdminService {
	@Autowired
	TAdminMapper mapper;

	public int insert(TAdmin record) {
		// TODO Auto-generated method stub
		return mapper.insert(record);
	}

	public int insertSelective(TAdmin record) {
		// TODO Auto-generated method stub
		return mapper.insertSelective(record);
	}

	public TAdmin selectByPrimaryKey(Integer sid) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(sid);
	}

	public int updateByPrimaryKeySelective(TAdmin record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TAdmin record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKey(record);
	}

	public void deleteByPrimaryKey(Integer sid) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(sid);
	}

	public PageDate<TAdmin> selectPage(Map<String, Object> parame, PageParam rb) {
		// TODO Auto-generated method stub
		PageHelper.startPage(rb.getPageNo(), rb.getLimit());
		List<TAdmin> rs = mapper.select(parame);
		PageInfo<TAdmin> pageInfo = new PageInfo<TAdmin>(rs);
		return super.page(pageInfo.getList(), pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getTotal());
	}

	public List<TAdmin> select(Map<String, Object> parame) {
		// TODO Auto-generated method stub
		return mapper.select(parame);
	}

	public Integer count(Map<String, Object> parame) {
		// TODO Auto-generated method stub
		return mapper.count(parame);
	}

	public void batchInsert(List<TAdmin> list) {
		// TODO Auto-generated method stub
		mapper.batchInsert(list);
	}

	public void batchUpdate(List<TAdmin> list) {
		// TODO Auto-generated method stub
		mapper.batchUpdate(list);
	}

}
