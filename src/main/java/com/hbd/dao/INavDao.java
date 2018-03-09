package com.hbd.dao;

import java.util.List;

import com.hbd.pojo.NavPojo;

public interface INavDao {
	List<NavPojo> getAllNAvValue();

	NavPojo getNavById(int articleId);

	void addNav(NavPojo nav);

	void updateNav(NavPojo nav);

	void deleteNav(int navId);

	boolean navExists(String title, String category);
}
