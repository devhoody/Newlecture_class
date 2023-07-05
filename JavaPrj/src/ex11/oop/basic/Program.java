package ex11.oop.basic;

import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {

		Exam exam = new Exam();

		exam.input();
		
		int total = exam.total();
		float avg = exam.avg();
		exam.save("exam.data");
		exam.load("exam.data");
		
		exam.print();
		
		
		
//		System.out.println(exam.kor);
	}

}
