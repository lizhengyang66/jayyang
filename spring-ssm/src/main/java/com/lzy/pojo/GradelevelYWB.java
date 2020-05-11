package com.lzy.pojo;

//档次级别表
public class GradelevelYWB {
	private int Gradelevelid; //档次级别id序列
	private String Gradelevelname; //档次级别名称
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
	public GradelevelYWB(int gradelevelid, String gradelevelname) {
		super();
		Gradelevelid = gradelevelid;
		Gradelevelname = gradelevelname;
	}
	public GradelevelYWB() {
		super();
	}
	
	
}
