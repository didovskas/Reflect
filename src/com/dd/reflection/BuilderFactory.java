package com.dd.reflection;

public class BuilderFactory {
	
	public static EntityBuilderInterface getSqlEntityBuilder(){
		return new EntityFromSql();
	}
	
	public static EntityBuilderInterface getWebEntityBuilder(){
		return new EntityFromWeb();
	}

}
