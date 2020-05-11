package com.lzy.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lzy.pojo.Gradelevel;
import com.lzy.pojo.Products;
import com.lzy.pojo.Purposetype;
import com.lzy.pojo.category;
import com.lzy.pojo.productmanager;
import com.lzy.pojo.sproduct;
import com.lzy.service.ProductService;
import com.lzy.service.ProductsService;
import com.lzy.service.SproductService;

@Controller
public class ProductController {
	@Autowired
	ProductService pservice;
	@Autowired
	ProductsService service2;
	@Autowired
	SproductService service3;
	
	@RequestMapping("/selectspro")
	@ResponseBody
	public List<sproduct> selectspro() {
		List<sproduct> spr=pservice.selectsp();
		System.out.println(spr);
		return spr;
	}
	
	@RequestMapping("/supmian")
	public String gosupmian() {
		return "/user/upmian";
	}
	
	@RequestMapping("/delectsorp")
	@ResponseBody
	public String delectsorp(int pid){
		int c=pservice.deleteProduct(pid);
		if(c>1) {
			return "操作成功";
		}else{
			return "操作失败";
		}
		
	}
	@RequestMapping("/updatePro3")
	public String getupdatePro(Products product,HttpServletRequest request,Model model) {
		Products prod=service2.selectId(product.getProductid());
		System.out.println(prod);
		List<category> cat=service2.selCate();
		List<Purposetype> pur=service2.selPurp();
		List<Gradelevel> gra=service2.selGra();
		List<productmanager> jl=service2.seljl();
		model.addAttribute("cat", cat);
		model.addAttribute("pur", pur);
		model.addAttribute("gra", gra);
		model.addAttribute("jl", jl);
		model.addAttribute("product", prod);
		return "/user/updatePro";
	}
	
   @RequestMapping("/updatePro2")
	public String updatepro2(Products pro2,HttpServletRequest request,Model model){  
	   System.out.println("进入修改");
		System.out.println(pro2);
		int a=service2.updatePro(pro2);
    	if(a>0) {
    		pro2=service2.selectId(pro2.getProductid());
    		model.addAttribute("product", pro2);
    		return "/user/selectPro"; 
    	}
    	return "/test";
    } 
   @RequestMapping("/goselectPro")
   public String goselectPro() {
	return "/user/selectPro";
   }
   @RequestMapping("/selectP")
   @ResponseBody
   public List<sproduct> getSeleteP() {
	   List<sproduct> list=service3.selectPro();
	   System.out.println(list);
	return list;
   }
}
