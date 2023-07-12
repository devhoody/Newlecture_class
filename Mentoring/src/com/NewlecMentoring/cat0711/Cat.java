package com.NewlecMentoring.cat0711;

public class Cat {
	private String name;
	private int age;
	
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public Cat() {
		this(null, 0);
	}
	
	protected void sayAge() {
		System.out.printf("나 <<%s>>는 <<%d>>살이야.\n", name, age);
	}
	
}
