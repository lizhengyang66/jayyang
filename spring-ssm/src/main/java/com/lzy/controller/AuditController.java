package com.lzy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lzy.pojo.Audit;
import com.lzy.pojo.Daudit;
import com.lzy.service.AuditService;

@Controller
public class AuditController {
	@Autowired
	AuditService service;
	@RequestMapping("/getall")
	@ResponseBody
	public List<Audit> getall(){
		List<Audit> list=service.getall();
		System.out.println(list);
		return list;
	}
	@RequestMapping("/audit")
	public String Audit() {
		return "/audit/audit";
	}
	@RequestMapping("getPass")
	@ResponseBody
	public String getPass(int id) {
		int i=service.getPass(id);
		if(i>0) {
			service.addcAudit(id);
			return "操作成功！";
		}else {
			return "操作失败";
		}
	}
	@RequestMapping("noPass")
	@ResponseBody
	public String noPass(int id) {
		int i=service.noPass(id);
		if(i>0) {
			return "操作成功！";
		}else {
			return "操作失败";
		}
	}
	//李子阳的审核查询
	@RequestMapping("/getDaudit")
	@ResponseBody
	public List<Daudit> getDaudit(){
		List<Daudit> list=service.selectDaudit();
		System.out.println(list);
		return list;
		
	}
	@RequestMapping("/Daudit")
	public String Daudit(){
		return "/audit/daudit";
	}
	@RequestMapping("/yespass")
	@ResponseBody
	public String yespass(int id) {
		int i=service.yespass(id);
		if(i>0) {
			return "操作成功！";
		}else {
			return "操作失败";
		}
	}
	@RequestMapping("/notPass")
	@ResponseBody
	public String notpass(int id) {
		int i =service.notpass(id);
		if(i>0) {
			return "操作成功！";
		}else {
			return "操作失败";
		}
		
	}
}
