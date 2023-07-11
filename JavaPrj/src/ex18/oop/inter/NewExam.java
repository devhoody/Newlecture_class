package ex18.oop.inter;
/*
 *  0710
 *	 추상화 커스텀 
 */

public class NewExam extends Exam {
	private int com;

	public NewExam() {
		this(0, 0, 0, 0);
	}

	public NewExam(int kor, int eng, int math, int com) {
		super(kor, eng, math);
		this.com = com;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	@Override
	public int total() {

		return super.total() + com;
	}

	@Override
	public float avg() {
		// TODO Auto-generated method stub
		return total() / 4.0f;
	}

}
