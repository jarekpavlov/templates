package com.visitor;

public class BodyClass implements AccseptInterface {

	@Override
	public void accsepet(VisitorInterface visitor) {
		visitor.visit(this);
	}

}
