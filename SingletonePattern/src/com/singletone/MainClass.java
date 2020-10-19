package com.singletone;

public class MainClass {
	
	public static void main(String [] args) throws InterruptedException {
		
		final int size=1000;
		Thread [] thread =new Thread[size];//Array with thousand of threads

		for (int i=0; i<size; i++) {
			thread[i]=new Thread(new R());
			thread[i].start();
		}
		for (int i=0; i<size; i++) {
			thread[i].join(); //We are waiting until all threads will be stopped
		}
		
		System.out.println(SingletoneClass.counter);
	}

}
