package ex08.function;
// 전역변수 개념 
// 230628

public class StaticProgram2_0628 {

//	static int count = 0;
	
	public static void main(String[] args) {
		
		//count 구하는 코드 
		int count = getCount();
		
		//count 출력 코드 
		printCount(count);
	}

	private static void printCount(int count) {
		System.out.printf("count is %d\n", count);
	}

	private static int getCount() {
		return 39;
	}

}
