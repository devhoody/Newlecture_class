package com.newlecture.app.ex6.control.loop;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exam {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("res/exam.list");
		Scanner fscan = new Scanner(fis);

		int i = 0;
		while (fscan.hasNext()) {
			String word = fscan.next();
			int kor1 = Integer.valueOf(word);
			System.out.printf("%d,", kor1);
			i++;

//			if(i == 5)
//				break;
		}

//		for(int i=0; i<5; i++) {
//			String word = fscan.next();
//			int kor1 = Integer.valueOf(word);
//			System.out.printf("%d,", kor1);
//		}

		fscan.close();
		fis.close();

	}

}
