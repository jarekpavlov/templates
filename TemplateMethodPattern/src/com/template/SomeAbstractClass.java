package com.template;

public abstract class SomeAbstractClass {
	
	public void writeMethod() {
		System.out.println("1");
		otherMethod();
		System.out.println("2");
		otherMethod2();
		
	}

	abstract void otherMethod2();

	abstract void otherMethod();

}
