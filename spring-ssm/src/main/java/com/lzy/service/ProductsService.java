package com.lzy.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.lzy.pojo.Gradelevel;

import com.lzy.pojo.Products;
import com.lzy.pojo.Purposetype;
import com.lzy.pojo.category;
import com.lzy.pojo.productmanager;
import com.lzy.pojo.sproduct;

public interface ProductsService {
	
	int updatePro(Products product);	//产品修改
	
	Products selectId(int productid);   		//根据id查询
	
	List<category> selCate();			//根据id查询类别表
	
	List<Purposetype> selPurp();		//根据id查询用途表
	
	List<Gradelevel> selGra();			//根据id查询档次级别表
	
	List<productmanager> seljl();			//根据id查询经理表
	
	int deletePro(int productid);			    //根据id删除
	
	List<sproduct> selectPro();   		//查询产品部分信息
}
