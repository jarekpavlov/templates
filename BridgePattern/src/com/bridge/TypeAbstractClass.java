package com.bridge;

public abstract class TypeAbstractClass {
	
	MakerInterface maker;
	
	public TypeAbstractClass(MakerInterface maker) {
		this.maker=maker;
	}
	
	void showType() {
		maker.showMaker();
		type();
	}

	protected abstract void type();



}
