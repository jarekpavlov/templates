package com.patterns;

public class MainClass {

	public static void main(String[] args) {
		
//		we're delegating classes DishSoup and DishPizza 
//		to Chef class using mutator method in Chef class
		
		Chef chef = new Chef();
		chef.MutatorMetod(new DishSoup());
		chef.MakeOrder();
		chef.MutatorMetod(new DishPizza());
		chef.MakeOrder();
		
	}

}
