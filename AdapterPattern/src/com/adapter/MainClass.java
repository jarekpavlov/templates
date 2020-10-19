package com.adapter;



public class MainClass {
	
	public void Some() { //We're creating an adapter to fit ManufactutingClass to Manufacturing interface
	}
	public static void main(String[] args) {
		ManufacturingInterface manufacturing=new AdapterClass();
		manufacturing.createCar();
		manufacturing.createLorry();
	}
}
