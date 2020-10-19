package com.strategy;

public class MainClass {
	
	public static void main(String[] args) {
		
		StrategyClass sc=new StrategyClass();
		sc.setSortWay(new SortA());
		int [] arr1 = {1,4,5};
		sc.executeSorting(arr1);
		sc.setSortWay(new SortB());
		sc.executeSorting(arr1);
		
		
	}

}
