package com.newlecture.app.ex4.text.copy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("res/students1.data");
		Scanner fscan = new Scanner(fis);

		FileOutputStream fos = new FileOutputStream("res/students1-out.data");
		PrintWriter fout = new PrintWriter(fos);

		{
			String line = fscan.nextLine();
			String name = line.substring(1, 3);
			fout.println(name);
		}

		{
			String line = fscan.nextLine();
			String name = line.substring(1, 3);
			fout.println(name);
		}

		{
			String line = fscan.nextLine();
			String name = line.substring(1, 3);
			fout.println(name);
		}

		{
			String line = fscan.nextLine();
			String name = line.substring(1, 2);
			fout.println(name);
		}

		{
			String line = fscan.nextLine();
			String name = line.substring(1, 1);
			fout.println(name);
		}

		fout.close();
		fos.close();
		fscan.close();
		fis.close();

	}

}
