package com.decorator;

public class LeftBracketClass extends AbstractDecoratorClass {
	

	public LeftBracketClass(DecoratorInterface decoratorInterface) {
		super(decoratorInterface);
		// TODO Auto-generated constructor stub
	}

	//@Override
	public void print() {
		System.out.print("[");	
		super.print();
	}

}
