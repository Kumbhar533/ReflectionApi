package com.reflectionapi.publicModifier;

public class Student implements StudentInf {

	public String name;

	public String age;

	public String college;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public Student() {
		super();

	}

	public Student(String name, String age, String college) {
		super();
		this.name = name;
		this.age = age;
		this.college = college;
	}

	@Override
	public String input() {

		return null;
	}

}
