package com.newlecture.app.ex2.copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

public class ExamProgram {

	public static void main(String[] args) throws IOException {
		int kor1, kor2, kor3;
		int total;
		float avg;

		// 성적입력

		kor1 = 0;
		kor2 = 0;
		kor3 = 0;	

		FileInputStream fis = new FileInputStream("res/pracExam.txt");
		Scanner fscan = new Scanner(fis);

		kor1 = fscan.nextInt();
		System.out.println(kor1);
		kor2 = fscan.nextInt();
		System.out.println(kor2);
		kor3 = fscan.nextInt();
		System.out.println(kor3);

		fis.close();

//		// 성적 입력
//		FileOutputStream fos = new FileOutputStream("res/prac-exam.txt");
//		PrintWriter pw = new PrintWriter(fos, true, Charset.forName("UTF-8"));
//
//		total = kor1 + kor2 + kor3;
//		avg = total / 3.0f;
//
//		System.out.printf("total is %d\n", total);
//		System.out.printf("avg is %f\n", avg);
//
//		pw.close();
//		fos.close();

	}

}
