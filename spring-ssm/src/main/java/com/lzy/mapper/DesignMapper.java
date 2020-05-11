package com.lzy.mapper;

import java.util.List;

import com.lzy.pojo.CategoryYWB;
import com.lzy.pojo.Design;
import com.lzy.pojo.GradelevelYWB;
import com.lzy.pojo.Process;
import com.lzy.pojo.Product;
import com.lzy.pojo.Purposetype;

public interface DesignMapper {

	int addsign(int id, String name, String price, String user);

	List<Design> getdes();

	int getdesPass(int id);

	int nodesPass(int id);

	List<CategoryYWB> getcate();

	List<Purposetype> getpurpose();

	List<GradelevelYWB> getgradelevel();

	List<Product> getpro();

	List<Process> getprocess();

	void addpvd(int pid, int did);

	int adddesign(int pid, String pname, int cost, String user);

}
