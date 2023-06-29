package ex08.function;

public class Program2 {

	static int[][] createLottos() {

		return new int[][] { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 } };
	}

	static void printLottos(int[][] lottos) {
		for (int j = 0; j < 3; j++)
			for (int i = 0; i < 6; i++)
				System.out.printf("%d,", lottos[j][i]);
		System.out.println();
	}

	static void swapLotto(int[][] lottos, int si, int di) {
		int[] temp = lottos[si];
		lottos[si] = lottos[di];
		lottos[di] = temp;
	}

	public static void main(String[] args) {

		int[][] lottos = createLottos();
		
		printLottos(lottos);

		swapLotto(lottos, 0, 2);

		printLottos(lottos);

	}

}
