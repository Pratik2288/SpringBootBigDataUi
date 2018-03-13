package com.hbd.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hbd.pojo.NavPojo;
import com.hbd.service.NavService;

@RestController
public class GraphController {
	@Autowired
	NavService navS;
	
	@GetMapping(value = "/navdata")
	public String getNavData() {
		
		for(int i=0;i<10;i++ ) {
		NavPojo navPojo = new NavPojo();
		navPojo.setNavDate(new Date().toString());
		navPojo.setCompName("DST-"+i);
		navPojo.setNavvalue(new Integer(580+i).toString());
		navS.addNav(navPojo);		
		}
		
		System.out.println("navS.getNavData()"+navS.getNavData());
		
		return navS.getNavData().toString();
	}

}
