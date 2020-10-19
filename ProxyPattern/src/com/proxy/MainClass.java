package com.proxy;

public class MainClass {
	
	public static void main(String [] args) {
		
		//ProxyInterface proxyInterface=new WorkingClass("D://");
		ProxyInterface proxyInterface=new ProxyClass("D://");
		proxyInterface.draw();
		
	}

}
