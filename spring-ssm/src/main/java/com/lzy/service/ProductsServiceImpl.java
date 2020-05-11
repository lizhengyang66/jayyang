package com.lzy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lzy.mapper.ProductsMapper;
import com.lzy.pojo.Gradelevel;
import com.lzy.pojo.Products;
import com.lzy.pojo.Purposetype;
import com.lzy.pojo.category;
import com.lzy.pojo.productmanager;
import com.lzy.pojo.sproduct;
@Service
public class ProductsServiceImpl implements ProductsService{

	@Autowired
	ProductsMapper mapper;
	@Override
	public int updatePro(Products product) {
		// TODO Auto-generated method stub
		return mapper.updatePro(product);
	}

	@Override
	public Products selectId(int productid) {
		// TODO Auto-generated method stub
		return mapper.selectId(productid);
	}

	@Override
	public int deletePro(int productid) {
		// TODO Auto-generated method stub
		return mapper.deletePro(productid);
	}

	@Override
	public List<category> selCate() {
		// TODO Auto-generated method stub
		return mapper.selCate();
	}

	@Override
	public List<Purposetype> selPurp() {
		// TODO Auto-generated method stub
		return mapper.selPurp();
	}

	@Override
	public List<Gradelevel> selGra() {
		// TODO Auto-generated method stub
		return mapper.selGra();
	}

	@Override
	public List<productmanager> seljl() {
		// TODO Auto-generated method stub
		return mapper.seljl();
	}

	@Override
	public List<sproduct> selectPro() {
		// TODO Auto-generated method stub
		return mapper.selectPro();
	}

}
