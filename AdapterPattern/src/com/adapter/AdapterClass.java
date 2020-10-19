package com.adapter;

public class AdapterClass extends ManufacturingClass implements ManufacturingInterface  {

	
	@Override
	public void createCar() { //We're creating an adapter to fit ManufactutingClass to Manufacturing interface
		creatingOtherCar();
	}

	@Override
	public void createLorry() {
		creatingOtherLorry();
	}

}
