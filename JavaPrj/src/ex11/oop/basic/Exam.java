package ex11.oop.basic;

public class Exam {
//	static int aa; // 전역변수 
	int kor; // 공간 x -> 설계도!!
	int eng;
	int math;

	public Exam() {
		kor = 10;
		eng = 100;
		math = 100;
	}

	public void print() {

		System.out.println(kor);

	}

	public static void input(Exam exam) {
		exam.kor = 30;
		exam.eng = 20;
		exam.math = 100;
	}

	public void input() {
		int kor = 0;
		kor = 30;
		eng = 20;
		math = 100;
	}

}
