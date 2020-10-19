package com.composite;

public class MainClass {

	public static void main(String[] args) {
		
		CompositeShape compositeShape1 = new Triangle();
		CompositeShape compositeShape2 = new Square();
		
		
		CompositeClass composite = new CompositeClass();
		composite.AddTo(compositeShape1);
		composite.AddTo(compositeShape2);
		
		
		CompositeClass compositSum = new  CompositeClass();
		compositSum.AddTo(composite);
		compositSum.AddTo(compositeShape2);
		
//		compositeShape1.draw();
//		composite.draw();
		compositSum.draw();

	}

}
