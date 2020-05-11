package com.lzy.pojo;
//产品经理表
public class ProductmanagerYWB {
	private int productmanagerid; //产品经理id编号
	private String productmanagername; //产品经理名称
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
	public ProductmanagerYWB(int productmanagerid, String productmanagername) {
		super();
		this.productmanagerid = productmanagerid;
		this.productmanagername = productmanagername;
	}
	public ProductmanagerYWB() {
		super();
	}
	
	

}
