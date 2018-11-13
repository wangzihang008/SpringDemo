package com.fdmgroup.web.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LoginControllerTest {
	@Test
	public void when_requestForLogin_then_returnsLogingJspName(){
		LoginController lc = new LoginController();
		String nextPage = lc.goToLogin();
		
		assertEquals("login", nextPage);
	}
}
