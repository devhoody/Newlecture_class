package com.NewlecMentoring;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Array_alphabet_230622 {

	public static void main(String[] args) throws IOException {
		//문제 5  : 다음 각 절차를 따라 작성하시오.
			// 1. res/alphabet.txt 파일을 생성하고 다음 데이터를 복사/붙여넣으시오.
			//   abcdefghijklmn
			
			// 2. alphabet이라는 이름으로 문자 15개를 저장할 수 있는 배열 객체를 생성한다.
			char[] alphabet = new char[15];
			int size = alphabet.length;
			
			// 3. res/alphabet.txt 파일에 저장된 구분자가 없는 영문자 값들을 alphabet 배열에 로드한다. 
			{
				FileInputStream fis = new FileInputStream("res/alphabet.txt");
				
				for(int i=0; i<size; i++) {
					alphabet[i] = (char)fis.read();
					System.out.printf("%c ", alphabet[i]);
				}
				System.out.println();
				System.out.println("로드 완료");
				
				fis.close();
			}
			
			// 3. 배열의 값이 다음과 같은 상태가 되도록 자리를 바꾼다.
			//		    nmlkjihgfedcba
			
			{
				for(int i=0; i<size -1; i++)
					for(int j=0; j<size -1 -i; j++) {
						char temp = alphabet[j+1];
						alphabet[j+1] = alphabet[j];
						alphabet[j] = temp;
					}
				
				for(int i=0; i<size; i++)
					System.out.printf("%c ", alphabet[i]);
			}
			
			// 4. res/alphabet-out.txt 파일로 배열의 값들을 저장 
			{
				FileOutputStream fos = new FileOutputStream("res/alphabet-out.txt");
				PrintWriter pw = new PrintWriter(fos);
				
				for(int i=0; i<size; i++)
					pw.print(alphabet[i]);
				
				pw.flush();
				
				pw.close();
				fos.close();
			    
				System.out.println("저장 완료");
			}
	}

}