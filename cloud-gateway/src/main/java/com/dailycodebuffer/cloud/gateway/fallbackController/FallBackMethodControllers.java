package com.dailycodebuffer.cloud.gateway.fallbackController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodControllers {
	
	@GetMapping("/userServiceFallBackMethod")
	public String userServiceFallbackMethod() {
		return "User Service is taking more time than expected, Please try later ";
	}
	
	@GetMapping("/departmentServiceFallbackMethod")
	public String departmentSeviveFallBackMethod() {
		return "Department service is taking more time tha exppected, please try later";
	}

}
