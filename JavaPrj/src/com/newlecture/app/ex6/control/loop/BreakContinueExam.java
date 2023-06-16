package com.newlecture.app.ex6.control.loop;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class BreakContinueExam {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("res/exam.list");
		Scanner fscan = new Scanner(fis);

		//4. 파일에서 성적을 읽다가 두 번째 100점 이후의 성적을 모두 출력하시오.(100점 미포함)
		
		for(int i=0, n=1; fscan.hasNext(); i++, n++) {
			String word = fscan.next();
			int kor = Integer.valueOf(word);
			
			if(5<=n && n<=8) 
				System.out.printf("%d ", kor);
				
		}
		
		fscan.close();
		fis.close();

	}
}
