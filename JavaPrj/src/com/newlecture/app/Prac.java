package com.newlecture.app;

import java.io.IOException;
import java.util.Scanner;

public class Prac {

	public static void main(String[] args) throws IOException{
		System.out.write('A');
		System.out.flush();
		
		System.out.write(65);
		System.out.flush();
		System.out.println();
		
		int year = 2023;
		int month = 6;
		int day = 8;
			
		
		System.out.printf("%d - %d - %d\n", year, month, day);
		
		
		System.out.print("\\  /\\\n");
		System.out.print(" ) (\')\n");
		System.out.print(")( /  )\n");
		System.out.print("\\(__)|");
		
		// Scanner를 이용하여 값 입력
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		int input3 = sc.nextInt();
		System.out.printf("%d %d %d\n", input1, input2, input3);

		
		// read를 이용하여 값 입력
		int kor1 = System.in.read();
		int kor2 = System.in.read();
		int kor3 = System.in.read();
		int kor4 = System.in.read();
		int kor5 = System.in.read();
		int kor6 = System.in.read();
		int kor7 = System.in.read();
		int kor8 = System.in.read();
		

		// write를 이용하여 출력
		System.out.write(kor1);
		System.out.write(kor2);
		System.out.write(kor3);
		System.out.write(kor4);
		System.out.write(kor5);
		System.out.write(kor6);
		System.out.write(kor7);
		System.out.write(kor8);
		System.out.flush();
		System.out.println();
		
		// print를 이용하여 출력 (형변환1)
		System.out.print((char)kor1);
		System.out.print((char)kor2);
		System.out.print(" ");	
		System.out.print((char)kor4);
		System.out.print((char)kor5);
		System.out.print(" ");
		System.out.print((char)kor7);
		System.out.print((char)kor8);
		
		// print를 이용하여 출력 (형병환2)
		System.out.print("\n");
		char c1 = (char)System.in.read();
		char c2 = (char)System.in.read();
		char c3 = (char)System.in.read();
		char c4 = (char)System.in.read();
		char c5 = (char)System.in.read();
		char c6 = (char)System.in.read();
		char c7 = (char)System.in.read();
		char c8 = (char)System.in.read();
		char c9 = (char)System.in.read();

		System.out.print(c1);
		System.out.print(c2);
		System.out.print(" ");	
		System.out.print(c4);
		System.out.print(c5);
		System.out.print(" ");
		System.out.print(c7);
		System.out.print(c8);
		System.out.println();
		
	}
}
