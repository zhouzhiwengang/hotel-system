package com.zzg.controller;

import java.util.List;
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
import com.zzg.entity.TCard;
import com.zzg.service.TCardService;

@Controller
@RequestMapping("/api/card")
public class CardController extends AbstractController {
	// 日志记录
		public static final Logger log = LoggerFactory.getLogger(CardController.class);
		
		@Autowired
		TCardService cardService;
		
		@RequestMapping(value = "/findPage", method = RequestMethod.POST)
		@ResponseBody
		public Result findPage(@RequestBody Map<String, Object> parame) {
			PageParam rb = super.initPageBounds(parame);
			PageDate<TCard> pageList = cardService.selectPage(parame, rb);
			return new Result().ok().setData(pageList);
		}
		
		@RequestMapping(value = "/find", method = RequestMethod.GET)
		@ResponseBody
		public Result find() {
			List<TCard> list = cardService.select(null);
			return new Result().ok().setData(list);
		}

		@RequestMapping(value = "/findBySid/{sid}", method = RequestMethod.GET)
		@ResponseBody
		public Result findBySid(@PathVariable("sid") Integer sid) {
			TCard object = cardService.selectByPrimaryKey(sid);
			return new Result().ok().setData(object);
		}

		@RequestMapping(value = "/deleteBySid/{sid}", method = RequestMethod.GET)
		@ResponseBody
		public Result deleteBySid(@PathVariable("sid") Integer sid) {
			cardService.deleteByPrimaryKey(sid);
			return new Result().ok();
		}

		@RequestMapping(value = "/update", method = RequestMethod.POST)
		@ResponseBody
		public Result update(@RequestBody TCard card) {
			int num = cardService.updateByPrimaryKeySelective(card);
			if (num > 0) {
				return new Result().ok();
			}
			return new Result().error("更新失败");
		}
		
		@RequestMapping(value = "/recharge", method = RequestMethod.POST)
		@ResponseBody
		public Result recharge(@RequestBody TCard card) {
			cardService.recharge(card);
			return new Result().error("充值成功");
		}

		@RequestMapping(value = "/insert", method = RequestMethod.POST)
		@ResponseBody
		public Result insert(@RequestBody TCard card) {
			int num = cardService.insertSelective(card);
			if (num > 0) {
				return new Result().ok();
			}
			return new Result().error("新增失败");
		}
}
