package com.chain;

public class MainClass {

	public static void main(String[] args) {

		AbstractChainClass hi=new SmsMessage(NumberClass.ERROR);
		AbstractChainClass hi2=new EmailMassage(NumberClass.DEBUG);
		hi.setHi(hi2);
		hi.message("it does not work",NumberClass.ERROR);
		hi.message("it is debuging",NumberClass.DEBUG);
		
		
	}

}
