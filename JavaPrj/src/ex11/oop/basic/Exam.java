package ex11.oop.basic;

public class Exam {
//	static int aa; // 전역변수 
	// 변수 은닉화
	private int kor; // 공간 x -> 설계도!!
	private int eng;
	private int math;

	// 기본 생성자
	public Exam() {
		this(3, 4, 5);
	}

	// 생성자 오버로드
	public Exam(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
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
