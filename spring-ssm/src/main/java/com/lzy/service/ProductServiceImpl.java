package com.lzy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lzy.mapper.ProductMapper;
import com.lzy.pojo.CategoryYWB;
import com.lzy.pojo.GradelevelYWB;
import com.lzy.pojo.ProductYWB;
import com.lzy.pojo.ProductmanagerYWB;
import com.lzy.pojo.PurposetypeYWB;
import com.lzy.pojo.sproduct;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductMapper mapper;//产品mapper

	@Override
	public List<CategoryYWB> insertCategoryYWB() {
		// 产品类别
		return mapper.insertCategoryYWB();
	}

	@Override
	public List<PurposetypeYWB> insertPurposetypeYWB() {
		// 产品用途类别
		return mapper.insertPurposetypeYWB();
	}

	@Override
	public List<GradelevelYWB> insertGradelevelYWB() {
		// 产品档次
		return mapper.insertGradelevelYWB();
	}

	@Override
	public List<ProductmanagerYWB> insertProductmanagerYWB() {
		// 客户经理
		return mapper.insertProductmanagerYWB();
	}

	@Override
	public void addProductYWB(ProductYWB productYWB) {
		//添加产品登记表
		mapper.addProductYWB(productYWB);
		mapper.addAudit();
	}

	@Override
	public List<sproduct> selectsp() {
		// TODO Auto-generated method stub
		return mapper.selectsp();
	}

	@Override
	public int deleteProduct(int pid) {
	int a=mapper.deleteProduct(pid);
	int b=mapper.deleteAudit(pid);
	int c=a+b;
		return c;
	}

}
