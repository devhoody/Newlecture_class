package com.NewlecMentoring.cat0711;

public class LiarCat extends Cat {
	
	private int age;

	public LiarCat() {
		this(null,0);
	} // 이건 왜 해야 하는 건가요...?->무

	public LiarCat(String name, int age) {
		super(name,age);
		this.age=2*age;
	}
	
	@Override
	protected void sayAge() { // public도 상관없음.
		super.sayAge();
		System.out.printf("나는 <<%d>>살이야\n", this.age);
	}
	
	public void lie() {
		System.out.println("생쥐가 나타났다!");
	}
	
}
