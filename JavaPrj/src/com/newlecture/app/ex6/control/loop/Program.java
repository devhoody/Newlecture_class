package com.newlecture.app.ex6.control.loop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("res/pic1.bmp");
		FileOutputStream fos = new FileOutputStream("res/pic1-copy.bmp");
		
		int n = -1;
		while((n = fis.read()) != -1) // 조건식에 함수 적용 가능
			fos.write(n);
		
		fos.close();
		fis.close(); 
	}

}
