package ex09.struct;
// 매개 + 전역 

// 230628 index 값 공유 x
// 230629 객체 NumList를 이용하여 nums와 index 공유

public class CallByRefProgram2_0629 {

	public static void main(String[] args) {
		
		NumList numList = new NumList();

		// nums 배열 객체 생성
		numList.nums = createNums();
		numList.index = 0;

		// nums에 값 추가
		inputNums(numList);

		// nums 배열의 값 출력
		printNums(numList);
		
		System.out.println("작업 종료");
	}

	private static void printNums(NumList numList) {
		int size = numList.index;
		int[] nums = numList.nums;
		
		for (int i = 0; i < size; i++)
			System.out.printf("%d,", nums[i]);
	}

	private static void inputNums(NumList numList) {
		int index = numList.index;
		int[] nums = numList.nums;
		
		nums[index] = 20;
		index++;

		nums[index] = 30;
		index++;

		nums[index] = 90;
		index++;
		
		numList.index = index;
	}

	private static int[] createNums() {
		int[] nums = new int[10];
		
		return nums;
	}

}