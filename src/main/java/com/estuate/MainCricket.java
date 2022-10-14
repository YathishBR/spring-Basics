package com.estuate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCricket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con = new ClassPathXmlApplicationContext("Cricket.xml");
		
		Cricket c = (Cricket) con.getBean("games");
		
		Cricket c1 = con.getBean("Playing",Cricket.class);
		Cricket c2= con.getBean("win",Cricket.class);
		System.out.println(c);
		System.out.println();
		System.out.println(c1);
		System.out.println();
		System.out.println(c2);
	}


}