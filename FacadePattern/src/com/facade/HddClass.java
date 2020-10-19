package com.facade;

public class HddClass {
	
	public void HddCopy(boolean dataTransfer) {
		
		if(dataTransfer) {
			
			System.out.println("The data is copying");
			
		} else {
			System.out.println("Please, insert the disck");
		}
	}

}
