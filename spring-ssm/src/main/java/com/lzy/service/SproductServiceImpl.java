package com.lzy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lzy.mapper.SproductMapper;
import com.lzy.pojo.sproduct;



@Service
public class SproductServiceImpl implements SproductService{
	@Autowired
	SproductMapper mapper;

	@Override
	public List<sproduct> selectPro() {
		// TODO Auto-generated method stub
		return mapper.selectPro();
	}
	
	
}
