package com.lzy.mapper;

import java.util.List;

import com.lzy.pojo.CategoryYWB;
import com.lzy.pojo.GradelevelYWB;
import com.lzy.pojo.ProductYWB;
import com.lzy.pojo.ProductmanagerYWB;
import com.lzy.pojo.PurposetypeYWB;
import com.lzy.pojo.sproduct;

public interface ProductMapper {

	//查询产品类别类别
	public List<CategoryYWB> insertCategoryYWB();
	//查询产品用途类型
	public List<PurposetypeYWB> insertPurposetypeYWB();
	//查询产品档次级别
	public List<GradelevelYWB> insertGradelevelYWB();
	//查询产品客户经理
	public List<ProductmanagerYWB> insertProductmanagerYWB();
	//添加产品登记
	public void addProductYWB(ProductYWB productYWB);
	//添加到审核表
	public void addAudit();
	//查询简表从而删除
	List<sproduct> selectsp();
	//根据id删除产品表
	int deleteProduct(int pid);
	//根据id删除第一个审核表
	int deleteAudit(int pid);
	int adddAudit();
}
