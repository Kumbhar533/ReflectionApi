package com.reflectionapi.publicModifier;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Parentclass {

	public static void main(String[] args) {

		Class myClassObject = Student.class;

		// 1. How we get the fully classified name className
		String ClassName = myClassObject.getName();
		System.out.println(ClassName);

		System.out.println("---------------------------------");

		// 2. How we get the only ClassName
		String simpleClassName = myClassObject.getSimpleName();
		System.out.println(simpleClassName);

		System.out.println("---------------------------------");

		// 3. return the class modifier
		int modifiers = myClassObject.getModifiers();
		System.out.println(modifiers);

		boolean abstract1 = Modifier.isAbstract(modifiers);
		boolean final1 = Modifier.isFinal(modifiers);
		boolean interface1 = Modifier.isInterface(modifiers);
		boolean native1 = Modifier.isNative(modifiers);
		boolean private1 = Modifier.isPrivate(modifiers);
		boolean protected1 = Modifier.isProtected(modifiers);
		boolean public1 = Modifier.isPublic(modifiers);
		boolean static1 = Modifier.isStatic(modifiers);
		boolean strict = Modifier.isStrict(modifiers);
		boolean synchronized1 = Modifier.isSynchronized(modifiers);
		boolean transient1 = Modifier.isTransient(modifiers);
		boolean volatile1 = Modifier.isVolatile(modifiers);

		System.out.println("---------------------------------");

		// 4. How we get package info
		Package package1 = myClassObject.getPackage();
		System.out.println(package1);

		System.out.println("---------------------------------");

		// 5. How we get SuperClass info
		Class superclass = myClassObject.getSuperclass();
		System.out.println(superclass);

		System.out.println("---------------------------------");

		// 6. How we get interfaces which implements the class
		Class[] interfaces = myClassObject.getInterfaces();
		for (Class el : interfaces) {
			System.out.println(el);
		}

		System.out.println("---------------------------------");

		// 7. How we get constructors in the class
		Constructor[] constructors = myClassObject.getConstructors();
		for (Constructor el : constructors) {
			System.out.println(el);
		}

		System.out.println("---------------------------");

		// 7. How we get methods in the class
		Method[] method = myClassObject.getMethods();

		for (Method el : method) {
			System.out.println(el);
		}

		System.out.println("---------------------------");

		// 8. How we get all field of class
		Field[] field = myClassObject.getFields();

		for (Field el : field) {
			System.out.println(el);
		}

		System.out.println("---------------------------");
		// How we get the annotations used in class
		Annotation[] annotations = myClassObject.getAnnotations();

		for (Annotation el : annotations) {
			System.out.println(el);
		}

	}

}
