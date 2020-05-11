package com.lzy.pojo;

public class Process {
	private int pid;
	private String pname;
	private String msg;
	private String hour;
	private String hourcost;
	private String sum;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getHour() {
		return hour;
	}
	public void setHour(String hour) {
		this.hour = hour;
	}
	public String getHourcost() {
		return hourcost;
	}
	public void setHourcost(String hourcost) {
		this.hourcost = hourcost;
	}
	public String getSum() {
		return sum;
	}
	public void setSum(String sum) {
		this.sum = sum;
	}
	public Process(int pid, String pname, String msg, String hour, String hourcost, String sum) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.msg = msg;
		this.hour = hour;
		this.hourcost = hourcost;
		this.sum = sum;
	}
	public Process() {
		super();
	}
	@Override
	public String toString() {
		return "Process [pid=" + pid + ", pname=" + pname + ", msg=" + msg + ", hour=" + hour + ", hourcost=" + hourcost
				+ ", sum=" + sum + "]";
	}
	
}
