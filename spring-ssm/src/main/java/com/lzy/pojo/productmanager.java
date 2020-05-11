package com.lzy.pojo;

public class productmanager {
private int	productmanagerid;
private String productmanagername;
public int getProductmanagerid() {
	return productmanagerid;
}
public void setProductmanagerid(int productmanagerid) {
	this.productmanagerid = productmanagerid;
}
public String getProductmanagername() {
	return productmanagername;
}
public void setProductmanagername(String productmanagername) {
	this.productmanagername = productmanagername;
}
@Override
public String toString() {
	return "productmanager [productmanagerid=" + productmanagerid + ", productmanagername=" + productmanagername + "]";
}
public productmanager() {
	super();
	// TODO Auto-generated constructor stub
}
public productmanager(int productmanagerid, String productmanagername) {
	super();
	this.productmanagerid = productmanagerid;
	this.productmanagername = productmanagername;
}
//产品经纪人表
}
