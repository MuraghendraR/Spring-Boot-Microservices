package com.dailycodebuffer.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dailycodebuffer.user.VO.Department;
import com.dailycodebuffer.user.VO.ResponseTemplateVO;
import com.dailycodebuffer.user.entity.Users;
import com.dailycodebuffer.user.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	public Users saveUser(Users user) {
		return userRepository.save(user);
	}
	
	public ResponseTemplateVO getUser(Long id) {
		System.out.println("Inside 2");
		ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();
		System.out.println("Inside 2");
		Users user =  userRepository.getUsedById(id);
		System.out.println("Inside 2");
		
		Department department =  restTemplate.getForObject("http://DEPARTMENT-SERVICE/department/"+
															user.getDeptartmentId(), Department.class);
		System.out.println("Inside 2");
		responseTemplateVO.setUser(user);
		System.out.println("Inside 2");
		responseTemplateVO.setDepartment(department);
	
		return responseTemplateVO;		
	}
}