package com.nt.text;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.Company_Sim;

public class ApplicationTest {
	
	public static void main(String args[]) {
	Object obj;
	Resource res;
	BeanFactory factory;
	Company_Sim sim;
	
	res = new FileSystemResource("src/com/nt/cfg/applicationContext.xml");
	factory =  new XmlBeanFactory(res);
	sim = factory.getBean("company11", Company_Sim.class);
	System.out.println("***********************************");
	sim.call("satish kumar gupta");
	System.out.println("***********************************");
	System.out.println("***********************************");
	sim.discard("satish kumar gupta");
	System.out.println("***********************************");
	sim.call("Anup kumar gupta");
	System.out.println("***********************************");
	sim.discard("satish kumar gupta");
	}
}
