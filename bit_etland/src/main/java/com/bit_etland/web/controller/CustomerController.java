package com.bit_etland.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.bit_etland.web.domain.CustomerDTO;
import com.bit_etland.web.service.CustomerService;

@SessionAttributes("user")
@Controller
@RequestMapping("/customer")
public class CustomerController {
	static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
	@Autowired	CustomerDTO cus;
	@Autowired	CustomerService customerSerivce;

	@RequestMapping(value = "/signin", method = RequestMethod.POST)
	public String signin(@ModelAttribute CustomerDTO param,Model session) {
		logger.info("\n --------- CustomerController !! --------signin");
		cus = customerSerivce.retrieveCustomer(param);
		if(cus != null)
		session.addAttribute("user", cus);
		return (cus != null) ? "customer:customer/main.tiles" : "public:home/main.tiles";
	}
	@RequestMapping(value = "/detail")
	public String detail(@RequestParam("customerId")String customerID,
			Model model) {
		logger.info("------------CustomerController------------detail");
		System.out.println("조회 파라미터 값 : "+ customerID);
		cus.setCustomerId(customerID);
		cus = customerSerivce.retrieveCustomer(cus);
		model.addAttribute("cus",cus);
		return "public:customer/detail.tiles";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(@ModelAttribute CustomerDTO param, Model session, RedirectAttributes red) {
		logger.info("------------CustomerController------------update");
		customerSerivce.modifyCustomer(param);
		cus = customerSerivce.retrieveCustomer(param);
		session.addAttribute("user",cus);
		red.addAttribute("customerId",param.getCustomerId());
		return "redirect:/customer/detail";
	}
}
