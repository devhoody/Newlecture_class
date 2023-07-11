package ex18.oop.inter;
/*
 *  0711
 *	 인터페이스 
 */

public class PrintListenerImp implements PrintListener {

	@Override
	public void printBanner() {
		System.out.println("뉴렉고등학교 성적표");

	}

	@Override
	public void printEx() {
		System.out.println("com");

	}

}
