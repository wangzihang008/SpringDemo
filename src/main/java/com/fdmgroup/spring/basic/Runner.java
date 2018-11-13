package com.fdmgroup.spring.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		ApplicationContext ctx2 = new ClassPathXmlApplicationContext("context.xml");
		
		System.out.println(ctx.getBean("constructorDao"));
		System.out.println(ctx2.getBean("constructorDao"));
		System.out.println(ctx.getBean("constructorDao"));
		
		System.out.println(ctx.getBean("setterDao"));
		System.out.println(ctx2.getBean("setterDao"));
		System.out.println(ctx.getBean("setterDao"));
	}
}
