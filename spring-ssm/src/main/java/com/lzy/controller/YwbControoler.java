package com.lzy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import com.lzy.pojo.M_APPLY;
import com.lzy.service.YwbService;

@Controller
public class YwbControoler {
	
	@Autowired
	YwbService service;
	
	/*
	 * //路径是什么 就跳转到对应的页面
	 * 
	 * @RequestMapping("{page}") public String page(@PathVariable String page) {
	 * return page; }
	 */
	
	//生产计划表 M_APPLY
	@RequestMapping("/productScSj")
	public String ywbadd(M_APPLY mapply) {
		service.ywbadd(mapply);	
		return "/user/test";			
	}

}
