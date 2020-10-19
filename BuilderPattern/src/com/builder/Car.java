package com.builder;

public class Car {
	
	int maxSpeed;
	Transmission t;
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public Transmission getT() {
		return t;
	}
	public void setT(Transmission t) {
		this.t = t;
	}
	@Override
	public String toString() {
		return "Car [maxSpeed=" + maxSpeed + ", t=" + t + "]";
	}
	
	
	

}
