package com.fdmgroup.web.controllers;

import org.hibernate.annotations.Parameter;
import org.mockito.internal.invocation.realmethod.RealMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

	@RequestMapping(value= {"/", "/index"}, method=RequestMethod.GET)
	public String goToIndex() {
		// TODO Auto-generated method stub
		return "index";
	}
	
}
