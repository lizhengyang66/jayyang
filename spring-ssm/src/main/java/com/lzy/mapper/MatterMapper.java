package com.lzy.mapper;

import java.awt.Menu;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lzy.pojo.D_module_details;
import com.lzy.pojo.Gradelevel;
import com.lzy.pojo.Product;
import com.lzy.pojo.Purposetype;
import com.lzy.pojo.d_module;
import com.lzy.pojo.sproduct;

public interface MatterMapper {
 List<Purposetype> selcate();//产品类别查询
 List<Gradelevel> selectpclass();//产品档次查询
 List<Product> selecId();//产品档案查询
 //物料查询
 List<d_module> selD_module();
 //查询产品设计单物料明细 
 List<D_module_details> selD_MODULE_DETAILS(String designId);
 //物料组成设计单
void productWlZc(String sjdh, int productid, String productname, String sjr, double d);
void modelWlZc(String sjdh, int bh, String mc, String sjr,String dw,int sl,double dj,double  zje);
//查询通过审核的商品档案信息
	List<sproduct> Selad(int pass,int Purposetypeid);
//显示登记人
	public List<Menu> selectPermission(String username);
	//李子阳添加审核
	int adddAudit();
}

