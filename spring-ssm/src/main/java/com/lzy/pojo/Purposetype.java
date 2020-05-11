package com.lzy.pojo;

public class Purposetype {
private int	Purposetypeid;
private String Purposetypename;
public int getPurposetypeid() {
	return Purposetypeid;
}
public void setPurposetypeid(int purposetypeid) {
	Purposetypeid = purposetypeid;
}
public String getPurposetypename() {
	return Purposetypename;
}
public void setPurposetypename(String purposetypename) {
	Purposetypename = purposetypename;
}
@Override
public String toString() {
	return "Purposetype [Purposetypeid=" + Purposetypeid + ", Purposetypename=" + Purposetypename + "]";
}
public Purposetype(int purposetypeid, String purposetypename) {
	super();
	Purposetypeid = purposetypeid;
	Purposetypename = purposetypename;
}
public Purposetype() {
	super();
	// TODO Auto-generated constructor stub
}
//用途类别表
}
