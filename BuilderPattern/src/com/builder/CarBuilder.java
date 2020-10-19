package com.builder;
//It is builder class
public class CarBuilder {
	
	Transmission t=Transmission.Manual;
	int s = 100;
	
	public CarBuilder setSpeed(int s) {
		
		this.s=s;
		return this;
	} 
	
	public CarBuilder setTransmission(Transmission t) {
		
		this.t=t;
		return this;
	} 
	
	public Car getCar() {
		Car car =new Car();
		car.setMaxSpeed(s);
		car.setT(t);
		
		return car;
		
		
	}

}
