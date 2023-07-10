package ex17.oop.abst.custom;
/*
 * 0710
 * 추상화 커스텀  
 */

import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {

		Exam exam = new NewExam(1, 2, 3, 4);
		ExamConsole console = new NewExamConsole();
		console.setExam(exam);
		console.print();

	}

}
