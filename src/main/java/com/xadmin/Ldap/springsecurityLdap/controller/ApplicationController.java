package com.xadmin.Ldap.springsecurityLdap.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class ApplicationController {
	//    public static final String ROLE_ADMIN = "ROLE_ADMIN";
//    public static final String ROLE_USER = "ROLE_USER";y
	private static final Logger logger = LoggerFactory.getLogger(ApplicationController.class);

	@GetMapping
//    @Secured({ROLE_ADMIN})
	public String admin_user() {
		return "Admin User Logged Successfully";
	}

	//    @Secured({ROLE_USER})
	public String user() {
		return "User Logged Successfully";
	}

}