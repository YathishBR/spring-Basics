package com.estuate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_Department {

	public static void main(String[] args) {
		ApplicationContext  context = new ClassPathXmlApplicationContext("department.xml");
		Department md =   context.getBean("yathish",Department.class);
		System.out.println(md);

	}

}
