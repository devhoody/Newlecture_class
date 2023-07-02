package ex09.struct;
// Exams 객체 배열과 Exam객체와의 관계 

// 230629
// 230630

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program_0629 {

	public static void main(String[] args) throws IOException {

		Exam[] exams = new Exam[20]; // exams[0],exams[1]... exams[19]까지의 20개 이름표생성
		int index = 0;

		{
			FileInputStream fis = new FileInputStream("res/ex09/exam.data");
			Scanner fscan = new Scanner(fis);

			fscan.nextLine(); // 맨 윗줄날리기

			while (fscan.hasNextLine()) // 마지막 줄까지 읽어오기
			{
				Exam exam = new Exam(); // Exam exam : 한번 만들어짐. while문 들어오기 전에 한번 생성
										// new Exam() : while 문 돌때마다 객체(공간)을 만들어 준다.

				String line = fscan.nextLine();
				String[] tokens = line.split(",");

				exam.kor = Integer.parseInt(tokens[0]);
				exam.eng = Integer.parseInt(tokens[1]);
				exam.math = Integer.parseInt(tokens[2]);
				exam.total = exam.kor + exam.eng + exam.math;
				exam.avg = exam.total / 3.0f;

				exams[index] = exam; // 만든 공간에 exams[index]의 이름표 붙여준다. 참조 변수를 exams[]로대입
				index++;
			}

			fscan.close();
			fis.close();

		}
		// 출력
		{
			// 첫 번째 학생 성적이 두 번째 학생의 성적보다 크다면 바꿔서 출력 .
			if (exams[0].total > exams[1].total) {
				Exam temp = exams[0];
				exams[0] = exams[1];
				exams[1] = temp;
			}

			int size = index;

			// exam[] -> exam 객체 변환 후 출력 .
			for (int i = 0; i < size; i++) {
				Exam exam = exams[i];
				int kor = exam.kor;
				int eng = exam.eng;
				int math = exam.math;

				int total = kor + eng + math;
				float avg = total / 3.0f;

				System.out.printf("%d \t %d \t %d \t %d \t %.2f \n", kor, eng, math, total, avg);
			}

		}

	} // main off

} // class off
