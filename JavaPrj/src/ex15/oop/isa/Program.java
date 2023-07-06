package ex15.oop.isa;
/*
 * 230706
 */

import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {
		
		NewExam exam = new NewExam();
		
		exam.setKor(10);
		exam.setEng(20);
		exam.setMath(30);
		exam.setCom(40);
		
		int total = exam.total();
		
		System.out.printf("total is %d\n", total);
		
//		console.input(); 
//		console.input();
//		console.input(); 
//		
////		console.print(2);
//		console.printAll();
		
	}

}
