package com.lzy.pojo;

public class Daudit {
	private Integer d_id;
	private Integer pass;
	private String design_id;
	private Integer productid;
	private String productname;
	private  String designer;
	private String Filingtime;
	private double cost_price_sum;
	public Daudit() {
		super();
	}
	public Daudit(Integer d_id, Integer pass, String design_id, Integer productid, String productname, String designer,
			String filingtime, double cost_price_sum) {
		super();
		this.d_id = d_id;
		this.pass = pass;
		this.design_id = design_id;
		this.productid = productid;
		this.productname = productname;
		this.designer = designer;
		Filingtime = filingtime;
		this.cost_price_sum = cost_price_sum;
	}
	public Integer getD_id() {
		return d_id;
	}
	public void setD_id(Integer d_id) {
		this.d_id = d_id;
	}
	public Integer getPass() {
		return pass;
	}
	public void setPass(Integer pass) {
		this.pass = pass;
	}
	public String getDesign_id() {
		return design_id;
	}
	public void setDesign_id(String design_id) {
		this.design_id = design_id;
	}
	public Integer getProductid() {
		return productid;
	}
	public void setProductid(Integer productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getDesigner() {
		return designer;
	}
	public void setDesigner(String designer) {
		this.designer = designer;
	}
	public String getFilingtime() {
		return Filingtime;
	}
	public void setFilingtime(String filingtime) {
		Filingtime = filingtime;
	}
	public double getCost_price_sum() {
		return cost_price_sum;
	}
	public void setCost_price_sum(double cost_price_sum) {
		this.cost_price_sum = cost_price_sum;
	}
	@Override
	public String toString() {
		return "Daudit [d_id=" + d_id + ", pass=" + pass + ", design_id=" + design_id + ", productid=" + productid
				+ ", productname=" + productname + ", designer=" + designer + ", Filingtime=" + Filingtime
				+ ", cost_price_sum=" + cost_price_sum + "]";
	}
	
}
