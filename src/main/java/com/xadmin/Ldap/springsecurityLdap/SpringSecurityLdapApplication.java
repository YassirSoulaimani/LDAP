package com.xadmin.Ldap.springsecurityLdap;

import com.xadmin.Ldap.springsecurityLdap.controller.ApplicationController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses= ApplicationController.class)

public class SpringSecurityLdapApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityLdapApplication.class, args);
	}

}
