package com.lzy.pojo;

public class shkc {
	private Integer id;
	private String storeId;
	private String productId;
	private String productname;
	private String categoryname;
	private String purposetypename;
	private String gradelevelname;
	private String productmanagername;
	private String registerTime;
	private Integer checkTag;
	public shkc() {
		super();
	}
	public shkc(Integer id, String storeId, String productId, String productname, String categoryname,
			String purposetypename, String gradelevelname, String productmanagername, String registerTime,
			Integer checkTag) {
		super();
		this.id = id;
		this.storeId = storeId;
		this.productId = productId;
		this.productname = productname;
		this.categoryname = categoryname;
		this.purposetypename = purposetypename;
		this.gradelevelname = gradelevelname;
		this.productmanagername = productmanagername;
		this.registerTime = registerTime;
		this.checkTag = checkTag;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
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
		return gradelevelname;
	}
	public void setGradelevelname(String gradelevelname) {
		this.gradelevelname = gradelevelname;
	}
	public String getProductmanagername() {
		return productmanagername;
	}
	public void setProductmanagername(String productmanagername) {
		this.productmanagername = productmanagername;
	}
	public String getRegisterTime() {
		return registerTime;
	}
	public void setRegisterTime(String registerTime) {
		this.registerTime = registerTime;
	}
	public Integer getCheckTag() {
		return checkTag;
	}
	public void setCheckTag(Integer checkTag) {
		this.checkTag = checkTag;
	}
	@Override
	public String toString() {
		return "shkc [id=" + id + ", storeId=" + storeId + ", productId=" + productId + ", productname=" + productname
				+ ", categoryname=" + categoryname + ", purposetypename=" + purposetypename + ", gradelevelname="
				+ gradelevelname + ", productmanagername=" + productmanagername + ", registerTime=" + registerTime
				+ ", checkTag=" + checkTag + "]";
	}

	
	
	
}
