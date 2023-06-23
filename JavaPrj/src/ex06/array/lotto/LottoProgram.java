package ex06.array.lotto;

import java.util.Random;

public class LottoProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto = new int[6];
		int size = 0;
		Random rand = new Random();

		// 1. lotto 배열을 랜덤한 값들로 채우고
		for (int i = 0; i < 6; i++) {
			size++;
			lotto[i] = rand.nextInt(45) + 1;
			System.out.printf("%d ", lotto[i]);
		}
		System.out.println();

		// 2. 정렬을 한 후에
		for (int j = 0; j < size - 1; j++)
			for (int i = 0; i < size - 1 - j; i++)
				if (lotto[i] > lotto[i + 1]) {
					int temp = lotto[i];
					lotto[i] = lotto[i + 1];
					lotto[i + 1] = temp;
				}
		
		// 3. lotto 배열의 값들을 출력하시오.
		// 단 출력 포맷은 예를 들어 3,4,21,24,30,42 처럼 출력되도록 한다 마지막 숫자에는 쉼표(,)가 없어야 한다.
		for (int i = 0; i < size; i++) {
			System.out.printf("%d", lotto[i]);
			if (i < size - 1)
				System.out.print(",");
		}

	}

}
