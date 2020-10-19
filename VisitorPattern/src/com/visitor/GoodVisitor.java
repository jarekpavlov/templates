package com.visitor;

public class GoodVisitor implements VisitorInterface {
	
	public void visit(BodyClass bodyClass){
		System.out.println("Body polishing");
	}

	public void visit(EngineClass engineClass) {
		System.out.println("Engine repare");
	}

}
