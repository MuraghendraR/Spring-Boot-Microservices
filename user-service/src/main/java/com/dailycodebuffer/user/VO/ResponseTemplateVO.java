package com.dailycodebuffer.user.VO;

import com.dailycodebuffer.user.entity.Users;

public class ResponseTemplateVO {
	
	private Users user;
	private Department department;
	
	
	
	public ResponseTemplateVO() {
		super();
	}



	public ResponseTemplateVO(Users user, Department department) {
		super();
		this.user = user;
		this.department = department;
	}



	public Users getUser() {
		return user;
	}



	public void setUser(Users user) {
		this.user = user;
	}



	public Department getDepartment() {
		return department;
	}



	public void setDepartment(Department department) {
		this.department = department;
	}
	
	

}
