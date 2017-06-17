package com.dd.reflection;
import java.util.PropertyResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NewBuilderFactory {

	 private static final String BUILDER_CLASS = "builder.class";
	 
	 
	 public static EntityBuilderInterface getBuilder(){
		
		 PropertyResourceBundle property = (PropertyResourceBundle)PropertyResourceBundle.getBundle("com.dd.reflection.builder");
	     String className = property.getString(BUILDER_CLASS);
	     try {
	            // Загружаем класс по имени
	            Class cl = Class.forName(className);
	            // Т.к. наш класс должен имплементировать интерфейс EntityBuilder
	            // то мы можем сделать приведение к интерфейсу
	            EntityBuilderInterface builder = (EntityBuilderInterface)cl.newInstance();
	            return builder;
	        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
	            ex.printStackTrace(System.out);
	        }
	        return null;
	    }
	        
	        
	        
	     
		 
	 }

