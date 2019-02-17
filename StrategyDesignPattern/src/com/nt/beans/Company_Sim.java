package com.nt.beans;

public class Company_Sim {
	private Sim sim_obj = null;
	Company_Sim(){
		System.out.println("0-param constructor of comapny_sim class");
	}
	
	public void setsim(Sim sim) {
		 sim_obj = sim;
	}
	public void call(String name) {
		sim_obj.call(name);
	}
	public void discard(String name) {
		sim_obj.discard(name);
	}
}
