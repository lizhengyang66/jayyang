package com.lzy.pojo;

public class d_module {
private int id;
private String designId;
private int productid;
private String productname;
private String designer;
private String module_describe;
private double cost_price_sum;
private String Registrant;
private String Filingtime;
private String checker;
private String check_time;
private String changer;
private String change_time;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getDesignId() {
	return designId;
}
public void setDesign_id(String designId) {
	this.designId = designId;
}
public int getProductid() {
	return productid;
}
public void setProductid(int productid) {
	this.productid = productid;
}
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public String getDesigner() {
	return designer;
}
public void setDesigner(String designer) {
	this.designer = designer;
}
public String getModule_describe() {
	return module_describe;
}
public void setModule_describe(String module_describe) {
	this.module_describe = module_describe;
}
public double getCost_price_sum() {
	return cost_price_sum;
}
public void setCost_price_sum(double cost_price_sum) {
	this.cost_price_sum = cost_price_sum;
}
public String getRegistrant() {
	return Registrant;
}
public void setRegistrant(String registrant) {
	Registrant = registrant;
}
public String getFilingtime() {
	return Filingtime;
}
public void setFilingtime(String filingtime) {
	Filingtime = filingtime;
}
public String getChecker() {
	return checker;
}
public void setChecker(String checker) {
	this.checker = checker;
}
public String getCheck_time() {
	return check_time;
}
public void setCheck_time(String check_time) {
	this.check_time = check_time;
}
public String getChanger() {
	return changer;
}
public void setChanger(String changer) {
	this.changer = changer;
}
public String getChange_time() {
	return change_time;
}
public void setChange_time(String change_time) {
	this.change_time = change_time;
}
@Override
public String toString() {
	return "d_module [id=" + id + ", design_id=" + designId + ", productid=" + productid + ", productname="
			+ productname + ", designer=" + designer + ", module_describe=" + module_describe + ", cost_price_sum="
			+ cost_price_sum + ", Registrant=" + Registrant + ", Filingtime=" + Filingtime + ", checker=" + checker
			+ ", check_time=" + check_time + ", changer=" + changer + ", change_time=" + change_time + "]";
}
public d_module(int id, String designId, int productid, String productname, String designer, String module_describe,
		double cost_price_sum, String registrant, String filingtime, String checker, String check_time, String changer,
		String change_time) {
	super();
	this.id = id;
	this.designId = designId;
	this.productid = productid;
	this.productname = productname;
	this.designer = designer;
	this.module_describe = module_describe;
	this.cost_price_sum = cost_price_sum;
	Registrant = registrant;
	Filingtime = filingtime;
	this.checker = checker;
	this.check_time = check_time;
	this.changer = changer;
	this.change_time = change_time;
}
public d_module() {
	super();
	// TODO Auto-generated constructor stub
}
//物料设计单表
}
