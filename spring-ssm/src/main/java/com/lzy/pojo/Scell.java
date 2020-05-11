package com.lzy.pojo;

public class Scell {
	private Integer id;
	private String storeId;//库存编号
	private String productId;//产品编号
	private String productName;//产品名称
	private Integer minAmount;//库存报警下限数
	private Integer maxAmount;//库存报警上限数
	private Integer maxCapacityAmount;//最大存储量
	private String unitOfStorage;//储存单位
	private Integer amount;//当前库存量
	private String config;//配置要求
	private String register;//登记人
	private String registerTime;//登记时间
	private String checker;//复核人
	private String checkTime;//复核时间
	private Integer checkTag;//审核标准
	public Scell() {
		super();
	}
	public Scell(Integer id, String storeId, String productId, String productName, Integer minAmount, Integer maxAmount,
			Integer maxCapacityAmount, String unitOfStorage, Integer amount, String config, String register,
			String registerTime, String checker, String checkTime, Integer checkTag) {
		super();
		this.id = id;
		this.storeId = storeId;
		this.productId = productId;
		this.productName = productName;
		this.minAmount = minAmount;
		this.maxAmount = maxAmount;
		this.maxCapacityAmount = maxCapacityAmount;
		this.unitOfStorage = unitOfStorage;
		this.amount = amount;
		this.config = config;
		this.register = register;
		this.registerTime = registerTime;
		this.checker = checker;
		this.checkTime = checkTime;
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
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getMinAmount() {
		return minAmount;
	}
	public void setMinAmount(Integer minAmount) {
		this.minAmount = minAmount;
	}
	public Integer getMaxAmount() {
		return maxAmount;
	}
	public void setMaxAmount(Integer maxAmount) {
		this.maxAmount = maxAmount;
	}
	public Integer getMaxCapacityAmount() {
		return maxCapacityAmount;
	}
	public void setMaxCapacityAmount(Integer maxCapacityAmount) {
		this.maxCapacityAmount = maxCapacityAmount;
	}
	public String getUnitOfStorage() {
		return unitOfStorage;
	}
	public void setUnitOfStorage(String unitOfStorage) {
		this.unitOfStorage = unitOfStorage;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String getConfig() {
		return config;
	}
	public void setConfig(String config) {
		this.config = config;
	}
	public String getRegister() {
		return register;
	}
	public void setRegister(String register) {
		this.register = register;
	}
	public String getRegisterTime() {
		return registerTime;
	}
	public void setRegisterTime(String registerTime) {
		this.registerTime = registerTime;
	}
	public String getChecker() {
		return checker;
	}
	public void setChecker(String checker) {
		this.checker = checker;
	}
	public String getCheckTime() {
		return checkTime;
	}
	public void setCheckTime(String checkTime) {
		this.checkTime = checkTime;
	}
	public Integer getCheckTag() {
		return checkTag;
	}
	public void setCheckTag(Integer checkTag) {
		this.checkTag = checkTag;
	}
	@Override
	public String toString() {
		return "Scell [id=" + id + ", storeId=" + storeId + ", productId=" + productId + ", productName=" + productName
				+ ", minAmount=" + minAmount + ", maxAmount=" + maxAmount + ", maxCapacityAmount=" + maxCapacityAmount
				+ ", unitOfStorage=" + unitOfStorage + ", amount=" + amount + ", config=" + config + ", register="
				+ register + ", registerTime=" + registerTime + ", checker=" + checker + ", checkTime=" + checkTime
				+ ", checkTag=" + checkTag + "]";
	}
	
	
}
