package com.newlecture.app.ex1;

import java.io.FileOutputStream;
import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {
		FileOutputStream fout = new FileOutputStream("res/data.txt");

		fout.write(97);
		fout.write(100);

		fout.flush();

		fout.close();

		System.out.println(30);

	}

}
