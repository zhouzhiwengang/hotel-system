package com.zzg.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.zzg.common.AbstractController;
import com.zzg.common.entity.PageDate;
import com.zzg.common.entity.PageParam;
import com.zzg.common.entity.Result;
import com.zzg.entity.TConsume;
import com.zzg.service.TConsumeService;

@Controller
@RequestMapping("/api/consume")
public class ConsumeController extends AbstractController {
	// 日志记录
	public static final Logger log = LoggerFactory.getLogger(ConsumeController.class);

	@Autowired
	TConsumeService consumeService;
	
	@RequestMapping(value = "/findPage", method = RequestMethod.POST)
	@ResponseBody
	public Result findPage(@RequestBody Map<String, Object> parame) {
		PageParam rb = super.initPageBounds(parame);
		PageDate<TConsume> pageList = consumeService.selectPage(parame, rb);
		return new Result().ok().setData(pageList);
	}

	@RequestMapping(value = "/findBySid/{sid}", method = RequestMethod.GET)
	@ResponseBody
	public Result findBySid(@PathVariable("sid") Integer sid) {
		TConsume object = consumeService.selectByPrimaryKey(sid);
		return new Result().ok().setData(object);
	}

	@RequestMapping(value = "/deleteBySid/{sid}", method = RequestMethod.GET)
	@ResponseBody
	public Result deleteBySid(@PathVariable("sid") Integer sid) {
		consumeService.deleteByPrimaryKey(sid);
		return new Result().ok();
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public Result update(@RequestBody TConsume consume) {
		int num = consumeService.updateByPrimaryKeySelective(consume);
		if (num > 0) {
			return new Result().ok();
		}
		return new Result().error("更新失败");
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	@ResponseBody
	public Result insert(@RequestBody TConsume consume) {
		int num = consumeService.insertSelective(consume);
		if (num > 0) {
			return new Result().ok();
		}
		return new Result().error("新增失败");
	}
}
