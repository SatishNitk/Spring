package com.nt.beans;

final public class Bsnl implements Sim {
	
	public void call(String name) {
		System.out.println(name + "called pickuped up successflly using bsnl");
	}
	
	public void discard(String name) {
		System.out.println(name + "call discared successfully using bsnl");
	}
	

}
