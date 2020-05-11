package com.lzy.pojo;

//产品类别表
public class CategoryYWB {
	private int categoryid; //产品类别id
	private String categoryname; //产品类别名称
	public int getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	public CategoryYWB(int categoryid, String categoryname) {
		super();
		this.categoryid = categoryid;
		this.categoryname = categoryname;
	}
	public CategoryYWB() {
		super();
	}
	
	

}
