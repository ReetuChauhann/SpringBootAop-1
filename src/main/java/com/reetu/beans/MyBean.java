package com.reetu.beans;

import org.springframework.stereotype.Component;

@Component
public class MyBean {
	public void addInt(int x,int y) {
		System.out.println("Sum: "+(x+y));
	}
	public void addString(String x,String y) {
		System.out.println("Concat: "+(x+y));
	}
	
	public int sum(int x,int y) {
		//int p=9/0;
		System.out.println("doing sum");
		return x+y;
	}
	public int div(int x,int y) {
		System.out.println("doing division");
		int p=x/y;
		return p;
	}
}
