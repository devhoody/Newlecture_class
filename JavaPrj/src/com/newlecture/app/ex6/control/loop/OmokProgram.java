/*
 * 바둑판  그리기 
 *⏉⏉⏉⏉⏉⏉⏉⏉⏉⏉⏉
 *+++++++++++++
 *+++++++++++++
 *+++++++++++++
 *+++++++++++++
 *+++++++++++++
 *+++++++++++++
 *+++++++++++++
 *+++++++++++++
 *+++++++++++++
 *+++++++++++++
 *+++++++++++++
 *⏊⏊⏊⏊⏊⏊⏊⏊⏊⏊⏊
 *
 * 푼날짜: 230616
 * 내가 푼 방법 : 
 * 
 * 
 * 선생님 풀이 :
 *  
 */

package com.newlecture.app.ex6.control.loop;

public class OmokProgram {

	public static void main(String[] args) {
		for(int i=0; i<12; i++) {
			for(int j=0; j<10; j++) {
				if(i==0) 
					System.out.print("⏉");
				else if(i==11)
					System.out.print("⏊");
				else
					System.out.print("+");
			}
			System.out.println();
		}
	}
// ⏉⏊
}
