package com.lzy.pojo;

public class Gradelevel {
private int Gradelevelid;
private String Gradelevelname;
public int getGradelevelid() {
	return Gradelevelid;
}
public void setGradelevelid(int gradelevelid) {
	Gradelevelid = gradelevelid;
}
public String getGradelevelname() {
	return Gradelevelname;
}
public void setGradelevelname(String gradelevelname) {
	Gradelevelname = gradelevelname;
}
@Override
public String toString() {
	return "Gradelevel [Gradelevelid=" + Gradelevelid + ", Gradelevelname=" + Gradelevelname + "]";
}
public Gradelevel(int gradelevelid, String gradelevelname) {
	super();
	Gradelevelid = gradelevelid;
	Gradelevelname = gradelevelname;
}
public Gradelevel() {
	super();
	// TODO Auto-generated constructor stub
}
//档次类别表
}
