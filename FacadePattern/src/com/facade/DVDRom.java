package com.facade;

public class DVDRom {
	
    private boolean dataTransfer=false;
	
	public boolean isDataTransfer() {
		return dataTransfer;
	}

	public void Insert() {
		dataTransfer=true;
	}
	
	public void Execute() {
		dataTransfer=false;
	}
	

}
