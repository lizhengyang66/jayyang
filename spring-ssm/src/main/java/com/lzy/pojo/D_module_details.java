package com.lzy.pojo;

public class D_module_details {

	private int id;//'序号',
	private String design_id;//设计编号',
	private int productid;//物料编号',
	private String productname;//物料名称',
	private String productdescribe;//描述
	private String amount_unit;//单位
	private int amount;//数量',
	private double cost_price;//'单价',
	private double subtotal;//'小计'
	
	private String lx;//用途类型
	private String dc;
	
	public D_module_details() {
		super();
	}


	public D_module_details(int bh, String productname, String amount_unit, int amount, double cost_price,
			double subtotal, String lx,String dc) {
		super();
		this.productid = bh;
		this.productname = productname;
		this.amount_unit = amount_unit;
		this.amount = amount;
		this.cost_price = cost_price;
		this.subtotal = subtotal;
		this.lx = lx;
		this.dc = dc;
	}
	public D_module_details(int id, String design_id, int productid, String productname, String productdescribe,
			String amount_unit, int amount, double cost_price, double subtotal, String lx,
			String dc) {
		super();
		this.id = id;
		this.design_id = design_id;
		this.productid = productid;
		this.productname = productname;
		this.productdescribe = productdescribe;
		this.amount_unit = amount_unit;
		this.amount = amount;
		this.cost_price = cost_price;
		this.subtotal = subtotal;
		this.lx = lx;
		this.dc = dc;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDesign_id() {
		return design_id;
	}


	public void setDesign_id(String design_id) {
		this.design_id = design_id;
	}


	public int getProductid() {
		return productid;
	}


	public void setProductid(int productid) {
		this.productid = productid;
	}


	public String getProductname() {
		return productname;
	}


	public void setProductname(String productname) {
		this.productname = productname;
	}


	public String getProductdescribe() {
		return productdescribe;
	}


	public void setProductdescribe(String productdescribe) {
		this.productdescribe = productdescribe;
	}


	public String getAmount_unit() {
		return amount_unit;
	}


	public void setAmount_unit(String amount_unit) {
		this.amount_unit = amount_unit;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public double getCost_price() {
		return cost_price;
	}


	public void setCost_price(double cost_price) {
		this.cost_price = cost_price;
	}


	public double getSubtotal() {
		return subtotal;
	}


	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}


	public String getLx() {
		return lx;
	}


	public void setLx(String lx) {
		this.lx = lx;
	}


	public String getDc() {
		return dc;
	}


	public void setDc(String dc) {
		this.dc = dc;
	}
	
	
}
