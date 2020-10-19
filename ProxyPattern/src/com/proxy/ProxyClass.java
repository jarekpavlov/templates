package com.proxy;

public class ProxyClass implements ProxyInterface {
	
	String path;
	WorkingClass workingClass;
	
	public ProxyClass(String path) {
		this.path=path;
	}
	
	@Override
	public void draw() {
		if (workingClass==null) {
			workingClass=new WorkingClass(path);
			workingClass.draw();
		}
		
	}

}
