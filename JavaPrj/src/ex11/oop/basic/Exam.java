package ex11.oop.basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exam {
//	static int aa; // 전역변수 
	// 변수 은닉화
	private int kor; // 공간 x -> 설계도!!
	private int eng;
	private int math;

	int total;
	float avg;

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

		System.out.printf("kor:%d, eng:%d, math:%d\n", kor, eng, math);	

	}

	public static void input(Exam exam) {
		exam.kor = 30;
		exam.eng = 20;
		exam.math = 100;
	}

	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("kor:");
		kor = scan.nextInt();
		System.out.print("eng:");
		eng = scan.nextInt();
		System.out.print("math:");
		math = scan.nextInt();
		
		scan.close();
	}

	public int total() {
		total = kor + eng + math;
		return total;
	}

	public float avg() {
		avg = total / 3.0f;
		return avg;
	}

	public void save(String fileName) throws IOException {
		String path = "res/ex11/" + fileName;
		FileOutputStream fos = new FileOutputStream(path);
		PrintWriter pw = new PrintWriter(fos);

		pw.printf("%d,%d,%d\n", kor, eng, math);

		pw.flush();
		pw.close();
		fos.close();

	}

	public void load(String fileName) throws IOException {
		String path = "res/ex11/" + fileName;
		FileInputStream fis = new FileInputStream(path);
		Scanner scan = new Scanner(fis);

		String line = scan.nextLine();
		String[] line2 = line.split(",");

		kor = Integer.parseInt(line2[0]);
		eng = Integer.parseInt(line2[1]);
		math = Integer.parseInt(line2[2]);
		
		scan.close();
		fis.close();

	}

}
