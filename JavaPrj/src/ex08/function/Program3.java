package ex08.function;

public class Program3 {

	public static void main(String[] args) {
		
		// 배열 초기화  -> lottos 배열 생성
		// createLottos;
		int[][] lottos = new int[][] { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 } };

		// 배열 초기화값 출력 -> lottos 배열을 출력한다. 
		// printLottos
		for (int j = 0; j < 3; j++)
			for (int i = 0; i < 6; i++)
				System.out.printf("%d,", lottos[j][i]);
		System.out.println();
		
		// 1차 배열 순서 바꾸기 -> lottos의 첫번째 lotto와 세번째 lotto의 순서를 바꾼다. 
		// swapLotto;
		System.out.println("--------------------- 0 <-> 2 위치 변경 ----------------");
		int[] temp = lottos[0]; // 1차 배열 = 1차 배열
		lottos[0] = lottos[2]; // 1차 배열 = 1차 배열
		lottos[2] = temp; // 1차 배열 = 1차 배열


		// 순서가 바뀐 배열 출력  -> lottos 배열을 출력한다. 
		// printLottos
		for (int j = 0; j < 3; j++) 
			for (int i = 0; i < 6; i++)
				System.out.printf("%d,", lottos[j][i]);
		System.out.println();

	}

}
