package com.decorator;

public class RightBracketClass extends AbstractDecoratorClass {

	public RightBracketClass(DecoratorInterface decoratorInterface) {
		super(decoratorInterface);
		// TODO Auto-generated constructor stub
	}

	//@Override
	public void print() {
      System.out.print("]");	
      super.print();
	}

}
