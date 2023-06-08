package com.newlecture.app.ex2.copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.Charset;

public class Program {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("res/data1.txt");
//		PrintStream fout = new PrintStream(fos, true, "UTF-8");
		PrintWriter fout2 = new PrintWriter(fos, true, Charset.forName("UTF-8"));

//		fout2.write("문자열 전용 writer");
		
		fout2.println("hello");
		fout2.println(99036809583345L);
		fout2.print("안녕하세요");
		System.out.println("hello");
		System.out.println(99036809583345L);
		System.out.print("안녕하세요");

		fout2.close();
		fos.close();

	}
}
