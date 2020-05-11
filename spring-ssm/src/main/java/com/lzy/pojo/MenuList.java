package com.lzy.pojo;

import java.util.List;

public class MenuList {
	private int id;
	private String parent_id;
	private String  name;
	private String linkurl;
	private int type;
	private List<MenuList> childMenu;
	public MenuList() {
		super();
	}
	public MenuList(int id, String parent_id, String name, String linkurl, int type, List<MenuList> childMenu) {
		super();
		this.id = id;
		this.parent_id = parent_id;
		this.name = name;
		this.linkurl = linkurl;
		this.type = type;
		this.childMenu = childMenu;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getParent_id() {
		return parent_id;
	}
	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLinkurl() {
		return linkurl;
	}
	public void setLinkurl(String linkurl) {
		this.linkurl = linkurl;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public List<MenuList> getChildMenu() {
		return childMenu;
	}
	public void setChildMenu(List<MenuList> childMenu) {
		this.childMenu = childMenu;
	}
	@Override
	public String toString() {
		return "MenuList [id=" + id + ", parent_id=" + parent_id + ", name=" + name + ", linkurl=" + linkurl + ", type="
				+ type + ", childMenu=" + childMenu + "]";
	}
	
	
}
