package ex15.oop.isa;
/*
 *  0706 
 *	 is a 상속 NewExam -> Exam
 */

public class NewExam extends Exam{
	private int com;

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}
	
	public int total() {
		int total = super.total()+ com;
		return total;
	}
}
