package com.idmo_branch.idmo_branch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestIdmoBranchApplication {

	public static void main(String[] args) {
		SpringApplication.from(IdmoBranchApplication::main).with(TestIdmoBranchApplication.class).run(args);
	}

}
