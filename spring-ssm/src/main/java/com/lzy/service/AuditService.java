package com.lzy.service;

import java.util.List;

import com.lzy.pojo.Audit;
import com.lzy.pojo.Daudit;

public interface AuditService {

	List<Audit> getall();

	int getPass(int id);

	int noPass(int id);
	
	List<Daudit> selectDaudit();
	
	int yespass(int id);
	
	int notpass(int id);
	
	int addcAudit(int id);
}
