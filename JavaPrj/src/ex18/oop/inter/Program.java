package ex18.oop.inter;
/*
 * 0711
 * 인터페이스  
 */

import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {

		Exam exam = new NewExam(1, 2, 3, 4);
		ExamConsole console = new NewExamConsole();
		console.setExam(exam);
		console.print();

		console.printEx();
		

	}

}
