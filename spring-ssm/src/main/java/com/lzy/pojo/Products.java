package com.lzy.pojo;

public class Products {
	private int productid;
	private String productname;
	private String manufacturer;
	private int categoryid;
	private String abbreviation;
	private int Purposetypeid;
	private int Gradelevelid;
	private String Unitofmeasurement;
	private int Measuredvalue;
	private int marketvalue;
	private int Plannedcostprice;
	private String defectsliabilityperiod;
	private String lifecycle;
	private String Company;
	private int productmanagerid;
	private String Supplierset;
	private String Productdescription;
	private String Registrant;
	private String Filingtime;
	public Products() {
		super();
	}
	public Products(int productid, String productname, String manufacturer, int categoryid, String abbreviation,
			int purposetypeid, int gradelevelid, String unitofmeasurement, int measuredvalue, int marketvalue,
			int plannedcostprice, String defectsliabilityperiod, String lifecycle, String company, int productmanagerid,
			String supplierset, String productdescription, String registrant, String filingtime) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.manufacturer = manufacturer;
		this.categoryid = categoryid;
		this.abbreviation = abbreviation;
		Purposetypeid = purposetypeid;
		Gradelevelid = gradelevelid;
		Unitofmeasurement = unitofmeasurement;
		Measuredvalue = measuredvalue;
		this.marketvalue = marketvalue;
		Plannedcostprice = plannedcostprice;
		this.defectsliabilityperiod = defectsliabilityperiod;
		this.lifecycle = lifecycle;
		Company = company;
		this.productmanagerid = productmanagerid;
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
	public int getGradelevelid() {
		return Gradelevelid;
	}
	public void setGradelevelid(int gradelevelid) {
		Gradelevelid = gradelevelid;
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
	@Override
	public String toString() {
		return "Products [productid=" + productid + ", productname=" + productname + ", manufacturer=" + manufacturer
				+ ", categoryid=" + categoryid + ", abbreviation=" + abbreviation + ", Purposetypeid=" + Purposetypeid
				+ ", Gradelevelid=" + Gradelevelid + ", Unitofmeasurement=" + Unitofmeasurement + ", Measuredvalue="
				+ Measuredvalue + ", marketvalue=" + marketvalue + ", Plannedcostprice=" + Plannedcostprice
				+ ", defectsliabilityperiod=" + defectsliabilityperiod + ", lifecycle=" + lifecycle + ", Company="
				+ Company + ", productmanagerid=" + productmanagerid + ", Supplierset=" + Supplierset
				+ ", Productdescription=" + Productdescription + ", Registrant=" + Registrant + ", Filingtime="
				+ Filingtime + "]";
	}

	
}
