package com.reflectionapi.privatemodifier;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ParentFruit {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {

		Class<Fruits> aClass = Fruits.class;

		// How we get specific data type constructors
		Constructor<Fruits> constructor = aClass.getConstructor(String.class, String.class);

		System.out.println(constructor);

		System.out.println("-------------------------------");
		// how we get the parameter types of constructor
		Class[] parameterTypes = constructor.getParameterTypes();
		for (Class<?> el : parameterTypes) {
			System.out.println(el);
		}

		System.out.println("-------------------------------");

		// how we instantiate any class with constructor

		Constructor con = Fruits.class.getConstructor(String.class, String.class);

		Fruits fruits = (Fruits) con.newInstance("Apple", "Red");
		System.out.println(fruits.getFruitName() + " " + fruits.getFruitColur());

		System.out.println("-------------------------------");

		// How we get field and filed type and field name , Getting and Setting Field
		// Values
		// Here we access the private fields
		Field field = aClass.getField("fruitName");
		System.out.println(field);
		// How we get field name and type

		String fieldName = field.getName();
		Class fieldType = field.getType();

		System.out.println("FieldName :->" + fieldName + "   " + "fieldType :->" + fieldType);

		System.out.println("-------------------------------");

		// How we getting and setting the field by reflectionApi

		Field fieldColur = aClass.getField("fruitColur");

		Fruits fruits2 = new Fruits();

		Object value = fieldColur.get(fruits2);
		fieldColur.set(fruits2, value);
		System.err.println(fruits2 + "" + value);

	}

}
