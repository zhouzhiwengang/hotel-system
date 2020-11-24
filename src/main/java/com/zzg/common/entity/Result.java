package com.zzg.common.entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zzg.common.BaseModel;
import com.zzg.common.constant.WebAppConstants;


public class Result implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4122695267046209317L;
	//成功返回
	public static String RESULT_CODE_SUCCESS = "200";
	//失败返回
	public static String RESULT_CODE_ERROR = "500";

	//返回码
	protected String code;
	//返回提示信息
	protected String message;
	//返回数据集合
	public Map<String,Object> data = new HashMap<String,Object>();
	// set 和  get 方法
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	// 构造函数
	public Result() {
		this.code = RESULT_CODE_SUCCESS;
		this.message = "success";
	}
	
	public static Result ok() {
		return new Result();
	}
	
	public static Result ok(String msg) {
		return ok(RESULT_CODE_SUCCESS, msg);
	}
	
	public static Result ok(String code, String msg) {
		Result r = new Result();
		r.code = code;
		r.message = msg;
		return r;
	}
	
	public static Result error(String msg) {
		return error(RESULT_CODE_ERROR, msg);
	}
	
	public static Result error(String code, String msg) {
		Result r = new Result();
		r.code = code;
		r.message = msg;
		return r;
	}
	
	/**
	 * 
	 * @Title: setData   
	 * @Description: 添加返回数据到默认 data 节点
	 * @param: @param obj
	 * @param: @return      
	 * @return: Result      
	 * @throws
	 */
	public Result setData(BaseModel obj){
		data.put("data", obj);
		return this;
	}
	
	/**
	 * 
	 * @Title: setData   
	 * @Description: 添加结果集到 data节点,如果有分页信息添加分页数据
	 * @param: @param list
	 * @param: @return      
	 * @return: Result      
	 * @throws
	 */
	public Result setData(PageDate list){
		this.setData(list.getData());
		this.setData(WebAppConstants.LIMIT, list.getPageSize());
		this.setData(WebAppConstants.PAGE, list.getPageNum());
		this.setData(WebAppConstants.TOTAL, list.getTotalCount());
		return this;
	}
	
	public Result setData(Map rs){
		data.putAll(rs);
		return this;
	}
	
	public Result setData(List list){
		data.put("list", list);
		return this;
	}
	
	public Result setData(String name, Object value){
		data.put(name, value);
		return this;
	}
	
	public Result setSid(Long sid) {
		setData("sid", sid);
		return this;
	}
	
	public Result setSid(String sid) {
		setData("sid", sid);
		return this;
	}
}
