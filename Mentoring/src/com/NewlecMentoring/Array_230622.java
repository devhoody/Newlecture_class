package com.NewlecMentoring;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Random;
import java.util.Scanner;

public class Array_230622 {

	public static void main(String[] args) throws IOException {
		/*
		 * 문제 1: res/data.txt 파일에 다음처럼 빈 공백으로 구분 된 값들이 있다.
		 * 
		 * 90 87 20 30 29 39 49 38 10 19 87 29 38 27 8
		 * 
		 * 문제 1 : 이 값들의 개수를 구하는 코드를 작성하시오.
		 */
		{
			int count = 0;
			{
				// 코드를 작성하는 공간
				FileInputStream fis = new FileInputStream("res/data.txt");
				Scanner scan = new Scanner(fis);

				for (int i = 0; scan.hasNext(); i++) {
					scan.nextInt();
					count++;
				}
			}
			System.out.printf("count is %d\n", count);

			// 문제 2 : 이 값들 중에서 가장 큰 값이 무엇인지 출력하는 코드를 작성하시오.

			int max = -1;
			{
				FileInputStream fis = new FileInputStream("res/data.txt");
				Scanner scan = new Scanner(fis);

				max = scan.nextInt();
				for (int i = 0; scan.hasNext(); i++) {
					int num = scan.nextInt();
					if (max < num)
						max = num;
				}

			}
			System.out.printf("max is %d\n", max);
			// 문제 3 : 이 값들 중에 10 을 찾아서 그 위치(인덱스 값)을 출력하시오.

			int index = -1;
			{
				FileInputStream fis = new FileInputStream("res/data.txt");
				Scanner scan = new Scanner(fis);

				for (int i = 0; scan.hasNext(); i++) {
					int num = scan.nextInt();
					if (num == 10)
						index = i;
				}
			}
			System.out.printf("index is %d\n", index);

		} // 문제 1~3 off
		
		/*
		 * —----------------------------------------------------------------------------
		 * ---------------------------------- : 제어구조 + 배열
		 * —----------------------------------------------------------------------------
		 * 
		 * 문제 4 : 다음 각 절차를 따라 작성하시오.
		 */
		{
			// 1. nums라는 이름으로 정수 15개를 저장할 수 있는 배열 객체를 생성한다.
			int[] nums = new int[15];
			int size = 0;

			// 2. res/data.txt 파일에 저장된 값들을 nums 배열에 로드한다.
			{
				FileInputStream fis = new FileInputStream("res/data.txt");
				Scanner scan = new Scanner(fis);

				for (int i = 0; scan.hasNext(); i++) {
					nums[i] = scan.nextInt();
					size++;
				}

				// nums 출력
				for (int i = 0; i < size; i++)
					System.out.printf("%d ", nums[i]);

				System.out.println();
				System.out.println("로드 완료");
			}

			// 3. 0~14 범위의 랜덤값 2개를 얻어서 그 위치의 값을 서로 바꾼다. 그것을 50번 반복한다.
			System.out.println("---------------------------------------------------");
			{
				Random rand = new Random();
				
				int num1 = rand.nextInt(14);
				int num2 = rand.nextInt(14);
				
				System.out.printf("0~14범위 두 정수의 초기 값 : %d %d\n", num1, num2);
				for(int i=0; i<50; i++) {
					int temp = num1;
					num1 = num2;
					num2 = temp;
					System.out.printf("%d번 바꾸기 완료 : %d <-> %d\n", i+1, num1, num2);
				}

				System.out.println("저장 완료");
			}
			
			System.out.println("---------------------------------------------------");


			// 4. res/data-out.txt 파일로 배열의 값들을 저장
			{
				FileOutputStream fos = new FileOutputStream("res/data-out.txt");
				PrintWriter pw = new PrintWriter(fos, true, Charset.forName("UTF-8"));

				for (int i = 0; i < size; i++)
					pw.printf("%d ", nums[i]);

				pw.flush();

				pw.close();
				fos.close();

				System.out.println("저장 완료");
			}
		} // 문제 4 off

	} // main off

} // class off
