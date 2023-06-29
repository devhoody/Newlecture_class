package com.NewlecMentoring;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExamProgram_230622 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);

		Exam[] exams = new Exam[3];

		while (true) {

			PrintMenu();

			int menu = scan.nextInt();

			switch (menu) {

			case 1:
				// 1. 성적입력
				InputExam(exams);
				break;

			case 2:
				// 2. 성적 출력
				PrintExam(exams);
				break;

			case 3:
				// 3. 성적 불러오기
				RoadExam(exams);
				break;

			case 4:
				// 4. 성적 저장 하기
				SaveExam(exams);
				break;

			case 9:
				// 9. 프로그램 종료
				System.out.println("프로그램을 종료합니다");
				return;

			default:
				System.out.println("menu 입력은 1~4 또는 9 이어야 합니다.");
				break;

			} // switch off
		} // while off
	}

	private static void SaveExam(Exam[] exams) throws IOException {
		System.out.print("┌───────────────────────────────────────┐\n");
		System.out.print("                 성적을 저장합니다.                 \n");
		System.out.print("└───────────────────────────────────────┘\n");

		FileOutputStream fos = new FileOutputStream("res/exam.txt");
		PrintWriter pw = new PrintWriter(fos);

		System.out.printf("국어 : %d 수학 : %d 영어 : %d", exams[0].kor, exams[0].math, exams[0].eng);
		pw.printf("%d ", exams[0].kor);
		pw.printf("%d ", exams[0].math);
		pw.printf("%d", exams[0].eng);

		System.out.println();

		pw.flush();

		pw.close();
		fos.close();
		System.out.print("┌───────────────────────────────────────┐\n");
		System.out.print("                 성적을 저장했습니다.                 \n");
		System.out.print("└───────────────────────────────────────┘\n");
		System.out.println();
	}

	private static void RoadExam(Exam[] exams) throws IOException {
		System.out.print("┌───────────────────────────────────────┐\n");
		System.out.print("                 성적을 불러옵니다.                 \n");
		System.out.print("└───────────────────────────────────────┘\n");
		FileInputStream fis = new FileInputStream("res/exam.txt");
		Scanner fscan = new Scanner(fis);

		Exam exam = new Exam();

		exam.kor = fscan.nextInt();
		exam.math = fscan.nextInt();
		exam.eng = fscan.nextInt();

		System.out.printf("국어 : %d ", exam.kor);
		System.out.printf("수학 : %d ", exam.math);
		System.out.printf("영어 : %d ", exam.eng);

		System.out.println();
		System.out.println();

		exams[0] = exam;

	}

	private static void PrintExam(Exam[] exams) {
		System.out.print("┌───────────────────────────────────────┐\n");
		System.out.print("                 성적출력                 \n");
		System.out.print("└───────────────────────────────────────┘\n");

		System.out.printf("국어 : %d ", exams[0].kor);
		System.out.printf("수학 : %d ", exams[0].math);
		System.out.printf("영어 : %d %n", exams[0].eng);

		System.out.println();
		System.out.println();

	}

	private static void InputExam(Exam[] exams) {
		Scanner scan = new Scanner(System.in);

		boolean onKor = false;
		boolean onMath = false;
		boolean onEng = false;
		boolean onScores = false;

		Exam exam = new Exam();

		do {
			System.out.print("┌───────────────────────────────────────┐\n");
			System.out.print("                 성적입력                 \n");
			System.out.print("└───────────────────────────────────────┘\n");

			System.out.println("국어 성적을 입력하세요.");
			System.out.println("수학 성적을 입력하세요.");
			System.out.println("영어 성적을 입력하세요.");

			exam.kor = scan.nextInt();
			exam.math = scan.nextInt();
			exam.eng = scan.nextInt();

			onKor = (exam.kor < 0 || 100 < exam.kor);
			onMath = (exam.math < 0 || 100 < exam.math);
			onEng = (exam.eng < 0 || 100 < exam.eng);

			onScores = (onKor || onMath || onEng);

			if (onScores)
				System.out.println("성적의 범위(0~100)을 벗어났습니다");

		} while (onScores);
		exams[0] = exam;
	}

	private static void PrintMenu() {
		Scanner scan = new Scanner(System.in);

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

	}

}
