package com.builder;

public class MainClass {

	public static void main(String[] args) {

		Car car = new CarBuilder()
				.setSpeed(200)
				.setTransmission(Transmission.Auto)
				.getCar();
	System.out.println(car);
	
	}

}
