/*
 * 문제 : 주어진 3개의 변수를 통해 다음과 같은 결과를 출력하세요. (변수 10개)
 * 		1 1 2 3 5 8 13 21 34 55
 *		피보나치 수열 
 *
 *		int x = 1;
 *		int y = 0;
 *		int z = 0;
 *
 *
 * 푼날짜: 230615
 * 내가 푼 방법 : 
 * 		저글링처럼 번갈아가면서 출력.
 * 
 */

package com.NewlecMentoring;

public class Practice3 {

	public static void main(String[] args) {
		int x = 1;
		int y = 0;
		int z = 0;
		
		System.out.printf("%d ", x);
		for(int i =0; i<10; i++) {
			z = x + y;
			System.out.printf("%d ", z);
			y = x + z;
			System.out.printf("%d ", y);
			x = y + z;
			System.out.printf("%d ", x);
		}
	} // main end 

} // class end
