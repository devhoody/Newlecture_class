package com.NewlecMentoring.popcorn;

import java.util.Scanner;

public class Popcorn {

	private int[][] price;
	private int peopleIndex;
	private Boolean[] onMenu;

	public Popcorn() {
		int orderMax = 10;
		price = new int[orderMax][3];
		peopleIndex = 0;
		onMenu = new Boolean[3];
		for (int i = 0; i < 3; i++)
			onMenu[i] = true;
	}

	public void totalPrice(int total) {
		System.out.println("┌──────────────┐");
		System.out.println("│              결제 금액               │");
		System.out.println("└──────────────┘");
		System.out.println();
		System.out.println();
		System.out.printf("총 결제 금액은 <%d원> 입니다.\n", total);
		System.out.println();
		System.out.printf("감사합니다. 즐거운 관람 되세요~\n");

	}

	public int eventProgram(int total, Scanner fscan, Scanner fscan2) {
		Scanner scan = new Scanner(System.in);
		System.out.println("┌──────────────┐");
		System.out.println("│              할인 이벤트             │");
		System.out.println("│                                           │");
		System.out.println("│          영화 제목 맞추기          │");
		System.out.println("└──────────────┘");
		int quizCount = 1;
		int quizDiscount = 1;

		while (quizCount<11) {

			String movieQuiz = fscan2.nextLine();
			String movieName = fscan.next();

			System.out.printf("%d 번 문제입니다.\n", quizCount);
			System.out.println("──────────────────────────────────\n");
			System.out.printf("%s\n", movieQuiz);
			System.out.println("──────────────────────────────────\n");
			System.out.println();
			System.out.println("정답 > ");

			String answer = scan.next();

			if (answer.equals(movieName)) {
				System.out.println("정답입니다. 다음  문제로 넘어가주세요!\n");
				total = total - (500 * quizDiscount);
				System.out.printf("현재 결제 금액은 <<%d원>> 입니다.\n", total);
			} else {
				System.out.printf("틀렸습니다. 정답은 <<%s>>입니다.\n", movieName);
				System.out.printf("현재 결제 금액은 <<%d원>> 입니다.\n", total);
			}

			System.out.println();
			System.out.println();
			quizCount++;

		}
		return total;
	}

	public void printEvent(int total) {
		System.out.printf("총 결제 금액은 <<%d원>> 입니다.\n", total);
		System.out.println();
		System.out.println("┌─────────────────────────────┐");
		System.out.println("│  고객님! 현재 매점 할인 이벤트를 진행하고있습니다!               │  ");
		System.out.println("│  <<영화제목>>을 맞출때마다 500원씩 할인! 총 10문제입니다!      │  ");
		System.out.println("│  도전하시고 할인을 꼭 받아가세요!                                        │ ");
		System.out.println("└─────────────────────────────┘");
		System.out.println();
		System.out.println("1. 네 도전하겠습니다. 2. 아니오 그냥 해주세요.");
	}

	public void printSnakMenu() {
		System.out.println("┌──────────────┐");
		System.out.println("│      어떤 스낵을 먹을까?         │");
		System.out.println("└──────────────┘");
		System.out.println("1. 나쵸\t 2. 오징어\t 3. 치즈볼\t 4. 메뉴 선정 끝");
		System.out.println("다음에 올게요. : -1 ");

	}

	public void printDrinkMenu() {
		System.out.println("┌──────────────┐");
		System.out.println("│      어떤 음료를 먹을까?         │");
		System.out.println("└──────────────┘");
		System.out.println("1. 콜라\t 2. 제로콜라\t 3. 사이다\t 4. 환타 오렌지\t 5.환타 포도\t 6. 다음 선택으로");
		System.out.println("다음에 올게요. : -1 ");
	}

	public void printPopMenu() {
		System.out.println("┌──────────────┐");
		System.out.println("│      어떤 팝콘을 먹을까?         │");
		System.out.println("└──────────────┘");

		System.out.println("1. 고소팝콘\t 2. 카라멜팝콘\t 3. 어니언팝콘\t 4. 치즈팝콘\t 5. 다음 선택으로");
		System.out.println();

		System.out.println("다음에 올게요. : -1 ");

	}

	public void infoSnack(String snackName, int[][] price, int peopleIndex) {
		Scanner scan = new Scanner(System.in);

		System.out.printf("%s는 4000원 입니다.", snackName);
		System.out.println("몇개를 구매하시나요?");
		int n = scan.nextInt();
		this.price[peopleIndex][2] = 4000 * n;

	}

	public void infoDrink(String drinkName, int[][] price, int peopleIndex) {

		Scanner scan = new Scanner(System.in);

		System.out.printf("%s는 2000원 입니다.", drinkName);
		System.out.println("몇개를 구매하시나요?");
		int n = scan.nextInt();
		this.price[peopleIndex][1] = 2000 * n;

	}

	public void infoPopcorn(String popcornName, int[][] price, int peopleIndex) {
		Scanner scan = new Scanner(System.in);

		System.out.printf("%s은 5000원 입니다.", popcornName);
		System.out.println("몇개를 구매하시나요?");
		int n = scan.nextInt();

		this.price[peopleIndex][0] = 5000 * n;

	}
	
	public void printMenu() {
		System.out.println("┌─────────────────┐");
		System.out.println("│              팝콘 시뮬레이션               │");
		System.out.println("└─────────────────┘");
		System.out.println("1. 시작하기");
		System.out.println("2. 종료");
	}

	public int[][] getPrice() {
		return price;
	}

	public void setPrice(int[][] price) {
		this.price = price;
	}

	public int getPeopleIndex() {
		return peopleIndex;
	}

	public void setPeopleIndex(int peopleIndex) {
		this.peopleIndex = peopleIndex;
	}

	public Boolean[] getOnMenu() {
		return onMenu;
	}

	public void setOnMenu(Boolean[] onMenu) {
		this.onMenu = onMenu;
	}


}
