package com.zzg.common;

import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.SimpleTypeConverter;
import com.zzg.common.constant.WebAppConstants;
import com.zzg.common.entity.PageParam;

public abstract class AbstractController {
	/**
	 * 参数分页参数转换校验：现在仅支持:get请求、参数格式:?page=1&limit=10
	 * 
	 * @param param
	 * @return
	 */
	protected PageParam initPageBounds(Map<String,Object> parame) {
		SimpleTypeConverter converter = new SimpleTypeConverter();
		// 页码、分页大小初始化设置值
		int page = 1;
		int limit = 10;
		if(parame.get(WebAppConstants.PAGE) != null){
			//page = converter.convertIfNecessary(String.valueOf(parame.get(WebAppConstants.PAGE)), int.class);
			page = (Integer) parame.get(WebAppConstants.PAGE);
		}
//		if(StringUtils.isNotEmpty(String.valueOf(parame.get(WebAppConstants.LIMIT)))){
//			limit = converter.convertIfNecessary(String.valueOf(parame.get(WebAppConstants.LIMIT)), int.class);
//		}
		if(parame.get(WebAppConstants.LIMIT) != null) {
			limit = (Integer) parame.get(WebAppConstants.LIMIT);
		}
		PageParam pb = new PageParam(page, limit);         
		return pb;
	}
}
