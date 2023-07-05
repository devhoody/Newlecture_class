package com.NewlecMentoring;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Quiz_0703 {

	public static void main(String[] args) throws IOException {
		
		//2. bitmap이라는 이름으로 20X10크기의 정수를 담을 수 있는 이차원 배열을 생성하시오.
		int[][] bitmap = new int[10][20];

		//3. 3. 다음 그림과 같은 모양이 되도록 값의 위치를 변경하시오
/*
	 * 00000000001111111111
		00000000000111111111
		00000000000011111111
		00000000000001111111
		00000000000000111111
		00000000000000011111
		00000000000000001111
		00000000000000000111
		00000000000000000011
		00000000000000000001
		
 */
		
		{
			FileInputStream fis = new FileInputStream("res/bitmap.txt");
			Scanner fscan = new Scanner(fis);
			
			
			for(int j=0; j<10; j++) {
				String str = fscan.nextLine();
				String[] arr2 = str.split("");
				
				for(int i=0; i<20; i++) {
					bitmap[j][i] = Integer.parseInt(arr2[i]);
				}
			}
			
//			for(int j=0; j<10; j++) {
//				for(int i=0; i<20; i++)
//					System.out.printf("%d", bitmap[j][i]);
//				System.out.println();
//			}
			
			for(int k=0; k<10; k++) {
				for(int j=0; j<19; j++ ) {
					for(int i=0; i<19-j; i++) {
						int temp = bitmap[k][i];
						bitmap[k][i] = bitmap[k][i+1];
						bitmap[k][i+1] = temp;
					}
				}
			}
			
			for(int j=0; j<10; j++) {
				for(int i=0; i<20; i++)
					System.out.printf("%d", bitmap[j][i]);
				System.out.println();
			}
//			
//			for(int i=0; i<20; i++) {
//				System.out.printf("%d", bit[i]);
//			}
			System.out.println();
		}
			System.out.println("자리 변경 완료");
		
	// 4. res/bitmap-out.txt 파일로 bitmap 배열의 값들을 저장 
		{
			FileOutputStream fos = new FileOutputStream("res/bitmap-out.txt");
		    PrintWriter pw = new PrintWriter(fos);
		    
		    for(int j=0; j<10; j++) {
		    	for(int i=0; i<20; i++)
		    		pw.printf("%d", bitmap[j][i]);
		    	pw.println();
		    }
		    
		    pw.flush();
		    
		    pw.close();
		    fos.close();

			System.out.println("저장완료");
		}
		
	}

}
