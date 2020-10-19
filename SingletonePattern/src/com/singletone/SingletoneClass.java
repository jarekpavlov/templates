package com.singletone;

public class SingletoneClass {
	
	private final static Object sync=new Object();//Threads will be synchronized using this object
	public static int counter=0;
	private static volatile SingletoneClass instanse=null;
	
	private SingletoneClass() {
		counter++;
	}

	public static SingletoneClass getInstance() {
		
		if(instanse==null) {
			synchronized (sync) {
				if(instanse==null)
					instanse = new SingletoneClass();
			}
		}
		return  instanse;
	}
}
