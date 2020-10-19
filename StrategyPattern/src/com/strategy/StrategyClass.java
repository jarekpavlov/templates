package com.strategy;

public class StrategyClass {
	SortWay sortWay;

	public void setSortWay(SortWay sortWay) {
		this.sortWay = sortWay;
	}
	
	public void executeSorting(int[] a) {
		sortWay.sort(a);
	}
	

}
