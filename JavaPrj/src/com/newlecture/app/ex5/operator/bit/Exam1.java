package com.newlecture.app.ex5.operator.bit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exam1 {

	public static void main(String[] args) throws IOException {
		int n1, n2, n3, n4, n5, n6, n7, n8;
		int size, weight;

		FileInputStream fis = new FileInputStream("res/pic1.bmp");

		for (int i = 0; i < 18; i++) {
			fis.read();
		}

		n1 = fis.read();
		n2 = fis.read();
		n3 = fis.read();
		n4 = fis.read();
		n5 = fis.read();
		n6 = fis.read();
		n7 = fis.read();
		n8 = fis.read();

		size = n1 | n2 << 8 | n3 << 16 | n4 << 24;

		System.out.println(size);

		weight = n5 | n6 << 8 | n7 << 16 | n8 << 24;

		System.out.println(weight);

		System.out.printf("%d x %d", size, weight);

		fis.close();
		
		for (int i =0; i <18; i++) {
			System.out.println(i);
		}
		
		for(int i=0; i<18; ++i) {
			System.out.println(i);
		}
		
	}
}
