package com.lzy.pojo;
//日期格式
import java.util.Date;

//产品登记实体类
public class ProductYWB {
	private int productid;//登记表序列
	private String productname;//产品名称
	private String manufacturer;//制造商
	private int categoryid;//产品类别
	private String abbreviation;//产品简称
	private int Purposetypeid;//用途类型
	private int Gradelevelid;//档次级别
	private String Unitofmeasurement;//计量单位
	private int Measuredvalue;//计量值
	private int marketvalue;//市场价
	private int Plannedcostprice;//计划成本价
	private String defectsliabilityperiod;//保修期
	private String lifecycle;//生命周期
	private String Company;//单位
	private int productmanagerid;//产品经理
	private String Supplierset;//供应商集合
	private String Productdescription;//产品描述
	private String Registrant;//登记人
	private String Filingtime;//建档时间

	
	
	
	
	public ProductYWB(int productid, String productname, String manufacturer, int categoryid, String abbreviation,
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





	public ProductYWB() {
		super();
	}

	
}
