package ex18.oop.inter;
/*
 *  0711
 *	 인터페이스 
 */

public class NewExam extends Exam implements PrintListener {
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

	@Override
	public void printBanner() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printEx() {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void printBanner() {
//		System.out.println("뉴렉고등학교 성적표");
//
//		
//	}
//
//	@Override
//	public void printEx() {
//		System.out.printf("com:%d\n", com);
//		
//	}

}
