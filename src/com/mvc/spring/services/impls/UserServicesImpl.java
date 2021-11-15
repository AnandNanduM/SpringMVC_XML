package com.mvc.spring.services.impls;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.mvc.spring.daos.UserRepository;
import com.mvc.spring.model.Userdata;
import com.mvc.spring.services.UserService;

public class UserServicesImpl implements UserService {
	static Logger log = Logger.getLogger(UserServicesImpl.class.getName());

	@Autowired
	@Qualifier("userRepo")
	UserRepository userRepository;

	public UserServicesImpl() {
		super();
		log.warn("Constructor.>" + super.getClass());
	}

	@Override
	public List<Userdata> listAllUsers() {
		return null;
		// (List<Userdata>) userRepository.listAllUsersFromDB();
	}
}
