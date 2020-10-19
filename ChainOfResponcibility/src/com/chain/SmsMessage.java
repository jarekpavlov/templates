package com.chain;

public class SmsMessage extends AbstractChainClass {

	
	public SmsMessage(int point) {
		super(point);
	}

	public void writeMessage() {
		System.out.println("SMS: ");
	}



}
