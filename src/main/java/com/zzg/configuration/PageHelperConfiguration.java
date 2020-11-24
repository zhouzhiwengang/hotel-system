package com.zzg.configuration;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.pagehelper.PageHelper;

/**
 * 分页配置对象
 * @author zzg
 *
 */
@Configuration
public class PageHelperConfiguration {
	/**
	 * 分页对象实列化
	 * @return
	 */
	@Bean
	public PageHelper pageHelper() {
		PageHelper pageHelper = new PageHelper();
		Properties p = new Properties();
		p.setProperty("offsetAsPageNum", "true");
		p.setProperty("rowBoundsWithCount", "true");
		p.setProperty("reasonable", "true");
		p.setProperty("dialect", "Oracle");
		pageHelper.setProperties(p);
		return pageHelper;
	}
}
