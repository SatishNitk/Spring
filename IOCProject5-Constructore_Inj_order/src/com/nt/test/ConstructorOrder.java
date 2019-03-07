package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.bean.Student;

public class ConstructorOrder {
	
	public static void main(String args[]) {
		Resource res= null;
		BeanFactory factory= null;
		Student stu=null;
		
		res = new FileSystemResource("src/com/nt/cfg/applicationcontext.xml");
		factory = new XmlBeanFactory(res);
		stu = factory.getBean("st", Student.class);
		System.out.println(stu);
		
		
	}

}
