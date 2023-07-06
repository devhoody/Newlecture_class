package ex13.oop.hasa.association;

import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {
		Exam exam = new Exam();
		ExamConsole console = new ExamConsole();

		console.setExam(exam);
		
		console.input();
		console.print();
		
		
		
//		System.out.println(exam.kor);
	}

}
