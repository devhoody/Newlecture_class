package com.newlecture.app.ex6.control.loop;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class BreakContinueExam {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("res/exam.list");
		Scanner fscan = new Scanner(fis);

		// 5. 파일에서 성적을 읽다가 5번째에서 8번째까지의 숫자를 출력하라.
		// 선생님 풀이

		for (int i = 0; fscan.hasNext(); i++) {
			String word = fscan.next();
			int kor = Integer.valueOf(word);

			if (i < 4)
				continue;

			if (i == 8)
				break;

			System.out.printf("%d ", kor);
		}

		fscan.close();
		fis.close();

	}
}
