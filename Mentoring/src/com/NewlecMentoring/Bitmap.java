package com.NewlecMentoring;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Bitmap {

	public static void main(String[] args) throws IOException {
		int[][] bitmap = new int[20][10];
		
		//3. 0과1의 위치를 변경하시오.
		FileInputStream fis = new FileInputStream("res/bitmap.txt");
		
		for(int x =0; x<20; x++)
			for(int y =0; y<10; y++) {
				bitmap[x][y] = fis.read();
				System.out.println(bitmap[x][y]);
			}
		
		fis.close();
	}

}
