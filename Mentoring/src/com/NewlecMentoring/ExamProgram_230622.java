package com.NewlecMentoring;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExamProgram_230622 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		
		int kor =0;
		int math = 0;
		int eng = 0;
		int[] scores = {kor, math, eng};
		int size = scores.length;
		
		while(true) 
		{
			
		System.out.print("┌───────────────────────────────────────┐\n");
		System.out.print("                 메인 메뉴                 \n");
		System.out.print("└───────────────────────────────────────┘\n");
		
		System.out.print("1. 성적 입력        ");
		System.out.print("2. 성적 출력        ");
		System.out.print("3. 성적 불러오기        ");
		System.out.print("4. 성적 저장하기        ");
		System.out.print("9. 프로그램 종료        \n");
		System.out.print("선택 > ");
		System.out.println();
		
		
		int menu = scan.nextInt();
			
			switch(menu) {
			
			case 1:
				//1. 성적입력 
				{
					boolean onKor = false;
					boolean onMath = false;
					boolean onEng = false;
					boolean onScores = false;
					
					do
						{
						System.out.print("┌───────────────────────────────────────┐\n");
						System.out.print("                 성적입력                 \n");
						System.out.print("└───────────────────────────────────────┘\n");
						
						System.out.println("국어 성적을 입력하세요.");
						System.out.println("수학 성적을 입력하세요.");
						System.out.println("영어 성적을 입력하세요.");
//						for(int i=0; i<size; i++) {
//							scores[i] = scan.nextInt();
//							onScores[i] = (scores[i]<0 || 100 < scores[i]);
//						}
						
						kor = scan.nextInt();
						math = scan.nextInt();
						eng = scan.nextInt();
						
						onKor = (kor<0 || 100<kor);
						onMath = (math<0 || 100<math);
						onEng = (eng<0 || 100<eng);
						
						onScores = (onKor || onMath || onEng);
						
						if(onScores)
							System.out.println("성적의 범위(0~100)을 벗어났습니다");
						
						} while(onScores);
					break;
				}
			
			case 2:
				// 2. 성적 출력 
				{
					System.out.print("┌───────────────────────────────────────┐\n");
					System.out.print("                 성적출력                 \n");
					System.out.print("└───────────────────────────────────────┘\n");
					
					System.out.printf("국어 : %d ", kor);
					System.out.printf("수학 : %d ", math);
					System.out.printf("영어 : %d ", eng);
					System.out.println();
					System.out.println();

					break;
				}
			
			case 3:
				// 3. 성적 불러오기
				{
					System.out.print("┌───────────────────────────────────────┐\n");
					System.out.print("                 성적을 불러옵니다.                 \n");
					System.out.print("└───────────────────────────────────────┘\n");
					FileInputStream fis = new FileInputStream("res/exam.txt");
					Scanner fscan = new Scanner(fis);
					
					kor = fscan.nextInt();
					math = fscan.nextInt();
					eng = fscan.nextInt();
					
					System.out.printf("국어 : %d ", kor);
					System.out.printf("수학 : %d ", math);
					System.out.printf("영어 : %d ", eng);
					
					System.out.println();
					System.out.println();

					break;
				}
			
			case 4:
				// 4. 성적 저장 하기 
				{
					System.out.print("┌───────────────────────────────────────┐\n");
					System.out.print("                 성적을 저장합니다.                 \n");
					System.out.print("└───────────────────────────────────────┘\n");
					
					FileOutputStream fos = new FileOutputStream("res/exam.txt");
					PrintWriter pw = new PrintWriter(fos);
					
					System.out.printf("국어 : %d 수학 : %d 영어 : %d", kor, math, eng);
					pw.printf("%d ", kor);
					pw.printf("%d ", math);
					pw.printf("%d ", eng);
					
					System.out.println();
					
					pw.flush();
					
					pw.close();
					fos.close();
					System.out.print("┌───────────────────────────────────────┐\n");
					System.out.print("                 성적을 저장했습니다.                 \n");
					System.out.print("└───────────────────────────────────────┘\n");
					System.out.println();
					
					break;
				}
				
			case 9:
				// 9. 프로그램 종료 
				{
					System.out.println("프로그램을 종료합니다");
					return;
				}
			}
				
		} // while off
		
	}

}
