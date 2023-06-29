package ex09.struct;
// Exams 객체 배열과 Exam객체와의 관계 

// 230629

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program_0629 {

	public static void main(String[] args) throws IOException {

		Exam_0629[] exams = new Exam_0629[20]; // exams[0],exams[1]... exams[19]까지의 20개 이름표생성
		int index = 0;
		{
			FileInputStream fis = new FileInputStream("res/ex09/exam.data");
			Scanner fscan = new Scanner(fis);

			fscan.nextLine(); // 맨 윗줄날리기

			while (fscan.hasNextLine()) // 마지막 줄까지 읽어오기
			{
				Exam_0629 exam = new Exam_0629(); // Exam exam : 한번 만들어짐. while문 들어오기 전에 한번 생성
													// new Exam() : while 문 돌때마다 객체(공간)을 만들어 준다.

				String line = fscan.nextLine();
				String[] tokens = line.split(",");

				exam.kor = Integer.parseInt(tokens[0]);
				exam.eng = Integer.parseInt(tokens[1]);
				exam.math = Integer.parseInt(tokens[2]);

				exams[index] = exam; // 만든 공간에 exams[index]의 이름표 붙여준다. 참조 변수를 exams[]로대입
				index++;
			}

			fscan.close();
			fis.close();

		}
		// 출력
		{
			int size = index;

			// exam, kor ,eng, math변수를 선언하여 print문의 가시성을 높인다.
			for (int i = 0; i < size; i++) {
				Exam_0629 exam = exams[i];

				int kor = exam.kor;
				int eng = exam.eng;
				int math = exam.math;

				System.out.printf("%d %d %d \n", kor, eng, math);
			}

		}

	} // main off

} // class off
