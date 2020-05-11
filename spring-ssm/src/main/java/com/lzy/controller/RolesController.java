package com.lzy.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lzy.pojo.MenuList;
import com.lzy.pojo.Users;
import com.lzy.service.RolesService;

@Controller
public class RolesController {
	@Autowired
	RolesService rservice;
	
	/*@RequestMapping("/selectAllMenu")
	public @ResponseBody List<MenuList> selectMenu(HttpSession session){
		Users user=(Users) session.getAttribute("user");
		System.out.println("++++++++++++++++++++++++++"+user.getId());
		List<MenuList> menus=rservice.selectAll(user.getId());
		System.out.println(menus);
		return menus;
	}*/
	@RequestMapping("/selectAllMenu")
	public  String selectMenu(HttpSession session,Model model){
		Users user=(Users) session.getAttribute("user");
		System.out.println("进入了权限"+user.getId());
		List<MenuList> menus=rservice.selectAll(user.getId());
		System.out.println(menus);
		model.addAttribute("list", menus);
		return "/user/left";
	}
	

}
