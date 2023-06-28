package ex06.array.omok;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) throws IOException {
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

		int width = 12;
		int height = 12;
		int count = 1;

		char[][] board = new char[height][width];
		int[][] omokMap = new int[height - 2][width - 2];

		while (true) {
			Scanner scan = new Scanner(System.in);

			int menu = inputMainMenu();

			switch (menu) {

			case 1:

				// 게임시작
				startGame(board, height, width, count);

				// 2. 도움말
			case 2:
				System.out.println("도움말");
				break;

			// 3. 저장하기
			case 3:
				saveGame(board, omokMap, count, height, width);
				// 흑 :2 백 1: 나머지 : 0 변환

				break;

			// 4. 불러오기
			case 4:
				roadGame(board, omokMap, count, height, width);
				break;
			// 5. 종료
			case 5:
				System.out.println("종료");
				return;

			default:
				System.out.println("입력 값은 1~5안으로 입력해주세요.");

			} // switch off
		} // while off
	} // main off

	private static void roadGame(char[][] board, int[][] omokMap, int count, int height, int width) throws IOException {
		FileInputStream fis = new FileInputStream("res/omok.map");
		Scanner fscan = new Scanner(fis);

		for (int y = 0; y < height - 2; y++) {
			for (int x = 0; x < width - 2; x++)
				omokMap[y][x] = fscan.nextInt();
		}

		count = fscan.nextInt(); // 흑돌, 백돌 구분.

		for (int y = 0; y < height - 2; y++)
			for (int x = 0; x < width - 2; x++) {
				if (omokMap[y][x] == 2)
					board[y + 1][x + 1] = '●';
				else if (omokMap[y][x] == 1)
					board[y + 1][x + 1] = '○';
				else
					board[y + 1][x + 1] = '┼';
			}

		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++)
				System.out.printf("%c", board[y][x]);// [j][i]
			System.out.println();
		}

		fscan.close();
		fis.close();

		System.out.println("┌────────────────┐");
		System.out.println("│      정상적으로 불러왔습니다.       │");
		System.out.println("└────────────────┘");
		System.out.println();

	}

	private static void saveGame(char[][] board, int[][] omokMap, int count, int height, int width) throws IOException {
		for (int y = 0; y < height - 2; y++)
			for (int x = 0; x < width - 2; x++) {
				if (board[y + 1][x + 1] == '●')
					omokMap[y][x] = 2;
				else if (board[y + 1][x + 1] == '○')
					omokMap[y][x] = 1;
				else
					omokMap[y][x] = 0;
			}

		// 변환된 값을 omok.map에 저장
		FileOutputStream fos = new FileOutputStream("res/omok.map");
		PrintWriter pw = new PrintWriter(fos, true, Charset.forName("UTF-8"));

		for (int y = 0; y < height - 2; y++) {
			for (int x = 0; x < height - 2; x++) {
				pw.printf("%d ", omokMap[y][x]);
			}
			pw.println();
		}
		pw.println(count);

		pw.close();
		fos.close();
		System.out.println("┌────────────────┐");
		System.out.println("│      정상적으로 저장했습니다.       │");
		System.out.println("└────────────────┘");
		System.out.println();

	}

	static void startGame(char[][] board, int width, int height, int count) {
		Scanner scan = new Scanner(System.in);

		int ox = 0;
		int oy = 0;

		// 오목판 초기화
		for (int y = 0; y < height; y++)
			for (int x = 0; x < width; x++) {
				board[y][x] = '┼';
				board[0][x] = '┬';
				board[height - 1][x] = '┴';
				board[y][0] = '├';
				board[y][width - 1] = '┤';
				board[0][0] = '┌';
				board[0][width - 1] = '┐';
				board[height - 1][0] = '└';
				board[height - 1][width - 1] = '┘';

			}

		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++)
				System.out.printf("%c", board[y][x]);// [j][i]
			System.out.println();
		}

		// 차례 알려주기
		if (count % 2 == 1)
			System.out.println("흑돌차례입니다.");
		else
			System.out.println("백돌차례입니다.");

		GAME: while (true) {
			// 흑돌 입력
			Black: {
				do {
					if (count % 2 == 0)
						break Black;

					System.out.println("그만두기 : -1 0");
					System.out.println("흑돌(범위 : 1~10) > ");

					oy = scan.nextInt();
					ox = scan.nextInt();

					if (oy == -1 && ox == 0) {
						System.out.println("게임이 종료되었습니다. ");
						break GAME;
					} else if ((oy < 1 || 10 < oy) || (ox < 1 || 10 < ox)) {
						System.out.println("값의 범위는 1~10사이로 입력바랍니다.");
						continue;
					} else if (board[oy][ox] == '○' || board[oy][ox] == '●') {
						System.out.println("오목알의 위치가 겹칩니다.");
						continue;
					}

				} while (board[oy][ox] == '○' || (oy < 1 || 10 < oy) || (ox < 1 || 10 < ox));

				if (count % 2 == 1)
					board[oy][ox] = '●';
				else
					board[oy][ox] = '○';
				count++;

				// 흑돌 출력
				for (int y = 0; y < height; y++) {
					for (int x = 0; x < width; x++)
						System.out.printf("%c", board[y][x]);// [j][i]
					System.out.println();
				}

				break Black;
			}

			// 백돌 입력
			White: {
				do {
					if (count % 2 == 1)
						break White;

					System.out.println("그만두기 : -1 0");
					System.out.println("백돌(범위 : 0~11) > ");
					oy = scan.nextInt();
					ox = scan.nextInt();

					if (oy == -1 && ox == 0) {
						System.out.println("게임이 종료되었습니다. ");
						break GAME;
					} else if ((oy < 1 || 10 < oy) || (ox < 1 || 10 < ox)) {
						System.out.println("값의 범위는 1~10사이로 입력바랍니다.");
						continue;
					} else if (board[oy][ox] == '●' || board[oy][ox] == '○') {
						System.out.println("오목알의 위치가 겹칩니다.");
						continue;
					}

				} while (board[oy][ox] == '●' || (oy < 1 || 10 < oy) || (ox < 1 || 10 < ox));

				board[oy][ox] = '○';
				count++;

				// 백돌 출력
				for (int y = 0; y < height; y++) {
					for (int x = 0; x < width; x++)
						System.out.printf("%c", board[y][x]);// [j][i]
					System.out.println();
				}

				break White;
			}
		}
	}

	public static int inputMainMenu() {
		Scanner scan = new Scanner(System.in);

		System.out.println("┌────────────┐");
		System.out.println("│      omok game         │");
		System.out.println("└────────────┘");
		System.out.println();
		System.out.println("1. 게임시작");
		System.out.println("2. 도움말");
		System.out.println("3. 저장하기");
		System.out.println("4. 불러오기");
		System.out.println("5. 종료");
		System.out.print("> ");
		System.out.println();

		int menu = scan.nextInt();

		return menu;
	}
} // class off
