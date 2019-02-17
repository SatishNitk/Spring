package com.nt.beans;

final public class Airtel  implements Sim{
	
	public void call(String name) {
		System.out.println(name + "called pickup up with sim Airtel");
	}
	
	public void discard(String name) {
		System.out.println(name + "called is discarded using sim Airltel");
	}
}
