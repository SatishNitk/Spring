package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.MyApp;

public class ApplicationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj = null;
		Resource res  = null;
		BeanFactory factory =  null;
		MyApp app = null;
		
		res = new FileSystemResource("src/com/nt/cfg/applicationContext.xml");
		factory = new XmlBeanFactory(res);
		obj = factory.getBean("calc");
		app = (MyApp)obj;
		app.calculator("add", 12, 10);
		app.calculator("subtract", 10, 100);
		app.calculator("multiply", 12, 12);
		app.calculator("divide", 200, 20);
	
		
		

	}

}
