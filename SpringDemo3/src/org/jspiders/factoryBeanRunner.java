package org.jspiders;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class factoryBeanRunner {

	public static void main(String[] args) {
		BeanFactory context = new XmlBeanFactory(new FileSystemResource("src/org/jspiders/context.xml"));
		
//		Computer computer = (Computer)context.getBean("com");
//		Computer computer1 = (Computer)context.getBean("com");
//		Computer computer2 = (Computer)context.getBean("com");
//		Computer computer3 = (Computer)context.getBean("com");
	}

}
