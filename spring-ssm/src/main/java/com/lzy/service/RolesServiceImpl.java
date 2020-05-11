package com.lzy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lzy.mapper.RolesMapper;
import com.lzy.pojo.MenuList;

@Service
public class RolesServiceImpl implements RolesService {
	@Autowired
	RolesMapper mapper;
	@Override
	public List<MenuList> selectAll(int uid) {
		System.out.println("进入了service"+uid);
		List<MenuList> list=mapper.selectAll(uid,0);
		System.out.println("q1");
		for (MenuList menuList : list) {
			List<MenuList> childMenus=mapper.selectAll(uid,menuList.getId());
			System.out.println("q2");
			
			menuList.setChildMenu(childMenus);
		}
		return list;
	}
	
}
