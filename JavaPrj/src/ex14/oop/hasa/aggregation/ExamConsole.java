package ex14.oop.hasa.aggregation;

import java.util.Scanner;

public class ExamConsole {

	private Exam[] exams; // = new Exam(); // has a 상속관계 : A가 B를 갖고있다.
	private int index;

	public ExamConsole() {
		int max = 3;
		exams = new Exam[max];
		index = 0;
	}

	public void input() {
		Scanner scan = new Scanner(System.in);
		int kor;
		int eng;
		int math;
		
		System.out.print("kor:");
		kor = scan.nextInt();
		System.out.print("eng:");
		eng = scan.nextInt();
		System.out.print("math:");
		math = scan.nextInt();
		
		Exam exam = new Exam();
		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
		
		exams[index++] = exam;
	}

	public void print(int i) {
		Exam exam = exams[i];

		int kor = exam.getKor();
		int eng = exam.getEng();
		int math = exam.getMath();

		System.out.printf("kor:%d, eng:%d, math:%d\n", kor, eng, math);

	}
	
	// print 오버로드 
	public void printAll() {
		int size = index;
		for(int i=0; i<size; i++) {
			print(i);
		}
	}
}