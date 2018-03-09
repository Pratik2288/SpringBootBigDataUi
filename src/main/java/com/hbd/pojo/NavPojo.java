package com.hbd.pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="NAV_DATA")
public class NavPojo implements Serializable { 
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
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

	@Override
	public String toString() {
		return "NavPojo [id=" + id + ", navDate=" + navDate + ", navvalue=" + navvalue + ", compName=" + compName + "]";
	}

}
