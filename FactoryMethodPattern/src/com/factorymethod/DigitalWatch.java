package com.factorymethod;

import java.util.Date;

public class DigitalWatch implements Watch {

	@Override
	public void ShowWatch() {
		System.out.println(new Date());
	}
	
	

}
