package com.NewlecMentoring;

public class NestLeap_math_230622 {

	public static void main(String[] args) {
		/*
		 * —----------------------------------------------------------------------------
		 * ---------제어구조 중첩 + 수학 문제
		 * —----------------------------------------------------------------------------
		 */

		// 문제 9 : 다음 각 절차를 따라 작성하시오.
		/*
		 * 1. 다음 한문장을 반복해서 다음과 같은 출력이 가능하도록 하는 코드를 작성하시오.
		 *  System.out.printf(“%c”, ‘┼’); 또는 System.out.printf(“%c”, ‘○’);
		 * 
		 * ○┼┼┼┼┼┼┼┼┼ 
		 * ┼○┼┼┼┼┼┼┼┼ 
		 * ┼┼○┼┼┼┼┼┼┼ 
		 * ┼┼┼○┼┼┼┼┼┼ 
		 * ┼┼┼┼○┼┼┼┼┼ 
		 * ┼┼┼┼┼○┼┼┼┼ 
		 * ┼┼┼┼┼┼○┼┼┼
		 * ┼┼┼┼┼┼┼○┼┼ 
		 * ┼┼┼┼┼┼┼┼○┼ 
		 * ┼┼┼┼┼┼┼┼┼○
		 */
		{
			{
				// 코드를 작성하는 공간
				for (int i = 0; i < 10; i++) {
					for (int j = 0; j < 10; j++) {
						if (i == j)
							System.out.printf("%c", '○');
						else
							System.out.printf("%c", '┼');
					}
					System.out.println();
				}

				System.out.println("1번 과제 출력 완료");
			} // 1번 문제 off

			/*
			 * // 2. 위의 답을 복사해서 다음과 같은 출력이 가능하도록 코드를 수정하시오. ○┼┼┼┼┼┼┼┼┼○ ┼○┼┼┼┼┼┼┼○┼
			 * ┼┼○┼┼┼┼┼○┼┼ 
			 * ┼┼┼○┼┼┼○┼┼┼ 
			 * ┼┼┼┼○┼○┼┼┼┼ 
			 * ┼┼┼┼┼○┼┼┼┼┼ 
			 * ┼┼┼┼○┼○┼┼┼┼ 
			 * ┼┼┼○┼┼┼○┼┼┼
			 * ┼┼○┼┼┼┼┼○┼┼ 
			 * ┼○┼┼┼┼┼┼┼○┼ 
			 * ○┼┼┼┼┼┼┼┼┼○
			 */

			{
				for (int i = 0; i < 10; i++) {
					for (int j = 0; j < 10; j++) {
						if (i == j)
							System.out.printf("%c", '○');
						else if (i == -j + 9)
							System.out.printf("%c", '○');
						else
							System.out.printf("%c", '┼');
					}
					System.out.println();
				}

				System.out.println("2번 과제 출력 완료");
			} // 2번 문제 off

			// 3. 위의 답을 복사해서 다음과 같은 출력이 가능하도록 코드를 수정하시오.
			/*
			 * ○┼┼┼┼┼┼┼┼┼○ 
			 * ┼○┼┼┼┼┼┼┼○┼ 
			 * ┼┼○┼┼┼┼┼○┼┼ 
			 * ┼┼┼○┼┼┼○┼┼┼ 
			 * ┼┼┼┼○┼○┼┼┼┼ 
			 * ┼┼┼┼┼○┼┼┼┼┼
			 * ┼┼┼┼○○○┼┼┼┼ 
			 * ┼┼┼○○○○○┼┼┼ 
			 * ┼┼○○○○○○○┼┼ 
			 * ┼○○○○○○○○○┼ 
			 * ○○○○○○○○○○○
			 */

			{
				for (int i = 0; i < 10; i++) {
					for (int j = 0; j < 10; j++) {
						if (i >= j && i >= -j + 9)
							System.out.printf("%c", '○');
						else if (i == j || i == -j + 9)
							System.out.printf("%c", '○');
						else
							System.out.printf("%c", '┼');
					}
					System.out.println();
				}

				System.out.println("3번 과제 출력 완료");

			} // 3번 문제 off

		} // 문제 off

	} // main off

} // class off
