package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishmessageGenerator;

public class SetterinjectTest {
public static void main(String args[]) {
	Resource res = null;
	BeanFactory factory = null;
	Object obj = null;
	WishmessageGenerator  generator;
	res = new FileSystemResource("src/com/nt/cfg/applicationContext.xml");
	factory = new XmlBeanFactory(res);
	obj = factory.getBean("wish");
	generator = (WishmessageGenerator)obj;
	System.out.println(generator.generateWishMsg("satish"));
	
}
}
