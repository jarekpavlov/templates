package com.decorator;

public class MainClass {

	public static void main(String[] args) {
		
		DecoratorInterface decoratorInterface =new RightBracketClass(new LeftBracketClass(new HalloClass()));
		decoratorInterface.print();
		

	}

}
