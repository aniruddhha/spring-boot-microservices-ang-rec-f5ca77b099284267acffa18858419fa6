package com.ani.rest.bankrestapp;

import com.ani.rest.bankrestapp.controller.BankUserController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BankRestAppApplicationTests {

	@Autowired
	private BankUserController controller;

	@Test
	void contextLoads() {
		Assertions.assertNotNull(controller);
	}
}
