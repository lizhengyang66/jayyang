package com.lzy.mapper;

import java.util.List;

import com.lzy.pojo.MenuList;
/*
 * 查询权限业务
 */
public interface RolesMapper {
	//查询当前用户菜单的方法
	public List<MenuList> selectAll(int uid,int mid);

}
