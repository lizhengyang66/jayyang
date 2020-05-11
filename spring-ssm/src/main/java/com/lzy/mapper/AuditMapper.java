package com.lzy.mapper;

import java.util.List;

import com.lzy.pojo.Audit;
import com.lzy.pojo.CategoryYWB;
import com.lzy.pojo.Daudit;
import com.lzy.pojo.GradelevelYWB;
import com.lzy.pojo.Product;
import com.lzy.pojo.ProductmanagerYWB;

public interface AuditMapper {

	List<Audit> getall();

	Product getpro(int p_id);

	int getPass(int id);

	int noPass(int id);

	CategoryYWB getCategory(int categoryid);

	GradelevelYWB getGradelevel(int gradelevelid);

	ProductmanagerYWB getProductmanager(int productmanagerid);

	String getpurname(int purposetypeid);
	//李子阳写的查询所有权限列表
	List<Daudit> selectDaudit();
	
	int yespass(int id);
	
	int notpass(int id);
	
	int addcAudit(int id);
}
