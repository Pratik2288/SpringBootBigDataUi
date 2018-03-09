package com.hbd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hbd.dao.NavDao;
import com.hbd.pojo.NavPojo;
@Service
public class NavService {

	@Autowired
	private NavDao navDao;

	public List<NavPojo> getNavData() {
		return navDao.getAllNAvValue();
	}
	
	public void addNav(NavPojo nav) {
		navDao.addNav(nav);
	}

}
