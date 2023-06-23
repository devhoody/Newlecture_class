package ex06.array.omok;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ┌┬┬┬┬┬┬┬┬┬┬┐ 
		 * ├┼┼┼┼┼┼┼┼┼┼┤ 
		 * ├┼┼┼┼┼┼┼┼┼┼┤ 
		 * ├┼┼┼┼┼┼┼┼┼┼┤ 
		 * ├┼┼┼┼┼┼┼┼┼┼┤ 
		 * ├┼┼┼┼┼┼┼┼┼┼┤
		 * ├┼┼┼┼┼┼┼┼┼┼┤ 
		 * ├┼┼┼┼┼┼┼┼┼┼┤ 
		 * ├┼┼┼┼┼┼┼┼┼┼┤ 
		 * ├┼┼┼┼┼┼┼┼┼┼┤ 
		 * ├┼┼┼┼┼┼┼┼┼┼┤ 
		 * └┴┴┴┴┴┴┴┴┴┴┘
		 */
		Scanner scan = new Scanner(System.in);

//		int[] oxes = new int[10];
//		int[] oyes = new int[10];

		int ox = 0;
		int oy = 0;

		char[][] board = new char[12][12];

		for (int y = 0; y < 12; y++) {
			for (int x = 0; x < 12; x++) {
				board[y][x] = '┼';
				if (y == 0 && x ==0)
					board[y][x] = '┌';
				else if (y == 0 && x == 11)
					board[y][x] = '┐';
				else if (y == 0 )
					board[y][x] = '┬';
				else if (y == 11 && x == 0)
					board[y][x] = '└';
				else if (y == 11 && x == 11)
					board[y][x] = '┘';
				else if (x == 0)
					board[y][x] = '├';
				else if (x == 11)
					board[y][x] = '┤';
				else if (y == 11)
					board[y][x] = '┴';
			}
		}

		while (true) {
			// 흑돌 입력
			do {
				System.out.println("흑돌 > ");
				oy = scan.nextInt();
				ox = scan.nextInt();

				if (board[oy][ox] == '백') {
					System.out.println("오목알의 위치가 겹칩니다.");
				}
				if ((oy < 0 || 11 < oy) || (ox < 0 || 11 < ox)) {
					System.out.println("값의 범위는 0~11사이로 입력바랍니다.");
				}

			} while ((board[oy][ox] == '백') || (oy < 0 || 11 < oy) || (ox < 0 || 11 < ox));

			board[oy][ox] = '흑';

			// 흑돌 출력
			for (int y = 0; y < 12; y++) {
				for (int x = 0; x < 12; x++)
					System.out.printf("%c", board[y][x]);// [j][i]
				System.out.println();
			}

			// 백돌 입력
			do {
				System.out.println("백돌 > ");
				oy = scan.nextInt();
				ox = scan.nextInt();

				if (board[oy][ox] == '흑') {
					System.out.println("오목알의 위치가 겹칩니다.");
				}

				if ((oy < 0 || 11 < oy) || (ox < 0 || 11 < ox)) {
					System.out.println("값의 범위는 0~11사이로 입력바랍니다.");
				}
			} while ((board[oy][ox] == '흑') || (oy < 0 || 11 < oy) || (ox < 0 || 11 < ox));

			board[oy][ox] = '백';

			// 백돌 출력
			for (int y = 0; y < 12; y++) {
				for (int x = 0; x < 12; x++)
					System.out.printf("%c", board[y][x]);// [j][i]
				System.out.println();
			}
		}
	}
}
