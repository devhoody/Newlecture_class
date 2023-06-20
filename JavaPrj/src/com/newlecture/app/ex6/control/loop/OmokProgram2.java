/*
 * 바둑게임 
┌────────────┐
│      omok game         │
└────────────┘

1. 게임시작
2. 도움말
3. 종료
 *
 * 푼날짜: 230620 화 
 * 내가 푼 방법 : 
 * 선생님 풀이 :
 */

package com.newlecture.app.ex6.control.loop;

import java.util.Scanner;

public class OmokProgram2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int menu;
		while (true) {
			System.out.println("┌────────────┐");
			System.out.println("│      omok game         │");
			System.out.println("└────────────┘");
			System.out.println();
			System.out.println("1. 게임시작");
			System.out.println("2. 도움말");
			System.out.println("3. 종료");
			System.out.print("> ");
			System.out.println();

			menu = scan.nextInt();
			switch (menu) {
			// 1.게임시작
			case 1:

				// 10 x 10
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
				GAMEOVER :
				while (true) {

					int ox = -1;
					int oy = -1;


					do {

						System.out.println("그만두기 : -1 0");
						System.out.print("x sp y : ");
						ox = scan.nextInt();
						oy = scan.nextInt();
						if (ox == -1) {
							System.out.println("GAMEOVER");
							break GAMEOVER;
						}

						if (!((1 <= ox && ox <= 10) && (1 <= oy && oy <= 10)))
							System.out.println("오목 좌표의 범위(-1 or 1~10)을 벗어났습니다.");

					} while (!((1 <= ox && ox <= 10) && (1 <= oy && oy <= 10)));

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
				break;
				

			// 2. 도움말
			case 2: {
				System.out.println("도움말");
				break;
			}

			// 3. 종료
			case 3: {
				System.out.println("종료");
				return;
			}

			default:
				System.out.println("입력 값은 1~3안으로 입력해주세요.");

			} // switch off
		} // while off
	} // main off

	public static boolean isNum(int ox, int oy) {
		boolean isNum1 = false;
		if ((!(1 <= ox && ox <= 10) || !(1 <= oy && oy <= 10)))
			isNum1 = true;
		return isNum1;
	}
} // class off
