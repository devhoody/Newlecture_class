/*
 * 문제 :1~10까지 피라미드식으로 출력하기 위해 10번 반복하는 코드를 작성하시오. 
 *
 * 푼날짜: 230616
 * 내가 푼 방법 : 
 * 		이중 for문 이용.
 * 		index 이용.
 * 
 */

package com.newlecture.app.ex6.control.loop;

public class NestLeapProblem {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <= i; j++)
				System.out.printf("%d ", j + 1);
			System.out.println();
		}
	} // main end

} // class end
