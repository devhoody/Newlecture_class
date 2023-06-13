package com.newlecture.app.ex5.operator.bit;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) throws IOException {
		String name;
		int length;
		String result;

		FileInputStream fis = new FileInputStream("res/students2.data");
		Scanner fscan = new Scanner(fis);

		FileOutputStream fos = new FileOutputStream("res/students2-out.data");
		PrintWriter fout = new PrintWriter(fos);
		
		{
			name = fscan.nextLine();
			length = name.length();
			result = (length == 3) ? name : "오류";
			fout.println(result);
		}

		{
			name = fscan.nextLine();
			length = name.length();
			result = (length == 3) ? name : "오류";
			fout.println(result);
		}

		{
			name = fscan.nextLine();
			length = name.length();
			result = (length == 3) ? name : "오류";
			fout.println(result);
		}

		{
			name = fscan.nextLine();
			length = name.length();
			result = (length == 3) ? name : "오류";
			fout.println(result);
		}
		{
			name = fscan.nextLine();
			length = name.length();
			result = (length == 3) ? name : "오류";
			fout.println(result);
		}

		fout.close();
		fos.close();
		fscan.close();
		fis.close();

		System.out.println("작업완료");

	}
}
