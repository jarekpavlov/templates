package com.visitor;

public class MainClass {

	public static void main(String[] args) {
		
		VisitorInterface vi = new BadVisitor();
		AccseptInterface aiB = new BodyClass();
		AccseptInterface aiE = new EngineClass();
		
		aiB.accsepet(vi);
		aiE.accsepet(vi);
		
	}

}
