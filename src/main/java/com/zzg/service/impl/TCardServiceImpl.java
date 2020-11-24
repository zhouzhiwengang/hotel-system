package com.zzg.service.impl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zzg.common.AbstractService;
import com.zzg.common.entity.PageDate;
import com.zzg.common.entity.PageParam;
import com.zzg.entity.TCard;
import com.zzg.mapper.TCardMapper;
import com.zzg.service.TCardService;

@Service
public class TCardServiceImpl extends AbstractService<TCard> implements TCardService {
	@Autowired
	TCardMapper mapper;
	
	public int insert(TCard record) {
		// TODO Auto-generated method stub
		return mapper.insert(record);
	}

	public int insertSelective(TCard record) {
		// TODO Auto-generated method stub
		return mapper.insertSelective(record);
	}

	public TCard selectByPrimaryKey(Integer sid) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(sid);
	}

	public int updateByPrimaryKeySelective(TCard record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TCard record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKey(record);
	}

	public void deleteByPrimaryKey(Integer sid) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(sid);
	}

	public PageDate<TCard> selectPage(Map<String, Object> parame, PageParam rb) {
		// TODO Auto-generated method stub
		PageHelper.startPage(rb.getPageNo(), rb.getLimit());
		List<TCard> rs = mapper.select(parame);
		PageInfo<TCard> pageInfo = new PageInfo<TCard>(rs);
		return super.page(pageInfo.getList(), pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getTotal());
	}

	public List<TCard> select(Map<String, Object> parame) {
		// TODO Auto-generated method stub
		return mapper.select(parame);
	}

	public Integer count(Map<String, Object> parame) {
		// TODO Auto-generated method stub
		return mapper.count(parame);
	}

	public void batchInsert(List<TCard> list) {
		// TODO Auto-generated method stub
		mapper.batchInsert(list);
	}

	public void batchUpdate(List<TCard> list) {
		// TODO Auto-generated method stub
		mapper.batchUpdate(list);
	}

	public void recharge(TCard tCard) {
		// TODO Auto-generated method stub
		TCard object = mapper.selectByPrimaryKey(tCard.getSid());
		BigDecimal money = object.getMoney().add(tCard.getMoney());
		object.setMoney(money);
		mapper.updateByPrimaryKeySelective(object);
	}

}
