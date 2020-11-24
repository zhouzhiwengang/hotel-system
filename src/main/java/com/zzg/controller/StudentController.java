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
import com.zzg.entity.TStudent;
import com.zzg.service.TStudentService;

@Controller
@RequestMapping("/api/student")
public class StudentController extends AbstractController {
	// 日志记录
	public static final Logger log = LoggerFactory.getLogger(ConsumeController.class);

	@Autowired
	TStudentService studentService;
	
	@RequestMapping(value = "/findPage", method = RequestMethod.POST)
	@ResponseBody
	public Result findPage(@RequestBody Map<String, Object> parame) {
		PageParam rb = super.initPageBounds(parame);
		PageDate<TStudent> pageList = studentService.selectPage(parame, rb);
		return new Result().ok().setData(pageList);
	}
	
	@RequestMapping(value = "/find", method = RequestMethod.GET)
	@ResponseBody
	public Result find() {
		List<TStudent> list = studentService.select(null);
		return new Result().ok().setData(list);
	}

	@RequestMapping(value = "/findBySid/{sid}", method = RequestMethod.GET)
	@ResponseBody
	public Result findBySid(@PathVariable("sid") Integer sid) {
		TStudent object = studentService.selectByPrimaryKey(sid);
		return new Result().ok().setData(object);
	}

	@RequestMapping(value = "/deleteBySid/{sid}", method = RequestMethod.GET)
	@ResponseBody
	public Result deleteBySid(@PathVariable("sid") Integer sid) {
		studentService.deleteByPrimaryKey(sid);
		return new Result().ok();
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public Result update(@RequestBody TStudent student) {
		int num = studentService.updateByPrimaryKeySelective(student);
		if (num > 0) {
			return new Result().ok();
		}
		return new Result().error("更新失败");
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	@ResponseBody
	public Result insert(@RequestBody TStudent student) {
		int num = studentService.insertSelective(student);
		if (num > 0) {
			return new Result().ok();
		}
		return new Result().error("新增失败");
	}
}
