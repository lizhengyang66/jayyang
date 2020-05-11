package com.lzy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lzy.mapper.AuditMapper;
import com.lzy.pojo.Audit;
import com.lzy.pojo.Daudit;
@Service
@Transactional
public class AuditServiceimpl implements AuditService {
	@Autowired
	AuditMapper mapper;
	@Override
	public List<Audit> getall() {
		// TODO 自动生成的方法存根
		List<Audit> list = mapper.getall();
		System.out.println(list);
		for (Audit audit : list) {
			System.out.println(audit.getpId());
			audit.setProduct(mapper.getpro(audit.getpId()));
			audit.getProduct().setCategory(mapper.getCategory(audit.getProduct().getCategoryid()));
			audit.getProduct().setGradelevel(mapper.getGradelevel(audit.getProduct().getGradelevelid()));
			audit.getProduct().setProductmanager(mapper.getProductmanager(audit.getProduct().getProductmanagerid()));
			audit.getProduct().setPurposetypename(mapper.getpurname(audit.getProduct().getPurposetypeid()));
		}
		return list;
	}
	@Override
	public int getPass(int id) {
		// TODO 自动生成的方法存根
		return mapper.getPass(id);
	}
	@Override
	public int noPass(int id) {
		// TODO 自动生成的方法存根
		return mapper.noPass(id);
	}
	@Override
	public List<Daudit> selectDaudit() {
		// TODO Auto-generated method stub
		return mapper.selectDaudit();
	}
	@Override
	public int yespass(int id) {
		// TODO Auto-generated method stub
		return mapper.yespass(id);
	}
	@Override
	public int notpass(int id) {
		// TODO Auto-generated method stub
		return mapper.notpass(id);
	}
	@Override
	public int addcAudit(int id) {
		// TODO Auto-generated method stub
		return mapper.addcAudit(id);
	}

}
