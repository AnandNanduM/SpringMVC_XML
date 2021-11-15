package com.mvc.spring;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.spring.model.Userdata;
import com.mvc.spring.services.UserService;

@Controller
public class UserController {
	static Logger log = Logger.getLogger(UserController.class.getName());

	public UserController() {
		super();
		log.warn("Constructor");
	}

	@Autowired
	@Qualifier("userServ")
	UserService userServices;

	@RequestMapping("/")
	public ModelAndView home() {
		// TODO Auto-generated method stub
		log.warn("home ");
		List<Userdata> listCustomer = userServices.listAllUsers();
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("listCustomer", listCustomer);
		return mav;
	}
}
