package com.factorymethod;

public class MakingOfDigital implements CreateWatch {

	//@Override
	public Watch MakingOfWatch() {
		return new DigitalWatch();
	}

}
