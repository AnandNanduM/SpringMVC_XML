package com.mvc.spring.services;

import java.util.List;

import org.apache.log4j.Logger;

import com.mvc.spring.model.Userdata;

public interface UserService {

	static Logger log = Logger.getLogger(UserService.class.getName());

	public List<Userdata> listAllUsers();

}
