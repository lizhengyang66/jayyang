package com.lzy.pojo;

public class Product {
	private int productid;
	private String productname;
	private String manufacturer;
	private int categoryid;
	private CategoryYWB category;
	private String abbreviation;
	private int Purposetypeid;
	private String Purposetypename;
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productname=" + productname + ", manufacturer=" + manufacturer
				+ ", categoryid=" + categoryid + ", category=" + category + ", abbreviation=" + abbreviation
				+ ", Purposetypeid=" + Purposetypeid + ", Purposetypename=" + Purposetypename + ", Gradelevelid="
				+ Gradelevelid + ", gradelevel=" + gradelevel + ", Unitofmeasurement=" + Unitofmeasurement
				+ ", Measuredvalue=" + Measuredvalue + ", marketvalue=" + marketvalue + ", Plannedcostprice="
				+ Plannedcostprice + ", defectsliabilityperiod=" + defectsliabilityperiod + ", lifecycle=" + lifecycle
				+ ", Company=" + Company + ", productmanagerid=" + productmanagerid + ", productmanager="
				+ productmanager + ", Supplierset=" + Supplierset + ", Productdescription=" + Productdescription
				+ ", Registrant=" + Registrant + ", Filingtime=" + Filingtime + "]";
	}
	public Product() {
		super();
	}
	public Product(int productid, String productname, String manufacturer, int categoryid, CategoryYWB category,
			String abbreviation, int purposetypeid, String purposetypename, int gradelevelid, GradelevelYWB gradelevel,
			String unitofmeasurement, int measuredvalue, int marketvalue, int plannedcostprice,
			String defectsliabilityperiod, String lifecycle, String company, int productmanagerid,
			ProductmanagerYWB productmanager, String supplierset, String productdescription, String registrant,
			String filingtime) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.manufacturer = manufacturer;
		this.categoryid = categoryid;
		this.category = category;
		this.abbreviation = abbreviation;
		Purposetypeid = purposetypeid;
		Purposetypename = purposetypename;
		Gradelevelid = gradelevelid;
		this.gradelevel = gradelevel;
		Unitofmeasurement = unitofmeasurement;
		Measuredvalue = measuredvalue;
		this.marketvalue = marketvalue;
		Plannedcostprice = plannedcostprice;
		this.defectsliabilityperiod = defectsliabilityperiod;
		this.lifecycle = lifecycle;
		Company = company;
		this.productmanagerid = productmanagerid;
		this.productmanager = productmanager;
		Supplierset = supplierset;
		Productdescription = productdescription;
		Registrant = registrant;
		Filingtime = filingtime;
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
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public int getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
	public CategoryYWB getCategory() {
		return category;
	}
	public void setCategory(CategoryYWB category) {
		this.category = category;
	}
	public String getAbbreviation() {
		return abbreviation;
	}
	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}
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
	public int getGradelevelid() {
		return Gradelevelid;
	}
	public void setGradelevelid(int gradelevelid) {
		Gradelevelid = gradelevelid;
	}
	public GradelevelYWB getGradelevel() {
		return gradelevel;
	}
	public void setGradelevel(GradelevelYWB gradelevel) {
		this.gradelevel = gradelevel;
	}
	public String getUnitofmeasurement() {
		return Unitofmeasurement;
	}
	public void setUnitofmeasurement(String unitofmeasurement) {
		Unitofmeasurement = unitofmeasurement;
	}
	public int getMeasuredvalue() {
		return Measuredvalue;
	}
	public void setMeasuredvalue(int measuredvalue) {
		Measuredvalue = measuredvalue;
	}
	public int getMarketvalue() {
		return marketvalue;
	}
	public void setMarketvalue(int marketvalue) {
		this.marketvalue = marketvalue;
	}
	public int getPlannedcostprice() {
		return Plannedcostprice;
	}
	public void setPlannedcostprice(int plannedcostprice) {
		Plannedcostprice = plannedcostprice;
	}
	public String getDefectsliabilityperiod() {
		return defectsliabilityperiod;
	}
	public void setDefectsliabilityperiod(String defectsliabilityperiod) {
		this.defectsliabilityperiod = defectsliabilityperiod;
	}
	public String getLifecycle() {
		return lifecycle;
	}
	public void setLifecycle(String lifecycle) {
		this.lifecycle = lifecycle;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public int getProductmanagerid() {
		return productmanagerid;
	}
	public void setProductmanagerid(int productmanagerid) {
		this.productmanagerid = productmanagerid;
	}
	public ProductmanagerYWB getProductmanager() {
		return productmanager;
	}
	public void setProductmanager(ProductmanagerYWB productmanager) {
		this.productmanager = productmanager;
	}
	public String getSupplierset() {
		return Supplierset;
	}
	public void setSupplierset(String supplierset) {
		Supplierset = supplierset;
	}
	public String getProductdescription() {
		return Productdescription;
	}
	public void setProductdescription(String productdescription) {
		Productdescription = productdescription;
	}
	public String getRegistrant() {
		return Registrant;
	}
	public void setRegistrant(String registrant) {
		Registrant = registrant;
	}
	public String getFilingtime() {
		return Filingtime;
	}
	public void setFilingtime(String filingtime) {
		Filingtime = filingtime;
	}
	private int Gradelevelid;
	private GradelevelYWB gradelevel;
	private String Unitofmeasurement;
	private int Measuredvalue;
	private int marketvalue;
	private int Plannedcostprice;
	private String defectsliabilityperiod;
	private String lifecycle;
	private String Company;
	private int productmanagerid;
	private ProductmanagerYWB productmanager;
	private String Supplierset;
	private String Productdescription;
	private String Registrant;
	private String Filingtime;
	
}
