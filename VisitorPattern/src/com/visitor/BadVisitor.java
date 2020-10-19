package com.visitor;

public class BadVisitor implements VisitorInterface {
	
	public void visit(BodyClass bodyClass) {
		System.out.println("Body braking");
	}

	public void visit(EngineClass engineClass) {
		System.out.println("Engine braking");
	}

}
