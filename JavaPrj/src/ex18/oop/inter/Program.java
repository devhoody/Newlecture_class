package ex18.oop.inter;
/*
 * 0711
 * 인터페이스  
 */

import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {

		Exam exam = new NewExam(1, 2, 3, 4);

		ExamConsole console = new ExamConsole();
//		PrintListener printListener = new PrintListenerImp();
//		PrintListener printListener = (PrintListener) exam;

//		console.setPrintListener(exam);

//		class AA implements PrintListener {
//
//			@Override
//			public void printBanner() {
//				System.out.println("뉴렉고등학교 성적표");
//				
//			}
//
//			@Override
//			public void printEx() {
//				NewExam exam1 = (NewExam)exam;
//				System.out.printf("com:%d\n", exam1.getCom());
//				
//			}
//			
//		}

		PrintListener printListener = new PrintListener() {

			@Override
			public void printBanner() {
				System.out.println("뉴렉고등학교 성적표!");
			}

			@Override
			public void printEx() {
				NewExam exam1 = (NewExam)exam;
				System.out.printf("com:%d\n", exam1.getCom());
			}
			
		};
		
		ExPrinter exPrinter = new ExPrinter() {

			@Override
			public void printEx() {
				NewExam exam1 = (NewExam)exam;
				System.out.printf("com11:%d\n", exam1.getCom());
			}
			
		};

//		console.setPrintListener(new PrintListener() {
//
//			@Override
//			public void printBanner() {
//				System.out.println("뉴렉고등학교 성적표!!");
//
//			}
//
//			@Override
//			public void printEx() {
//				NewExam exam1 = (NewExam) exam;
//				System.out.printf("com:%d\n", exam1.getCom());
//			}
//
//		});
//		
		console.setExPrinter(printListener);
		console.setExPrinter(exPrinter);
		console.setExam(exam);
		console.print();

	}

}
