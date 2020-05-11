package com.lzy.controller;

import java.awt.Menu;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lzy.pojo.D_module_details;
import com.lzy.pojo.Gradelevel;
import com.lzy.pojo.Product;
import com.lzy.pojo.Purposetype;
import com.lzy.pojo.d_module;
import com.lzy.pojo.sproduct;
import com.lzy.service.MatterService;

@Controller
public class MatterController {
	@Autowired
	MatterService service;
	//产品类型查询
	@RequestMapping("selecttype")
	@ResponseBody   
	public List<Purposetype> selecttype(){
		return service.selcate();
	}
	@RequestMapping("gomatter")
	public String  gomatter(Model model) {
		//跳转到test。html
		String sjbh=service.sjbh();//获取物料组成页面的随机数编号
		model.addAttribute("sjbh", sjbh);
		return "user/Matter";
		
	}

	//产品档次查询
	@RequestMapping("selectpclass")
	@ResponseBody   
	public List<Gradelevel> selectpclass(){
		return service.selectpclass();
	}
	
	//产品档案查询
		@RequestMapping("/selD_fileId")
		@ResponseBody
		public  List<Product> selectId() {
			List<Product> list=service.selecId();
			return list;
		}
	//物料查询	
		@RequestMapping("/selD_module")
		@ResponseBody
		public  List<d_module> selD_module() {
			List<d_module> list=service.selD_module();
			System.out.println(list);
			return list;
		}
		 //查询产品设计单物料明细 
		@RequestMapping("/selD_module_details")
		@ResponseBody
		public  List<D_module_details> selD_MODULE_DETAILS(String design_id) {
			List<D_module_details> list=service.selD_MODULE_DETAILS(design_id);
			System.out.println(list);
			return list;
		}
		//物料组成设计单
		@RequestMapping("/productWlZc")
		@ResponseBody
	    public List<D_module_details> productWlZc(@RequestParam("bh") int[] bh,@RequestParam("mc") String[] mc,@RequestParam("lx") String[] lx,@RequestParam("dc") String[] dc,@RequestParam("sl") int[] sl,@RequestParam("dw") String[] dw,@RequestParam("dj") double[] dj,@RequestParam("productid") int productid,@RequestParam("productname") String productname,@RequestParam("sjdh") String sjdh,@RequestParam("sjr") String sjr) {		
	    	System.out.println("进入控制台");
	    	double zje =0;
	    	List<D_module_details> list = new ArrayList<D_module_details>();
			for (int i = 0; i < dj.length; i++) {
				D_module_details dmd = new D_module_details(bh[i],mc[i],dw[i],sl[i],dj[i],sl[i]*dj[i],lx[i],dc[i]);
				zje +=sl[i]*dj[i];
				list.add(dmd);
				service.modelWlZc(sjdh, bh[i], mc[i], sjr, dw[i], sl[i], dj[i], zje);
			}
			System.out.println("进入控制台2");
			service.productWlZc(sjdh,productid,productname,sjr,zje);
			return list;
		}	
	    
	  //查询通过审核的商品档案信息
		@RequestMapping("/Selad")
		@ResponseBody
		public List<sproduct> Selad() {
			List<sproduct> list=service.Selad(1,1);
            System.out.println(list);
			return list;
		}
		
		//查询通过审核的物料信息
		@RequestMapping("/Selad2")
		@ResponseBody
		public List<sproduct> Selad2() {
			List<sproduct> list=service.Selad(1,2);
			System.out.println(list);
			return list;
		}
		//显示登记人
		@RequestMapping("/selectPermission")
		@ResponseBody
		public List<Menu> selectPermission(HttpSession session){
			String username = (String) session.getAttribute("username");
			List<Menu> list = service.selectPermission(username);
			System.out.println(list);
			return list;
		}
		@RequestMapping("/Mattertwo")
		public String matter() {
			return "/user/Mattertwo";
		}
		
}
