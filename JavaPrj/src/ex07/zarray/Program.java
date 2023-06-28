package ex07.zarray;

public class Program {

	public static void main(String[] args) {
		int[][] lottos = new int[][] { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 } };

		for (int j = 0; j < 3; j++)
			for (int i = 0; i < 6; i++)
				System.out.printf("%d,", lottos[j][i]);

		System.out.println();

		// [0] <-> [2]
		System.out.println("--------------------- 0 <-> 2 위치 변경 ----------------");
		int[] temp = lottos[0]; // 1차 배열 = 1차 배열
		lottos[0] = lottos[2]; // 1차 배열 = 1차 배열
		lottos[2] = temp; // 1차 배열 = 1차 배열

		// lottos[1] = new int[] { 9, 9, 99, 99, 9, 9, 9, 9, 1 }; // 초기화x , 새로운 배열을 만들때.

		for (int j = 0; j < 3; j++)
			for (int i = 0; i < 6; i++)
				System.out.printf("%d,", lottos[j][i]);

		System.out.println();

	}

}
