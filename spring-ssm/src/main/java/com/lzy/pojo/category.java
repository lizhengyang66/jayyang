package com.lzy.pojo;

public class category {
private int	categoryid;
private String categoryname;
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
@Override
public String toString() {
	return "category [categoryid=" + categoryid + ", categoryname=" + categoryname + "]";
}
public category(int categoryid, String categoryname) {
	super();
	this.categoryid = categoryid;
	this.categoryname = categoryname;
}
public category() {
	super();
	// TODO Auto-generated constructor stub
}
//产品类别表
}
