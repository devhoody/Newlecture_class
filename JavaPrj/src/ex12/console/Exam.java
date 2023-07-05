package ex12.console;

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

	public int total() {
		return kor + eng + math;
	}

	public float avg() {
		return kor + eng + math / 3.0f;
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

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

}
