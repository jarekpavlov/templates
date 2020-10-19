package com.chain;

public abstract class AbstractChainClass{
	
	AbstractChainClass hi;
	int point;
	
	public AbstractChainClass(int point) {
		this.point=point;
	}

	public void message(String message,int level) {
		if(level<=point) {
			writeMessage();
			System.out.println(message);
		}
		if(hi!=null) {
			hi.message(message,level);
		}
	}
	abstract void writeMessage();
	
	public void setHi(AbstractChainClass hi) {
		this.hi = hi;
	}

}
