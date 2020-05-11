package com.lzy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lzy.mapper.AuditMapper;
import com.lzy.mapper.DesignMapper;
import com.lzy.pojo.CategoryYWB;
import com.lzy.pojo.Design;
import com.lzy.pojo.GradelevelYWB;
import com.lzy.pojo.Process;
import com.lzy.pojo.Product;
import com.lzy.pojo.Purposetype;

@Service
@Transactional
public class DesignServiceimpl implements DesignService{
	@Autowired
	DesignMapper mapper;
	@Autowired
	AuditMapper mapper2;

	@Override
	public int addsign(int id, String name, String price, String user) {
		// TODO 自动生成的方法存根
		return mapper.addsign(id,name,price,user);
	}

	@Override
	public List<Design> getdes() {
		// TODO 自动生成的方法存根
		return mapper.getdes();
	}

	@Override
	public int getdesPass(int id) {
		// TODO 自动生成的方法存根
		return mapper.getdesPass(id);
	}

	@Override
	public int nodesPass(int id) {
		// TODO 自动生成的方法存根
		return mapper.nodesPass(id);
	}

	@Override
	public List<CategoryYWB> getcate() {
		// TODO 自动生成的方法存根
		return mapper.getcate();
	}

	@Override
	public List<Purposetype> getpurpose() {
		// TODO 自动生成的方法存根
		return mapper.getpurpose();
	}

	@Override
	public List<GradelevelYWB> getgradelevel() {
		// TODO 自动生成的方法存根
		return mapper.getgradelevel();
	}

	@Override
	public List<Product> getpro() {
		// TODO 自动生成的方法存根
		List<Product> list = mapper.getpro();
		for (Product p : list) {
			p.setCategory(mapper2.getCategory(p.getCategoryid()));
			p.setGradelevel(mapper2.getGradelevel(p.getGradelevelid()));
			p.setProductmanager(mapper2.getProductmanager(p.getProductmanagerid()));
			p.setPurposetypename(mapper2.getpurname(p.getPurposetypeid()));
		}
		return list;
	}

	@Override
	public List<Process> getprocess() {
		// TODO 自动生成的方法存根
		return mapper.getprocess();
	}

	@Override
	public void addpvd(int pid, int did) {
		// TODO 自动生成的方法存根
		mapper.addpvd(pid,did);
	}

	@Override
	public int adddesign(int pid, String pname, int cost, String user) {
		// TODO 自动生成的方法存根
		return mapper.adddesign(pid,pname,cost,user);
	}
}
