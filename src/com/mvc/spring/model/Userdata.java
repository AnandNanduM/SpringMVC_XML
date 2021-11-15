package com.mvc.spring.model;

import org.apache.log4j.Logger;

public class Userdata implements Comparable<Userdata> {

	static Logger log = Logger.getLogger(Userdata.class.getName());

	private int userId;
	private String userName;
	private String userEmailId;
	private String userMobile;
	private String userPassword;
	private String userGender;
	private String userRole;

	@Override
	public String toString() {
		return "Userdata [userId=" + userId + ", userName=" + userName + ", userEmailId=" + userEmailId
				+ ", userMobile=" + userMobile + ", userPassword=" + userPassword + ", userGender=" + userGender
				+ ", userRole=" + userRole + "]";
	}

	public Userdata() {
		super();
		 
		log.warn("Constructor");
	}

	public Userdata(int userId, String userName, String userEmailId, String userMobile, String userPassword,
			String userGender, String userRole) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmailId = userEmailId;
		this.userMobile = userMobile;
		this.userPassword = userPassword;
		this.userGender = userGender;
		this.userRole = userRole;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmailId() {
		return userEmailId;
	}

	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}

	public String getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	@Override
	public int compareTo(Userdata o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
