package ex08.function;
// 매개 + 전역

// 230628

public class CallByRefProgram_0628 {

	public static void main(String[] args) {
		// nums 배열 객체 생성
		int[] nums = null;
		{
			nums = new int[10];
		}

		// nums에 값 추가
		int index = 0;
		{
			nums[index] = 20;
			index++;

			nums[index] = 30;
			index++;
		}

		// nums 배열의 값 출력
		{
			for (int i = 0; i < index; i++)
				System.out.printf("%d,", nums[i]);
		}
	}

}