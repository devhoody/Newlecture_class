/*
 * 문제 : Array 1일차 문제 모음 
 *
 *		int x = 1;
 *		int y = 0;
 *		int z = 0;
 *
 *
 * 푼날짜: 230621
 * 내가 푼 방법 : 
 * 
 */

package com.NewlecMentoring;

import java.util.Scanner;

public class Array_230621 {

	public static void main(String[] args) {
		// 1. 각 기본형 타입별 배열을 모두 선언해보세요. (byte, short, int, long. float, double, char)
		byte[] b1 = new byte[5];
		short[] sh1 = new short[5];
		int[] num1 = new int[5];
		long[] l1 = new long[5];
		float[] f1 = new float[5];
		double[] d1 = new double[5];
		char[] c1 = new char[5];
		boolean[] bool1 = new boolean[5];

		System.out.println("-------------------------------------------------");
		{
			int[] numbers; // 선언 , 기본타입 o
			numbers = new int[10]; // 10배열 만든 후 할당

			numbers[1] = 3; // 2번째 숫자에 3 할당
		}
// long형 배열 longNumbers에 크기 3인 배열을 만든 후, 할당하세요
		{
			long[] longNumbers;
			longNumbers = new long[3];
			for (int i = 0; i < 3; i++)
				longNumbers[i] = (long) i;
		}
//long형 배열 longNumbers에 크기 3인 배열을 만든 후, index 2번째를 출력해보세요.
		{
			long[] longNumbers;
			longNumbers = new long[3];
			System.out.printf("index 2번쨰 : %d\n", longNumbers[1]);
		}
/*
 *  boolean형 배열 isChecked를 선언하세요. 
 *  isChecked에 true, false, true를 new연산자없이 할당하세요.
 */
		
		{
			boolean[] isChecked = { true, false, true };
		}
/*
 * 크기가 20인 int형 배열 numbers를 선언하세요. 
 * numbers의 index 0부터 19까지, for문을 이용해서 0, 1,  2… 19를 할당해주세요
 */
		{
			int[] numbers = new int[20];
			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = i;
				System.out.printf("%d ", numbers[i]);
			}
			System.out.println();
		}
/*
 *  크기가 10인 문자형 배열 chars를 선언하세요. 
 *  반복문을 이용하여 chars의 index가 3의 배수일 땐 ‘a’를, 5의 배수일때 ‘b’를 할당하여 출력해보세요.
 */
		{
			char[] chars = new char[10];
			for (int i = 0; i < 10; i++) {
				if (i == 0)
					continue;
				else if (i % 3 == 0)
					chars[i] = 'a';
				else if (i % 5 == 0)
					chars[i] = 'b';
				System.out.printf("%c", chars[i]);
			}
		}
/*
 * 		선언부와 출력부를 수정하지 말고 코드를 작성해 

		3
		5
		7

		과 같이 출력해보세요.

 */
		{
			// -----------------선언부

			int a = 5;
			int b = 7;
			int c = 3;

			// -----------------코드작성 부분

			int temp = 0;
			// a-> c
			temp = a;
			a = c;
			c = b;
			b = temp;

			System.out.println();
			// -----------------출력부

			System.out.println(a); // 3
			System.out.println(b); // 5
			System.out.println(c); // 7
		}
		
		//  54321초가 몇시간 몇분 몇초인지 구하시오
		{
			int time = 54321;
			
			int hour = time / (60 * 60);
			int minute = (time / 60) % 60;
			int second = time % 60;
			
			System.out.printf("%d 시간 %d분 %d초", hour, minute, second);
		}
		
		// 1을 입력하면 계속 메뉴를 선택하고 9를 누르면 종료가 되는 프로그램을 만들어보세요.

		{
			Scanner scan = new Scanner(System.in);
			int menu = 0;
			while(true) {
				System.out.println("메뉴를 선택하시오.");
				System.out.println("1. 계속 9.종료 ");
				
				menu = scan.nextInt();
				
				switch(menu) {
				
				case 1:
					break;
					
				case 9:
					System.out.println("종료되었습니다.");
					return;
				}
				
			}
		}
	
		
	} // main end

} // class end
