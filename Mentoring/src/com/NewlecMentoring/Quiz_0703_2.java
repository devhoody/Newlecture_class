package com.NewlecMentoring;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Quiz_0703_2 {

	public static void main(String[] args) throws IOException {

		int[][] map = new int[3][5];
		char[][] board = new char[6][10];

		// 3. res/map.txt에서 읽은 데이터로 map 배열을 채우시오.

		{
			// 코드를 작성하는 공간
			FileInputStream fis = new FileInputStream("res/map.txt");
			Scanner fscan = new Scanner(fis);

			for (int i = 0; i < 3; i++) {
				String str = fscan.nextLine();
				String[] str2 = str.split("");

				for (int j = 0; j < 5; j++) {
					map[i][j] = Integer.parseInt(str2[j]);
				}
			}

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 5; j++)
					System.out.printf("%d", map[i][j]);
				System.out.println();
			}

			System.out.println("map 데이터 로드 완료");
		}
		// 4. map 데이터 하나는 board 배열의 4칸과 대응되며 다음과 같은 모양으로 대응된다.
		// map에서 0은 다음 모양과 같다.
		// ┌ ┐
		// └ ┘
		// map에서 1은 다음 모양과 같다.
		// ▩▩
		// ▩▩
		// map에서 읽은 데이터를 이용해서 board 배열을 채우시오. 다음은 board 배열에 채워진
		// 모습니다.
		// ┌ ┐┌ ┐┌ ┐▩▩┌ ┐
		// └ ┘└ ┘└ ┘▩▩└ ┘
		// ┌ ┐▩▩┌ ┐▩▩┌ ┐
		// └ ┘▩▩└ ┘▩▩└ ┘
		// ┌ ┐┌ ┐┌ ┐┌ ┐┌ ┐
		// └ ┘└ ┘└ ┘└ ┘└ ┘

		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 5; y++) {
				if (map[x][y] == 0) {
					board[2 * x][2 * y] = '┌';
					board[2 * x + 1][2 * y] = '└';
					board[2 * x][2 * y + 1] = '┐';
					board[2 * x + 1][2 * y + 1] = '┘';
				} else if (map[x][y] == 1) {
					board[2 * x][2 * y] = '▩';
					board[2 * x + 1][2 * y] = '▩';
					board[2 * x][2 * y + 1] = '▩';
					board[2 * x + 1][2 * y + 1] = '▩';
				}
			}
			System.out.println();
		}

		for (int x = 0; x < 6; x++) {
			for (int y = 0; y < 10; y++)
				System.out.printf("%c", board[x][y]);
			System.out.println();
		}

	}

}
