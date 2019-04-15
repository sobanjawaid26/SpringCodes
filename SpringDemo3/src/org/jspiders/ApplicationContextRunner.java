package org.jspiders;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextRunner {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("org/jspiders/context.xml");
//		Computer computer = context.getBean(Computer.class, "com");
//		Computer computer1 = context.getBean(Computer.class, "com");
//		Computer computer2 = context.getBean(Computer.class, "com");
//		Computer computer3 = context.getBean(Computer.class, "com");

	
	}

}
