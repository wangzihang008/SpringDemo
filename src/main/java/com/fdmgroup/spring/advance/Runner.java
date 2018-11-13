package com.fdmgroup.spring.advance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		
		CustomerDao bean1 = (CustomerDao) ctx.getBean("customerDaoBean");
		System.out.println("Bean = " + bean1 + ", emf = " + bean1.getEmf());
		
		CustomerDao bean2 = (CustomerDao) ctx.getBean("customerDaoBean");
		System.out.println("Bean2 = " + bean2 + ", emf = " + bean2.getEmf());
		
		CustomerDao bean3 = (CustomerDao) ctx.getBean("customerDaoBean");
		System.out.println("Bean3 = " + bean3 + ", emf = " + bean3.getEmf());
		
		System.out.println();
	}
}
