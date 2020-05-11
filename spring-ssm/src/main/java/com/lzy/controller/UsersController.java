package com.lzy.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lzy.pojo.CategoryYWB;
import com.lzy.pojo.Goods;
import com.lzy.pojo.GradelevelYWB;
import com.lzy.pojo.MenuList;
import com.lzy.pojo.ProductYWB;
import com.lzy.pojo.ProductmanagerYWB;
import com.lzy.pojo.PurposetypeYWB;
import com.lzy.pojo.Users;
import com.lzy.service.GoodsService;
import com.lzy.service.ProductService;
import com.lzy.service.RolesService;
import com.lzy.service.UsersService;

@Controller
public class UsersController {
	@Autowired
	GoodsService service;
	@Autowired
	UsersService uservice;
	@Autowired
	ProductService serviceywb;
	@Autowired
	RolesService rservice;
	//以下全部是测试
	//进入登录页面
	@RequestMapping("/gologin")
	public String login2() {
		return "/login";
		
	}
	
	@RequestMapping("/all")
	public String getGoodsAll(Model model) {
		List<Goods> list=service.selectAll();
		model.addAttribute("list",list);
		System.out.println("333");
		return "goodsList";
	}
	@RequestMapping("/selectwu")
	public String hello() {
		return "/user/test2";
		
	}
	@RequestMapping("/add")
	public String login() {
		System.out.println("1");
		return"addgood";
	}
	/**
	 * 以下是正式代码
	 */
	//登录认证
		@RequestMapping("/login2")
		public String login(String username,String password,Model model,HttpSession session) {
			System.out.println("进入到控制类");
			/**
			 * 使用Shiro编写认证
			 */
			//获取Subjet
			Subject subjet=SecurityUtils.getSubject();
			
			//2.封装用户数据
			UsernamePasswordToken token=new UsernamePasswordToken(username,password);
			//3.执行登录方法
			try {
				subjet.login(token);
				//登录成功
				//跳转到test。html
				//return "/user/test";
				Users user=uservice.findByName(username);
				session.setAttribute("user", user);
				model.addAttribute("users", user);
				return "/user/index";
				//rediret:重定向
			} catch (UnknownAccountException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				//登录失败:用户名不存在
				model.addAttribute("msg", "用户名或密码不正确");
				return "login";
			} catch (IncorrectCredentialsException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				//登录失败:密码错误
				model.addAttribute("msg", "用户名或密码不正确");
				return "login";
			}
			
		}
		//姚文斌

		@RequestMapping("/addUser")
		public String addUser(ProductYWB productYWB) { 
			serviceywb.addProductYWB(productYWB);
			System.out.println("成功");
			return "/user/test";
		}
		//查询下拉框
		@RequestMapping("/selectxia")
		public String select(Model model) {
			List<CategoryYWB> list1=serviceywb.insertCategoryYWB();
			List<PurposetypeYWB> list2=serviceywb.insertPurposetypeYWB();
			List<GradelevelYWB> list3=serviceywb.insertGradelevelYWB();
			List<ProductmanagerYWB> list4=serviceywb.insertProductmanagerYWB();
			model.addAttribute("list1",list1);
			model.addAttribute("list2",list2);
			model.addAttribute("list3",list3);
			model.addAttribute("list4",list4);
			return "/user/test";
		}
		@RequestMapping("/main")
		public String gocom() {
			return "/user/main";
			
		}
		@RequestMapping("/top")
		public String top() {
			return "/user/top";
		}
}
