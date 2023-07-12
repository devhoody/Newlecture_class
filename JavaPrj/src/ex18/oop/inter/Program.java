package ex18.oop.inter;
/*
 * 0711
 * 인터페이스  
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {

	public static void main(String[] args) throws IOException {

		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(6);
		list.add(1);
		list.add(12);
		list.add(25);

		System.out.println(list);

//		list.sort(new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				// TODO Auto-generated method stub
//				return o1-o2;
//			}
//			
//		});

		list.sort((x, y) -> x - y);

		System.out.println(list);

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

//		PrintListener printListener = new PrintListener() {
//
//			@Override
//			public void printBanner() {
//				System.out.println("뉴렉고등학교 성적표!");
//			}
//
//			@Override
//			public void printEx() {
//				NewExam exam1 = (NewExam)exam;
//				System.out.printf("com:%d\n", exam1.getCom());
//			}
//			
//		};
//		
		ExPrinter exPrinter = new ExPrinter() {

			@Override
			public void printEx() {
				NewExam exam1 = (NewExam) exam;
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
		// Arrow Function, Lamda Expression
		BannerPrinter bannerPrinter = () -> {
			System.out.println("뉴렉고등학교 성적표!!");
		};

		console.setBannerPrinter(() -> {
			System.out.println("뉴렉고등학교 성적표!!");
		});

	}
}