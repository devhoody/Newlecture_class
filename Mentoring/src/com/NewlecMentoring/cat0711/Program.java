package com.NewlecMentoring.cat0711;

public class Program {

	public static void main(String[] args) {
		Cat cat1 = new Cat("노멀", 1);
		cat1.sayAge();
		
		Cat cat2 = new LiarCat("쿠라", 3);
		cat2.sayAge();
//		cat2.lie();

	}

}
