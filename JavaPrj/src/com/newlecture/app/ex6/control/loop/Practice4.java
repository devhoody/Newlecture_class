/*
 * 문제 : 4. 파일에서 성적을 읽다가 두 번째 100점 이후의 성적을 모두 출력하시오.(100점 미포함)
 *
 * 푼날짜: 230616
 * 내가 푼 방법 : 
 * 		스위치 두개 found, found1 변수를 선언하여 풀고자 했음.
 * 
 */

package com.newlecture.app.ex6.control.loop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("res/exam.list");
		Scanner fscan = new Scanner(fis);
		
		//4. 파일에서 성적을 읽다가 두 번째 100점 이후의 성적을 모두 출력하시오.(100점 미포함)
		
		for (boolean found = false, found1 = false; fscan.hasNext();) {
			String word = fscan.next();
			int kor = Integer.valueOf(word);
			
			if(found1)
				System.out.printf("%d ", kor);
			
			if (found == true && kor == 100) 
				found1 = true;
			
			if(kor == 100)
				found = true;
		}
		
		for(int num = 0; fscan.hasNext();) {
			String word = fscan.next();
			int kor = Integer.valueOf(word);
			
			if(kor == 100) {
				num++;
				continue;
			}
			
			if(num == 2) {
				System.out.printf("%d ", kor);
			}
		}
		
		// 뉴렉썜이 하신 풀이
		for(int num = 0; fscan.hasNext();) {
			String word = fscan.next();
			int kor = Integer.valueOf(word);
			
			if(kor == 100) 
				num++;
			
			if(num < 2 || kor == 100) 
				continue;
				
			System.out.printf("%d ", kor);
		}
	} // main end 

} // class end
