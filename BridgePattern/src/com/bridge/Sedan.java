package com.bridge;

public class Sedan extends TypeAbstractClass {

	public Sedan(MakerInterface maker) {
		super(maker);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void type() {
		System.out.println("Sedan");
	}

}
