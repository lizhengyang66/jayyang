package com.lzy.pojo;

public class Pvd {
	private int pid;
	private int did;
	int getPid() {
		return pid;
	}
	void setPid(int pid) {
		this.pid = pid;
	}
	int getDid() {
		return did;
	}
	void setDid(int did) {
		this.did = did;
	}
	public Pvd(int pid, int did) {
		super();
		this.pid = pid;
		this.did = did;
	}
	public Pvd() {
		super();
	}
	@Override
	public String toString() {
		return "Pvd [pid=" + pid + ", did=" + did + "]";
	}
}
