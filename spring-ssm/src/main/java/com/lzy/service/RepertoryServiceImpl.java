package com.lzy.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lzy.mapper.RepertoryMapper;
import com.lzy.pojo.Product;
import com.lzy.pojo.Scell;
import com.lzy.pojo.shkc;
import com.lzy.pojo.sproduct;

@Service
public class RepertoryServiceImpl implements RepertoryService {
	@Autowired
	RepertoryMapper mapper;

	@Override
	public List<sproduct> selectsp() {
		// TODO Auto-generated method stub
		return mapper.selectsp();
	}

	@Override
	public Product selectpro(int id) {
		// TODO Auto-generated method stub
		return mapper.selectpro(id);
	}

	@Override
	public String cpbh() {
		String id="";
		SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddHHmmss");    	
		String temp = sf.format(new Date());	
		int random=(int) (Math.random()*10000);		
		id=temp+random;	
		return id;
	}

	@Override
	public int addScell(String storeId, String productId, String productName, int minAmount, int maxAmount,
			int maxCapacityAmount, String unitOfStorage, String config, String register, String registerTime) {
		// TODO Auto-generated method stub
		return mapper.addScell(storeId, productId, productName, minAmount, maxAmount, maxCapacityAmount, unitOfStorage, config, register, registerTime);
	}

	@Override
	public List<shkc> selectshkc() {
		// TODO Auto-generated method stub
		return mapper.selectshkc();
	}

	@Override
	public Scell selectxxpz(int id) {
		// TODO Auto-generated method stub
		return mapper.selectxxpz(id) ;
	}

	@Override
	public int upscell(Scell scell) {
		// TODO Auto-generated method stub
		return mapper.upscell(scell);
	}

	@Override
	public List<Scell> selectScell() {
		// TODO Auto-generated method stub
		return mapper.selectScell();
	}

	@Override
	public Scell selectlook(String storeid) {
		// TODO Auto-generated method stub
		return mapper.selectlook(storeid);
	}

}
