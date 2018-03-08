package com.hbd.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hbd.pojo.NavPojo;

@RestController
public class GraphController {

	@GetMapping(value = "/navdata")
	public String getNavData() {
		NavPojo navPojo = new NavPojo();
		navPojo.setNavDate(new Date().toString());
		navPojo.setCompName("DST");
		navPojo.setNavvalue("580");
		return navPojo.toString();
	}

}
