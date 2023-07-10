package ex17.oop.abst.custom;
/*
 * 0710
 * 인터페이스 
 */

import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {

		Exam[] exams = new Exam[3];

		exams[0] = new NewExam(1, 2, 3, 4);
		float avg = exams[0].avg();
		int total = exams[0].total();

		System.out.println(avg);
		System.out.println(total);

	}

}
