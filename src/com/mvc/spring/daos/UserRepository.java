package com.mvc.spring.daos;

import java.util.List;

import javax.sql.DataSource;

import com.mvc.spring.model.Userdata;

public interface UserRepository {

	public abstract void setDataSource(DataSource dataSource);

	public abstract List<Userdata> listAllUsersFromDB();

}
