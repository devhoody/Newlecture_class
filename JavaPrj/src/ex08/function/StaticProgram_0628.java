package ex08.function;
// 전역변수 개념 
// 230628

public class StaticProgram_0628 {

	public static void main(String[] args) {
		
		//count 구하는 코드 
		int count = 0;
		{
			count = 39;
		}
		
		//count 출력 코드 
		{
			System.out.printf("count is %d\n", count);
		}
	}
}
