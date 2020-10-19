package com.decorator;

public class AbstractDecoratorClass implements DecoratorInterface {
	DecoratorInterface decoratorInterface;
	
	public AbstractDecoratorClass(DecoratorInterface decoratorInterface) {
		this.decoratorInterface=decoratorInterface;
	}

	@Override
	public void print() {
		decoratorInterface.print();
	}
	
	

}
