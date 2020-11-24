package com.zzg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication//扫描同级包及子包
@EnableTransactionManagement //如果mybatis中service实现类中加入事务注解，需要此处添加该注解
@MapperScan(basePackages = {"com.zzg.mapper"})
public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(MainApplication.class, args);
	}

}
