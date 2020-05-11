package com.lzy.controller;

import java.util.List;

import javax.xml.crypto.KeySelector.Purpose;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lzy.pojo.Process;
import com.lzy.pojo.CategoryYWB;
import com.lzy.pojo.Design;
import com.lzy.pojo.GradelevelYWB;
import com.lzy.pojo.Product;
import com.lzy.pojo.Purposetype;
import com.lzy.service.DesignService;

@Controller
public class DesignController {
	@Autowired
	DesignService service;
	@RequestMapping("/design")
	public String design() {
		return "/design/design";
	}
	@RequestMapping("/addsign")
	@ResponseBody
	public String add(int id,String name,String price,String user) {
		int i=service.addsign(id,name,price,user);
		System.out.println("id="+id);
		if (i>0) {
			return "操作成功";
		}else {
			return "操作失败";
		}
		
	}
	
	@RequestMapping("/designshow")
	public String designShow() {
		return "/design/designShow";
	}
	@RequestMapping("/getdes")
	@ResponseBody
	public List<Design> getdes(){
		List<Design> list=service.getdes();
		System.out.println(list);
		return list;
	}
	@RequestMapping("/getdesPass")
	@ResponseBody
	public String getdesPass(int id) {
		int i=service.getdesPass(id);
		if(i>0) {
			return "操作成功";
		}else {
			return "操作失败";
		}
	}
	@RequestMapping("/nodesPass")
	@ResponseBody
	public String nodesPass(int id) {
		int i=service.nodesPass(id);
		if(i>0) {
			return "操作成功";
		}else {
			return "操作失败";
		}
	}
	@RequestMapping("/getcate")
	@ResponseBody
	public List<CategoryYWB> getcate(){
		List<CategoryYWB> list=service.getcate();
		return list;
	}
	@RequestMapping("/getpurpose")
	@ResponseBody
	public List<Purposetype> getpurpose(){
		List<Purposetype> list=service.getpurpose();
		return list;
	}
	@RequestMapping("/getgradelevel")
	@ResponseBody
	public List<GradelevelYWB> getgradelevel(){
		List<GradelevelYWB> list=service.getgradelevel();
			return list;
	}
	@RequestMapping("/getpro")
	@ResponseBody
	public List<Product> getpro(){
		List<Product> list = service.getpro();
		return list;
	}
	@RequestMapping("/getprocess")
	@ResponseBody
	public List<Process> getprocess(){
		List<Process> list=service.getprocess();
		return list;
	}
	@RequestMapping("/addpvd")
	@ResponseBody
	public void addpvd(int pid,int did) {
		service.addpvd(pid,did);
	}
	@RequestMapping("/adddesign")
	@ResponseBody
	public String adddesign(int pid,String pname,int cost,String user) {
		int i=service.adddesign(pid,pname,cost,user);
		if(i>0) {
			return "操作成功";
		}else {
			return "操作失败";
		}
	}
}
