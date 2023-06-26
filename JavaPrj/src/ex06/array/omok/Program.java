package ex06.array.omok;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
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
		
		int width = 12;
		int height = 12;
		
		char[][] board = new char[height][width];
		
		for (int y = 0; y < height; y++) 
			for (int x = 0; x < width; x++) {
				board[y][x] = '┼';
				board[0][x] = '┬';
				board[height-1][x] = '┴';
				board[y][0] = '├';
				board[y][width-1] = '┤';
				board[0][0] = '┌';
				board[0][width-1] = '┐';
				board[height-1][0] = '└';
				board[height-1][width-1] = '┘';
			}
		
		while (true) {
			// 흑돌 입력
			boolean onDark = true;
			
			do {
				System.out.println("흑돌(범위 : 0~11) > ");
				oy = scan.nextInt();
				ox = scan.nextInt();

				if (board[oy][ox] == '백') 
					System.out.println("오목알의 위치가 겹칩니다. 다시 입력해주세요.");
				
				if ((oy < 0 || 11 < oy) || (ox < 0 || 11 < ox)) 
					System.out.println("값의 범위는 0~11사이로 입력바랍니다.");
				
				onDark = (board[oy][ox] == '백') || (oy < 0 || 11 < oy) || (ox < 0 || 11 < ox);
			} while (onDark);

			board[oy][ox] = '흑';

			// 흑돌 출력
			for (int y = 0; y < height; y++) {
				for (int x = 0; x < width; x++)
					System.out.printf("%c", board[y][x]);// [j][i]
				System.out.println();
			}
			boolean onWhite = true;
			
			// 백돌 입력
			do {
				System.out.println("백돌(범위 : 0~11) > ");
				oy = scan.nextInt();
				ox = scan.nextInt();

				if (board[oy][ox] == '흑') 
					System.out.println("오목알의 위치가 겹칩니다.");

				if ((oy < 0 || 11 < oy) || (ox < 0 || 11 < ox)) 
					System.out.println("값의 범위는 0~11사이로 입력바랍니다.");

				onWhite = (board[oy][ox] == '흑') || (oy < 0 || 11 < oy) || (ox < 0 || 11 < ox);
			} while (onWhite);

			board[oy][ox] = '백';

			// 백돌 출력
			for (int y = 0; y < height; y++) {
				for (int x = 0; x < width; x++)
					System.out.printf("%c", board[y][x]);// [j][i]
				System.out.println();
			}
		}
	}
}
