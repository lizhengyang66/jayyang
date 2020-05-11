package com.lzy.mapper;

import java.util.List;

import com.lzy.pojo.Product;
import com.lzy.pojo.Scell;
import com.lzy.pojo.shkc;
import com.lzy.pojo.sproduct;

public interface RepertoryMapper {
	List<sproduct> selectsp();
	Product selectpro(int id);
	int addScell(String storeId,String productId,String productName,int minAmount,int maxAmount,int maxCapacityAmount,String unitOfStorage,String config,String register,String registerTime);
	List<shkc> selectshkc();
	Scell selectxxpz(int id);
	int upscell(Scell scell);
	List<Scell> selectScell();
	Scell selectlook(String storeid);
}
