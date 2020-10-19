package com.visitor;

public class EngineClass implements AccseptInterface {

	@Override
	public void accsepet(VisitorInterface visitor) {
		visitor.visit(this);
	}

}
