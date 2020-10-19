package com.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeClass implements CompositeShape {
	
	List<CompositeShape> composite = new ArrayList<>();
	
	public void AddTo(CompositeShape component) {
		composite.add(component);
	}
	
	public void RemoveFrom(CompositeShape component) {
		composite.remove(component);
	}

	//@Override
	public void draw() {
		
		for (CompositeShape comp:composite) {
			comp.draw();
		}
		
	}

}
