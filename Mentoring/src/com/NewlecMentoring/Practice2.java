/*
 * 문제 : 1! + 2! + 3! + 4!+ 5! (Factorial)
 * 푼날짜: 230615
 * 내가 푼 방법 : 
 * 
 * 1
 * 1 * 2
 * 1 * 2 * 3
 * 1 * 2 * 3 * 4
 * 1 * 2 * 3 * 4 * 5
 * 
 */

package com.NewlecMentoring;

public class Practice2 {

	public static void main(String[] args) {
		int num = 1; 
		int total = 0; 
		
		for(int i=0; i<5; i++) {
			num *= (i+1);
			System.out.printf("num = %d, i+1 : %d\n", num, i+1);
			total += num;
		}
		System.out.printf("total is %d\n",total);

	} // main end 

} // class end
