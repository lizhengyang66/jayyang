package com.lzy.service;

import java.util.List;

import com.lzy.pojo.CategoryYWB;
import com.lzy.pojo.GradelevelYWB;
import com.lzy.pojo.Product;
import com.lzy.pojo.ProductYWB;
import com.lzy.pojo.ProductmanagerYWB;
import com.lzy.pojo.PurposetypeYWB;
import com.lzy.pojo.sproduct;

public interface ProductService {

	//查询产品类别类别
	List<CategoryYWB> insertCategoryYWB();
	//查询产品用途类型
	List<PurposetypeYWB> insertPurposetypeYWB();
	//查询产品档次级别
	List<GradelevelYWB> insertGradelevelYWB();
	//查询产品客户经理
	List<ProductmanagerYWB> insertProductmanagerYWB();
	//添加产品登记
	public void addProductYWB(ProductYWB productYWB);
	//查询简表，从而删除
	List<sproduct> selectsp();
	//根据条件删除产品表
	int deleteProduct(int pid);
	
}
