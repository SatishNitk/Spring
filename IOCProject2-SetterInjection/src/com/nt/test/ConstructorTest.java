package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.bean.MyApplication;

public class ConstructorTest {
	public static void main(String args[]) {
		Resource res = null;
		BeanFactory factory = null;
		Object obj = null;
		MyApplication myapplication = null;
		res = new FileSystemResource("src/com/nt/cfg/applicationContext.xml");
		factory = new XmlBeanFactory(res);
		obj = factory.getBean("annn");
		myapplication = (MyApplication)obj;
		myapplication.factorial_calculator();
		

		
	}

}
