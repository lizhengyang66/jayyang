package com.lzy.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lzy.pojo.Product;
import com.lzy.pojo.Scell;
import com.lzy.pojo.shkc;
import com.lzy.pojo.sproduct;
import com.lzy.service.ProductService;
import com.lzy.service.RepertoryService;

@Controller
public class RepertoryController {
	@Autowired
	RepertoryService service;
	
	@RequestMapping("/gosafety")
	public String gosafety(){
		return "/repertory/safety";
	}
	
	
	@RequestMapping("/selectSafety")
	@ResponseBody
	public List<sproduct> selectSafety() {
		List<sproduct> spr=service.selectsp();
		System.out.println(spr);
		return spr;
	}
	@RequestMapping("/zhiding")
	public String zhiding(int id,Model model) {
		Product pro=service.selectpro(id);
		String cpid=service.cpbh();
		model.addAttribute("kcid",cpid);
		model.addAttribute("pro", pro);
		return "/repertory/deploy";
	}
	@RequestMapping("setScell")
	public String setScell(Scell sce) {
		int i=service.addScell(sce.getStoreId(), sce.getProductId(),sce.getProductName(), sce.getMinAmount(), sce.getMaxAmount(),sce.getMaxCapacityAmount(), sce.getUnitOfStorage(), sce.getConfig(), sce.getRegister(), sce.getRegisterTime());
		if(i>0) {
			return "/repertory/back";
		}else {
			return"/repertory/errback";
		}
	}
	@RequestMapping("goPzaudit")
	public String goPzaudit() {
		return "/repertory/pzaudit";
		
	}
	@RequestMapping("selectshck")
	@ResponseBody
	public List<shkc> selectshck() {
		List<shkc> list=service.selectshkc();
		return list;
	}
	@RequestMapping("selectxxpz")
	public String selectxxpz(int id,Model model) {
		Scell scell=service.selectxxpz(id);
		model.addAttribute("scell", scell);
		return "/repertory/xxaudit";
	}
	@RequestMapping("upscell")
	public String upscell(Scell scell) {
		System.out.println("测试数据"+scell);
		int a=service.upscell(scell);
		if(a>0) {
			return "/repertory/pzback";
		}else {
			return"/repertory/errpzback";
		}
	}
	@RequestMapping("gopzlook")
	public String gopzlook(){
		return "/repertory/pzlook";
	}
	@RequestMapping("selectScell")
	@ResponseBody
	public List<Scell> selectScell(){
		List<Scell> list=service.selectScell();
		System.out.println("查询复核状态+");
		return list;
	}
	@RequestMapping("xxlook")
	public String xxlook(String bh,Model model){
		Scell scell=service.selectlook(bh);
		String tag=null;
		if(scell.getCheckTag()==0) {
			tag="等待复核";
		}else if(scell.getCheckTag()==1){
			tag="复核通过";
		}
		model.addAttribute("tag", tag);
		model.addAttribute("scell", scell);
		return "/repertory/xxlook";
		
	}

}
