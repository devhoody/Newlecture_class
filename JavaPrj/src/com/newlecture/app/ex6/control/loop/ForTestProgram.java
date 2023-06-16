package com.newlecture.app.ex6.control.loop;

public class ForTestProgram {

	public static void main(String[] args) {

//		// 1. 1출력
//		for (int i = 0; i < 10; i++)
//			System.out.printf("%d ", 1);
//
//		System.out.println();
//
//		// 2. 1~10
//		for (int i = 0; i < 10; i++)
//			System.out.printf("%d ", i + 1);
//
//		System.out.println();
//
//		// 3. 10~1
//		for (int i = 0; i < 10; i++)
//			System.out.printf("%d ", 10 - i);
//
//		System.out.println();
//
//		// 4. 3~7
//		for (int i = 0; i < 5; i++)
//			System.out.printf("%d ", 3 + i);
//
//		System.out.println();
//
//		// 5. 1 3 5 7 9
//		for (int i = 0; i < 5; i++)
//			System.out.printf("%d ", 2 * i + 1);
//
//		System.out.println();
//
//		// 5.1 1 3 5 7 9
//		// for의 조건식에는 두개 이상의 int형 변수 이용이 가능하다.
//		for (int i = 0, n = 1; i < 5; i++, n += 2)
//			System.out.printf("%d ", n);
//
//		System.out.println();
//
//		// 6 10 14 18 22 26 30 34 38 42
//		for (int i = 0, n = 6; i < 10; i++, n += 4)
//			System.out.printf("%d ", n);
//
//		System.out.println();
//
//		for (int i = 0, n = 1, an = 6; i < 10; i++, n++, an = 6 + (n - 1) * 4) {
//			System.out.printf("%d ", an);
//		}

		System.out.println("------------------------------");

		for (int j = 0; j < 10; j++) {
			for (int i = 0; i < 10; i++) {

				if (i + 1 == 2)
					System.out.print("b ");
				else if (i + 1 == 5)
					System.out.print("a ");
				else if (i + 1 == 9)
					System.out.print("c ");
				else
					System.out.printf("%d ", i + 1);
			}
			System.out.println();
		}

		System.out.println("------------------------------");
	}
}
