package ex15.oop.isa;
/*
 *  0706 
 *	 is a 상속 NewExam -> Exam
 */

public class NewExam extends Exam{
	private int com;

	public NewExam() {
		this(0,0,0,0);
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

		return super.total()+com;
	}
	
}
