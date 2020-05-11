package com.lzy.pojo;
//用途类型表
public class PurposetypeYWB {
	private int Purposetypeid; //用途类型id序列
	private String Purposetypename; //用途类型名称
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
	public PurposetypeYWB(int purposetypeid, String purposetypename) {
		super();
		Purposetypeid = purposetypeid;
		Purposetypename = purposetypename;
	}
	public PurposetypeYWB() {
		super();
	}
	
	
}
