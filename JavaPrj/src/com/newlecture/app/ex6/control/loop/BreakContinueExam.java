package com.newlecture.app.ex6.control.loop;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class BreakContinueExam {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("res/exam.list");
		Scanner fscan = new Scanner(fis);

		// 파일에서 성적을 5번째까지만 읽어서 화면에 출력
		// index가 필요하면 for문 이용
		for (int i = 0; fscan.hasNext(); i++) {
			String word = fscan.next();
			int kor1 = Integer.valueOf(word);
			System.out.printf("%d,", kor1);

			// 성능
			// if(i==5)
			// break;

			// 사고 직관적
			if (i == 5)
				break;
		}

		// 파일에서 성적을 5번째부터 읽어서 화면에 출력
		for (int i = 0, n = 1; fscan.hasNext(); i++, n++) {
			String word = fscan.next();
			int kor1 = Integer.valueOf(word);

			if (n < 5)
				continue;
			System.out.printf("%d,", kor1);
		}

		// 파일에서 성적을 읽다가 100점을 만나면 그 이후의 성적을 출력하시오.
		for (boolean found = false; fscan.hasNext();) {
			String word = fscan.next();
			int kor = Integer.valueOf(word);

			if (kor == 100) {
				found = true;
			}

			if ((!found) || (kor == 100))
				continue;

			System.out.printf("%d ", kor);
		}

		for (int n = 0; fscan.hasNext();) {
			String word = fscan.next();
			int kor1 = Integer.valueOf(word);

			if (kor1 == 100)
				n = 1;

			if (n != 1)
				continue;

			System.out.printf("%d, ", kor1);
		}

		fscan.close();
		fis.close();

	}
}
