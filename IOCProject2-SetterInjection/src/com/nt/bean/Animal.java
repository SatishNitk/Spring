package com.nt.bean;

public class Animal {
	
	public int factorail(int n) {
		int f = 1;
		int i = 0;
		for(i=1;i<=n;i++) {
			f = f * i;
		}
		return f;
	}
	
}
