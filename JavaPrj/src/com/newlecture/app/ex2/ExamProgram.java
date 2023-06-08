package com.newlecture.app.ex2;

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
		
		// 성적 입력
		kor1 =0;
		kor2 =0;
		kor3 =0;
		
		FileInputStream fis = new FileInputStream("res/exam.txt");
		Scanner fscan = new Scanner(fis);
		
		kor1 = fscan.nextInt();
		System.out.println(kor1);
		kor2 = fscan.nextInt();
		System.out.println(kor2);
		kor3 = fscan.nextInt();
		System.out.println(kor3);
		
		
//		kor1 = fis.read(); // 100
//		System.out.println(kor1);
//		kor2 = fis.read();
//		System.out.println(kor2);
//		kor3 = fis.read();
//		System.out.println(kor3);
		
		
		
		fis.close();

		// 성적 출력
		total = kor1 + kor2 + kor3;
		avg = total / 3.0f;

		// 성적 저장
		FileOutputStream fos = new FileOutputStream("res/exam-out.txt");
		PrintWriter fout = new PrintWriter(fos, true, Charset.forName("UTF-8"));
		
		fout.printf("total is %1$d\n", total);
		fout.printf("avg is %f\n", avg);

		fout.close();
		fos.close();

		// 출력
		System.out.println("작업라인");

	}

}
