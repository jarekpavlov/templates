package com.patterns;

public class Chef  {

	RootStructure rootStructure;
	
	public void MutatorMetod(RootStructure r) { //Mutator method
		 
		this.rootStructure=r;
	}
	
	public void MakeOrder() {
		
		rootStructure.Cook();
		
	}
	

}
