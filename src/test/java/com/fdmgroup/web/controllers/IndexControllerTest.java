package com.fdmgroup.web.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IndexControllerTest {
	@Test
	public void When_requestForIndexResource_then_returnIndexJsp() {
		
		IndexController ic = new IndexController();
		String nextPage = ic.goToIndex();
		
		assertEquals("index", nextPage);
	}
}
