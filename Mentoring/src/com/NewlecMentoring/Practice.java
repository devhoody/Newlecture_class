/*
 * 문제 : 66 소인수분해
 * 푼날짜: 230615
 * 내가 푼 방법 : 
 * 
 */

package com.NewlecMentoring;

public class Practice {

	public static void main(String[] args) {
		int num = 66; // 넘겨받을값
		
		for(int i=2; i<=num; i++) {
			if(num % i ==0) {
				num = num / i;
				System.out.printf("num: %d, i: %d\n", num, i);
			}
		}

	} // main end 

} // class end
