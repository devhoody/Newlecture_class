package com.newlecture.app.ex6.control.loop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Program3 {

	public static void main(String[] args) throws IOException {
		int n1, n2, n3, n4;
		int width, weight;
		FileInputStream fis = new FileInputStream("res/pic1.bmp");
		
		{	
			for(int i = 0; i < 18; i++)
				fis.read();
			
		}
		
		{
			n1 = fis.read();
			n2 = fis.read();
			n3 = fis.read();
			n4 = fis.read();
			
			width = (n1 << 0) & 0x000000ff | 
					(n2 << 8) & 0x0000ff00 | 
					(n3 << 16)  & 0x00ff0000 | 
					(n4 << 24)  & 0xff000000 ;
			
			System.out.printf("width : %d\n",width);
		}
		
		{
			n1 = fis.read();
			n2 = fis.read();
			n3 = fis.read();
			n4 = fis.read();
	
			weight = (n1 << 0)  & 0x000000ff  | 
					(n2 << 8)  & 0x0000ff00 | 
					(n3 << 16)  & 0x00ff0000 | 
					(n4 << 24) & 0xff000000 ;
			System.out.printf("weight : %d\n",weight);
		
		System.out.printf("%d x %d", width, weight);

		fis.close();
		}
	}
}
