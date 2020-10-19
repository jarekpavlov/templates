package com.factorymethod;

public class MakingOfRome implements CreateWatch{

	@Override
	public Watch MakingOfWatch() {
		return new RomeWatch();
	}

}
