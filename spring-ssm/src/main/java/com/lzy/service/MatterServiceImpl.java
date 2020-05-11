package com.lzy.service;

import java.awt.Menu;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lzy.mapper.MatterMapper;
import com.lzy.pojo.D_module_details;
import com.lzy.pojo.Gradelevel;
import com.lzy.pojo.Product;
import com.lzy.pojo.Purposetype;
import com.lzy.pojo.Users;
import com.lzy.pojo.category;
import com.lzy.pojo.d_module;
import com.lzy.pojo.sproduct;

@Service
@Transactional
public class MatterServiceImpl implements MatterService{
	@Autowired
	MatterMapper mapper;

	@Override
	public List<Purposetype> selcate() {
		// TODO Auto-generated method stub
		return mapper.selcate();
	}

	@Override
	public List<Gradelevel> selectpclass() {
		// TODO Auto-generated method stub
		return mapper.selectpclass();
	}

	@Override
	public List<Product> selecId() {
		// TODO Auto-generated method stub
		return mapper.selecId();
	}

	@Override
	public List<d_module> selD_module() {
		// TODO Auto-generated method stub
		return mapper.selD_module();
	}

	@Override
	public void productWlZc(String sjdh, int productid, String productname, String sjr, double d) {
		// TODO Auto-generated method stub
		//李子阳审核
		mapper.adddAudit();
		mapper.productWlZc(sjdh, productid, productname, sjr, d);
	}


	@Override
	public List<Menu> selectPermission(String username) {
		// TODO Auto-generated method stub
		return mapper.selectPermission(username);
	}

	@Override
	public List<sproduct> Selad(int pass, int Purposetypeid) {
		// TODO Auto-generated method stub
		return mapper.Selad(pass, Purposetypeid);
	}

	@Override
	public List<D_module_details> selD_MODULE_DETAILS(String design_id) {
		// TODO Auto-generated method stub
		return mapper.selD_MODULE_DETAILS(design_id);
	}

	@Override
	public String sjbh() {
		// TODO Auto-generated method stub
		String id="";
		SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddHHmmss");    	
		String temp = sf.format(new Date());	
		int random=(int) (Math.random()*10000);		
		id=temp+random;	
		return id;
	}

	@Override
	public void modelWlZc(String sjdh, int bh, String mc, String sjr, String dw, int sl,
			double dj, double zje) {
		// TODO Auto-generated method stub
		mapper.modelWlZc(sjdh, bh,mc, sjr, dw, sl, dj, zje);
	}

	

}
