/*
 * 문제 :1~6 까지 피라미드식으로 출력하기 위해 4번 반복하는 코드를 작성하시오. 
 * 1 2 3 4 5 6 7 8 9 10
 * 1 2 3 4 5 6 7 8 9
 * 1 2 3 4 5 6 7 8 
 * 1 2 3 4 5 6 7 
 * 1 2 3 4 5 6
 * 1 2 3 4 5
 * 
 *
 * 푼날짜: 230616
 * 내가 푼 방법 : 
 * 		이중 for문 이용.
 * 		index i j 이용.
 *		j < 10 - i 
 * 
 * 선생님 풀이 : 
 * 		j < 10 - i
 */

package com.newlecture.app.ex6.control.loop;

public class NestLeapProblem {

	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 10 - i; j++)
				System.out.printf("%d ", j + 1);
			System.out.println();
		}

		System.out.println("------------------------------");
	} // main end

} // class end
