package ex18.oop.inter;
/*
 * 0711
 * 인터페이스
 */

import java.util.Scanner;

public class ExamConsole {

	private Exam exam; // = new Exam(); // has a 상속관계 : A가 B를 갖고있다.

	private PrintListener printListener;

	public void setPrintListener(PrintListener printListener) {
		this.printListener = printListener;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public Exam getExam() {
		return exam;
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

		scan.close();

		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
	}

	public void print() {
		
		if(printListener != null)
			printListener.printBanner();

		int kor = exam.getKor();
		int eng = exam.getEng();
		int math = exam.getMath();

		System.out.printf("kor:%d\n", kor);
		System.out.printf("eng:%d\n", eng);
		System.out.printf("math:%d\n", math);

		if(printListener != null)
			printListener.printEx();

	}

//	protected void printBanner() {
//		System.out.println("┌────────────┐");
//		System.out.println("│      성적출력         │");
//		System.out.println("└────────────┘");
//	}

//	protected abstract void printEx();

}