package com.dd.reflection;

public class EntityFromWeb implements EntityBuilderInterface {

	@Override
	public Entity getEntity() {
		int age = 2;
		String name ="Web";
		return new Entity(age, name);
	}

}
