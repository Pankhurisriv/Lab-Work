package com.cg.service;

public class CountService {
	private int count;
	

	public void setCount(int count) {
		this.count = count;
	}
	public int getCount() {
		return ++count;
	}
	public void doInit() {
		System.out.println("Object Initialized");
	}
	public void doDestroy() {
		System.out.println("Object destroyed");
	}
   

}


