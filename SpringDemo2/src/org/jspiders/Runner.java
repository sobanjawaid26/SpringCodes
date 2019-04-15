package org.jspiders;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
		
		
		//ApplicationContext cant be closed
		//AbstractApplicationContext object is made
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("org/jspiders/context.xml");
		
		Computer computer = context.getBean(Computer.class, "com");
		
		System.out.println(computer);
		
		context.close();
		
	}

}
