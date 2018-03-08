package com.hbd.pojo;

public class NavPojo {
	
	@Override
	public String toString() {
		return "NavPojo [id=" + id + ", navDate=" + navDate + ", navvalue=" + navvalue + ", compName=" + compName + "]";
	}

	int id;
	String navDate;
	String navvalue;
	String compName;

	public String getNavDate() {
		return navDate;
	}

	public void setNavDate(String navDate) {
		this.navDate = navDate;
	}

	public String getNavvalue() {
		return navvalue;
	}

	public void setNavvalue(String navvalue) {
		this.navvalue = navvalue;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
