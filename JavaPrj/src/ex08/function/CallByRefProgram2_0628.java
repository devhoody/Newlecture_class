package ex08.function;
// 매개 + 전역 

// 230628

public class CallByRefProgram2_0628 {

	public static void main(String[] args) {
		// nums 배열 객체 생성
		int[] nums = createNums();
		int index = 0;

		// nums에 값 추가
		inputNums(nums, index);

		// nums 배열의 값 출력
		printNums(nums, index);
	}

	private static void printNums(int[] nums, int size) {

		for (int i = 0; i < size; i++)
			System.out.printf("%d,", nums[i]);
	}

	private static void inputNums(int[] nums, int index) {

		nums[index] = 20;
		index++;

		nums[index] = 30;
		index++;

		nums[index] = 90;
		index++;

	}

	private static int[] createNums() {

		return new int[10];
	}

}