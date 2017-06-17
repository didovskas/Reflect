package com.dd.reflection;

public class MainClass {
	
	public static void main(String[] args){
		EntityBuilderInterface builder = NewBuilderFactory.getBuilder();
		Entity entity = builder.getEntity();
		
		System.out.println("name is " + entity.name);
		System.out.println("And age is " +entity.age);
	}

}