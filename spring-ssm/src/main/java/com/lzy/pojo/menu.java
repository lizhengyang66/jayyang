package com.lzy.pojo;

public class menu {
private int id;
private int PARENT_ID;
private String name;
private String LINKURL;
private int TYPE;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getPARENT_ID() {
	return PARENT_ID;
}
public void setPARENT_ID(int pARENT_ID) {
	PARENT_ID = pARENT_ID;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLINKURL() {
	return LINKURL;
}
public void setLINKURL(String lINKURL) {
	LINKURL = lINKURL;
}
public int getTYPE() {
	return TYPE;
}
public void setTYPE(int tYPE) {
	TYPE = tYPE;
}
@Override
public String toString() {
	return "menu [id=" + id + ", PARENT_ID=" + PARENT_ID + ", name=" + name + ", LINKURL=" + LINKURL + ", TYPE=" + TYPE
			+ "]";
}
public menu(int id, int pARENT_ID, String name, String lINKURL, int tYPE) {
	super();
	this.id = id;
	PARENT_ID = pARENT_ID;
	this.name = name;
	LINKURL = lINKURL;
	TYPE = tYPE;
}
public menu() {
	super();
	// TODO Auto-generated constructor stub
}

}
