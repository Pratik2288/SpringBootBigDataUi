package com.hbd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainPageController {
	@RequestMapping("/")
	public String appPage() {
		return "NavRepresentation";
	}
}
