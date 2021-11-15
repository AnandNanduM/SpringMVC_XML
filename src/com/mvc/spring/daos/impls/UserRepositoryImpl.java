package com.mvc.spring.daos.impls;

import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.mvc.spring.daos.UserRepository;
import com.mvc.spring.model.Userdata;

public class UserRepositoryImpl implements UserRepository {
	static Logger log = Logger.getLogger(UserRepositoryImpl.class.getName());

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	public UserRepositoryImpl() {
		super();
		log.warn("Constructor.>" + super.getClass());
	}

	@Override
	public List<Userdata> listAllUsersFromDB() {
		// TODO Auto-generated method stub
		RowMapper<Userdata> requiredType = BeanPropertyRowMapper.newInstance(Userdata.class);
		String sql = "SELECT * FROM  userdata";
		return extracted(requiredType, sql);

	}

	@SuppressWarnings("unchecked")
	private List<Userdata> extracted(RowMapper<Userdata> requiredType, String sql) {
		return (List<Userdata>) this.jdbcTemplateObject.queryForObject(sql, requiredType);
	}

	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

}
