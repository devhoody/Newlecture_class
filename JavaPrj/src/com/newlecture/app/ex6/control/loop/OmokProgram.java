/*
 * 바둑판  그리기 10 x 10
┌┬┬┬┬┬┬┬┬┬┐
├┼┼┼┼┼┼┼┼┼┤
├┼┼┼┼┼┼┼┼┼┤
├┼┼┼┼┼┼┼┼┼┤
├┼┼┼┼┼┼┼┼┼┤
├┼┼┼┼┼┼┼┼┼┤
├┼┼┼┼┼┼┼┼┼┤
├┼┼┼┼┼┼┼┼┼┤
├┼┼┼┼┼┼┼┼┼┤
├┼┼┼┼┼┼┼┼┼┤
└┴┴┴┴┴┴┴┴┴┘
 *
 * 푼날짜: 230616 금
 * 내가 푼 방법 : 
 * 
 * 
 * 선생님 풀이 :
 *  
 */

package com.newlecture.app.ex6.control.loop;

import java.util.Scanner;

public class OmokProgram {

	public static void main(String[] args) {
		System.out.println("10 x 10 오목판");
		for (int j = 0; j < 12; j++) {
			for (int i = 0; i < 12; i++)
				// 10 x 10
				if (i == 0 && j == 0)
					System.out.print("┌");
				else if (i == 0 && j == 11)
					System.out.print("└");
				else if (i == 11 && j == 0)
					System.out.print("┐");
				else if (i == 11 && j == 11)
					System.out.print("┘");
				else if (i == 0)
					System.out.print("├");
				else if (j == 0)
					System.out.print("┬");
				else if (j == 11)
					System.out.print("┴");
				else if (i == 11)
					System.out.print("┤");
				else
					System.out.print("┼");
			System.out.println();
		}
		{

			while (true) {

				int ox = -1;
				int oy = -1;
				
				
				Scanner scan = new Scanner(System.in);
//			boolean isOn=true;

				do {

					System.out.println("그만두기 : -1 0");
					System.out.print("x sp y : ");
					ox = scan.nextInt();
					if (ox == -1) {
						System.out.println("프로그램종료");
						return;
					}
					oy = scan.nextInt();

					if (!((1 <= ox && ox <= 10) && (1 <= oy && oy <= 10))) {
						System.out.println("오목 좌표의 범위(-1 or 1~10)을 벗어났습니다.");
					}

				} while (!((1 <= ox && ox <= 10) && (1 <= oy && oy <= 10)));

//				!(1 <= ox && ox <= 10) || !(1 <= oy && oy <= 10)

				for (int j = 0; j < 12; j++) {
					for (int i = 0; i < 12; i++)
						if (i == 0 && j == 0)
							System.out.print("┌");
						else if (i == 0 && j == 11)
							System.out.print("└");
						else if (i == 11 && j == 0)
							System.out.print("┐");
						else if (i == 11 && j == 11)
							System.out.print("┘");
						else if (ox == i && oy == j)
							System.out.print("ㅁ");
						else if (i == 0)
							System.out.print("├");
						else if (j == 0)
							System.out.print("┬");
						else if (j == 11)
							System.out.print("┴");
						else if (i == 11)
							System.out.print("┤");
						else
							System.out.print("┼");
					System.out.println();
				}
			}
		}

	} // main off

	public static boolean isNum(int ox, int oy) {
		boolean isNum1 = false;
		if ((!(1 <= ox && ox <= 10) || !(1 <= oy && oy <= 10)))
			isNum1 = true;
		return isNum1;
	}
} // class off
