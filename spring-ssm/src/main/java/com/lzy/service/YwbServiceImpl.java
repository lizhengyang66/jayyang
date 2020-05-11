package com.lzy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lzy.mapper.YwbMapper;
import com.lzy.pojo.M_APPLY;

@Service
public class YwbServiceImpl implements YwbService{
	@Autowired
	YwbMapper mapper;

	//生产计划
	@Override
	public void ywbadd(M_APPLY mapply) {
		// TODO Auto-generated method stub
		 mapper.ywbadd(mapply);
	}

}
