package com.bit_etland.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class EmployeeController {

	@RequestMapping()
	public String access() {
		return "";
	}
}
