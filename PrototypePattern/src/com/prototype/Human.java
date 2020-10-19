package com.prototype;

public class Human implements PrototypeInterface {

	int age;
	String name;
	
	public Human(int a,String s) {
		this.age=a;
		this.name=s;	
	}
		
	
	@Override
	public Object copy() {
		
		Human human = new Human(age,name);
		
		return human;
		
	}


	@Override
	public String toString() {
		return "Human [age=" + age + ", name=" + name + "]";
	}
	
	
	
	

}
