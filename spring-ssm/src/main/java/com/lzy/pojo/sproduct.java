package com.lzy.pojo;

public class sproduct {
	private Integer productid;
	private String productname;
	private String categoryname;
	private String purposetypename;
	private String Gradelevelname;
	private String productmanagername;
	private Integer plannedcostprice;
	private String Company;
	public sproduct() {
		super();
	}
	public sproduct(Integer productid, String productname, String categoryname, String purposetypename,
			String gradelevelname, String productmanagername, Integer plannedcostprice, String company) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.categoryname = categoryname;
		this.purposetypename = purposetypename;
		Gradelevelname = gradelevelname;
		this.productmanagername = productmanagername;
		this.plannedcostprice = plannedcostprice;
		Company = company;
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
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	public String getPurposetypename() {
		return purposetypename;
	}
	public void setPurposetypename(String purposetypename) {
		this.purposetypename = purposetypename;
	}
	public String getGradelevelname() {
		return Gradelevelname;
	}
	public void setGradelevelname(String gradelevelname) {
		Gradelevelname = gradelevelname;
	}
	public String getProductmanagername() {
		return productmanagername;
	}
	public void setProductmanagername(String productmanagername) {
		this.productmanagername = productmanagername;
	}
	public Integer getPlannedcostprice() {
		return plannedcostprice;
	}
	public void setPlannedcostprice(Integer plannedcostprice) {
		this.plannedcostprice = plannedcostprice;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	@Override
	public String toString() {
		return "sproduct [productid=" + productid + ", productname=" + productname + ", categoryname=" + categoryname
				+ ", purposetypename=" + purposetypename + ", Gradelevelname=" + Gradelevelname
				+ ", productmanagername=" + productmanagername + ", plannedcostprice=" + plannedcostprice + ", Company="
				+ Company + "]";
	}

	
	

}
