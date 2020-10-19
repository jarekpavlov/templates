package com.proxy;

public class WorkingClass implements ProxyInterface {
	
	String path;
	
	public WorkingClass(String path) {
		this.path=path;
		load();
	}
	
	public void load() {
		System.out.println("I am loading the file");
	}

	@Override
	public void draw() {
		
		System.out.println("I am drawing the file");
		
	}

}
