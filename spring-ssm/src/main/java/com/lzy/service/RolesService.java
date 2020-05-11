package com.lzy.service;

import java.util.List;

import com.lzy.pojo.MenuList;

public interface RolesService {
	List<MenuList> selectAll(int uid);

}
