package com.dd.reflection;
 
public class EntityFromSql implements EntityBuilderInterface {

	@Override
	public Entity getEntity() {
		int age = 1;
		String name = "SQL";
		return new Entity(age, name);
	}

}
