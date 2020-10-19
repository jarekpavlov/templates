package com.facade;

public class FacadeClass {
	
	public void Copy() {
		
		Power power = new Power();
		power.OnComputer();
		DVDRom dvdRom =new DVDRom();
		dvdRom.Insert();
		HddClass hdd = new HddClass();
		hdd.HddCopy(dvdRom.isDataTransfer());
		
		
	}

}
