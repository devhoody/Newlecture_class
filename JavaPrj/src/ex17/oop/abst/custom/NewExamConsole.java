package ex17.oop.abst.custom;

public class NewExamConsole extends ExamConsole {

	@Override
	protected void printBanner() {
		System.out.println("┌────────────┐");
		System.out.println("│      뉴렉고 성적출력         │");
		System.out.println("└────────────┘");
	}

	@Override
	protected void printEx() {
		NewExam exam = (NewExam) this.getExam();

		System.out.printf("com:%d\n", exam.getCom());
	}

}
