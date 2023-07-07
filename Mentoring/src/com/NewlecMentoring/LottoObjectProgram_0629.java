package com.NewlecMentoring;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Random;
import java.util.Scanner;

public class LottoObjectProgram_0629 {

	public static void main(String[] args) throws IOException {
		
		Lotto lotto = new Lotto();
		
		lotto.nums = new int[6];
		
		while (true) {

			int menu = PrintMenu();

			switch (menu) {

			case 1:
				AutoMakeLotto(lotto);
				break;

			case 2:
				ManualMakeLotto(lotto);
				break;

			case 3:
				CheckLotto(lotto);
				break;

			case 4:
				System.out.println("종료");
				return;

			default:

			}

		}
	} // main off

	private static void CheckLotto(Lotto lotto) throws IOException {
		// 로또 번호 확인
		FileInputStream fis = new FileInputStream("res/lotto.txt");
		Scanner fscan = new Scanner(fis);

		for (int i = 0; i < 6; i++) {
			lotto.nums[i] = fscan.nextInt();
			System.out.printf("%d ", lotto.nums[i]);
		}

		System.out.println();
	}

	private static int PrintMenu() {
		System.out.println("┌──────────────┐");
		System.out.println("│      Lotto 관리 프로그램         │");
		System.out.println("└──────────────┘");
		System.out.println();
		System.out.println("1. 번호 자동 생성");
		System.out.println("2. 번호 수동 생성");
		System.out.println("3. 내 로또 번호 보기 ");
		System.out.println("4. 종료 ");
		System.out.print("> ");
		System.out.println();

		Scanner scan = new Scanner(System.in);
		int menu = scan.nextInt();

		return menu;
	}

	private static void ManualMakeLotto(Lotto lotto) throws IOException {
		// 수동 생성
		Scanner scan = new Scanner(System.in);
		boolean inLotto = false;

		do {
			inLotto = false;
			System.out.println("┌──────────────┐");
			System.out.println("│      Lotto 번호 수동 생성         │");
			System.out.println("└──────────────┘");
			System.out.println("번호를 입력하세요.");
			System.out.println("> ");
			String arr = scan.nextLine();

			// strArr -> lotto 입력
			String[] strArr = arr.split(" ");

			for (int i = 0; i < 6; i++) {
				lotto.nums[i] = Integer.parseInt(strArr[i]);
				if (lotto.nums[i] < 1 || 45 < lotto.nums[i]) {
					System.out.printf("입력한 %d의 값은 1~45이외의 수 입니다.\n", lotto.nums[i]);
					System.out.println("다시 입력해주세요.");
					inLotto = true;
				}
			}
			
			// 겹치면 false;
			for (int j=0; j<5; j++)
				for (int i = 0+j; i < 5; i++) {
					if (lotto.nums[j] == lotto.nums[i+1]) {
						System.out.println("숫자가 겹칩니다. 다시 입력해주세요.");
						inLotto = true;
					}
				}
			
		} while (inLotto);

		// 수동 메뉴
		System.out.println("┌──────────────┐");
		System.out.println("│      Lotto 번호 수동 생성         │");
		System.out.println("└──────────────┘");

		// 수동 로또 출력
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d ", lotto.nums[i]);
		}

		System.out.println();
		System.out.println();

		System.out.println("1. 저장하고 메인메뉴로 가기");
		System.out.println("2. 취소하고 메인메뉴로 가기");
		System.out.println();

		System.out.println("> ");
		int autoMenu = scan.nextInt();

		switch (autoMenu) {

		case 1: // 저장 o 리턴
			FileOutputStream fos = new FileOutputStream("res/lotto.txt");
			PrintWriter pw = new PrintWriter(fos, true, Charset.forName("UTF-8"));

			for (int i = 0; i < 6; i++)
				pw.printf("%d ", lotto.nums[i]);

			pw.close();
		case 2:

			return;

		}

	}

	private static void AutoMakeLotto(Lotto lotto) throws IOException {

		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		AUTO: {

			// 번호생성
			for (int i = 0; i < 6; i++) {
				lotto.nums[i] = rand.nextInt(45) + 1; // 1~45 6개 번호 추출

				for (int j = 0; j < i; j++) {
					// 중복 체크
					if (lotto.nums[i] == lotto.nums[j]) {
						System.out.printf("lotto 번호가 중복되었습니다. ==> %d", lotto.nums[i]);
						i--;
						continue;
					}
				}
			}
			System.out.println();

			// 자동 로또 정렬
			for (int j = 0; j < 5; j++)
				for (int i = 0; i < 5 - j; i++)
					if (lotto.nums[i] > lotto.nums[i + 1]) {
						int temp = lotto.nums[i];
						lotto.nums[i] = lotto.nums[i + 1];
						lotto.nums[i + 1] = temp;
					}

			System.out.println("┌────────────────┐");
			System.out.println("│      1. Lotto 번호 자동 생성         │");
			System.out.println("└────────────────┘");

			// 배열 출력
			for (int i = 0; i < 6; i++)
				System.out.printf("%d ", lotto.nums[i]);
			System.out.println();

			System.out.println("1. 저장하고 메인메뉴로 가기");
			System.out.println("2. 취소하고 메인메뉴로 가기");

			System.out.println("> ");
			int autoMenu = scan.nextInt();

			switch (autoMenu) {

			case 1: // 저장 o 리턴
				FileOutputStream fos = new FileOutputStream("res/lotto.txt");
				PrintWriter pw = new PrintWriter(fos, true, Charset.forName("UTF-8"));

				for (int i = 0; i < 6; i++)
					pw.printf("%d ", lotto.nums[i]);
				pw.println();

				pw.close();

				break AUTO;

			case 2: // 저장 x 리턴
				break AUTO;

			} // menu off -- auto

		} // while off -- auto
	}

} // switch off
