package com.lzy.pojo;

public class Design {
	private int id;
	private int productid;
	private String productname;
	private int costprice;
	private String register;
	private String registertime;
	private String checks;
	private String designs;
	public Design() {
		super();
	}
	public Design(int id, int productid, String productname, int costprice, String register, String registertime,
			String checks, String designs) {
		super();
		this.id = id;
		this.productid = productid;
		this.productname = productname;
		this.costprice = costprice;
		this.register = register;
		this.registertime = registertime;
		this.checks = checks;
		this.designs = designs;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getCostprice() {
		return costprice;
	}
	public void setCostprice(int costprice) {
		this.costprice = costprice;
	}
	public String getRegister() {
		return register;
	}
	public void setRegister(String register) {
		this.register = register;
	}
	public String getRegistertime() {
		return registertime;
	}
	public void setRegistertime(String registertime) {
		this.registertime = registertime;
	}
	public String getChecks() {
		return checks;
	}
	public void setChecks(String checks) {
		this.checks = checks;
	}
	public String getDesigns() {
		return designs;
	}
	public void setDesigns(String designs) {
		this.designs = designs;
	}
	@Override
	public String toString() {
		return "Design [id=" + id + ", productid=" + productid + ", productname=" + productname + ", costprice="
				+ costprice + ", register=" + register + ", registertime=" + registertime + ", checks=" + checks
				+ ", designs=" + designs + "]";
	}
	
}
