package com.template;

public class MainClass {
	
	public static void main(String [] arg) {
		
		SomeAbstractClass sac = new AClass();
		SomeAbstractClass sacB = new BClass();
		
		sac.writeMethod();
		sacB.writeMethod();
	}

}
