package com.solvd.itcomp.reflectionTest;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.itcomp.personal.Developer;

public class MainReflection {
	

	public static void main(String[] args) {
		
		Logger log = LogManager.getFormatterLogger(MainReflection.class);
		
		List<String> words = new ArrayList<String>();
		words.add("A");
		words.add("hello");
		words.add("123");
		
		ReflectionTest reflec= new ReflectionTest(24,"Nicolas",108.2,words);
		
		Class a = reflec.getClass();
		
		Method[] methods = a.getDeclaredMethods();
		
		try {
			Field field = a.getField("name");
			field.set(reflec, "Nicholas");
			
			int modifier= field.getModifiers();
			
			String mod= Modifier.toString(modifier);
			
			
			log.info("The fild age has been changed with: "+ field.get(reflec));
			log.info("The modifier is: " +mod);
			
		} catch (NoSuchFieldException e) {
			log.error(e);
		} catch (SecurityException e) {
			log.error(e);
		} catch (IllegalArgumentException e) {
			log.error(e);
		} catch (IllegalAccessException e) {
			log.error(e);
		}
		
		

	}

}
