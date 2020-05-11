package com.lzy.pojo;

import java.util.List;

public class Audit {
	private int pId;
	private String aDate;
	private int pass;
	private Product product;
	public Audit() {
		super();
	}
	public Audit(int pId, String aDate, int pass, Product product) {
		super();
		this.pId = pId;
		this.aDate = aDate;
		this.pass = pass;
		this.product = product;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getaDate() {
		return aDate;
	}
	public void setaDate(String aDate) {
		this.aDate = aDate;
	}
	public int getPass() {
		return pass;
	}
	public void setPass(int pass) {
		this.pass = pass;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "Audit [pId=" + pId + ", aDate=" + aDate + ", pass=" + pass + ", product=" + product + "]";
	}
	
	
}
