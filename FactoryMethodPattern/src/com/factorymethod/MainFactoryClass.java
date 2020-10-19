package com.factorymethod;

public class MainFactoryClass {

	public static void main(String[] args) {
	
		//MainFactoryClass returnM =new MainFactoryClass();//In case if ReturnWatch is not static
		
		//CreateWatch createWatch=new MakingOfDigital();
		
		CreateWatch createWatch=ReturnWatch("Rome");
		Watch watch = createWatch.MakingOfWatch();
		watch.ShowWatch();

	}
	public static CreateWatch ReturnWatch(String data) {
		
		if(data.equals("Digital")) {
			return new MakingOfDigital();
		} else if(data.equals("Rome")) {
			return new MakingOfRome();
		}else {
			
			throw new RuntimeException("Не поддерживается"+data);		
		}
		
	}
	

}
