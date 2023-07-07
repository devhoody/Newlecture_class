package com.NewlecMentoring.popcorn;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		
		Popcorn pop = new Popcorn();

		int[][] price = pop.getPrice();
		int peopleIndex = pop.getPeopleIndex();
		Boolean[] onMenu = pop.getOnMenu();
		
		while(true) {
			
			//팝콘 메뉴 출력 
			POPCORN: 
				while (onMenu[0]) {
					
					pop.printPopMenu();
					
					int popcornMenu = scan.nextInt();
					
					switch (popcornMenu) {
					case 1:
						
						pop.infoPopcorn("고소팝콘", price, peopleIndex);
						break POPCORN;
						
					case 2:
						
						pop.infoPopcorn("캬라멜팝콘", price, peopleIndex);
						break POPCORN;
						
					case 3:
						
						pop.infoPopcorn("어니언팝콘", price, peopleIndex);
						break POPCORN;
						
					case 4:
						
						pop.infoPopcorn("치즈팝콘", price, peopleIndex);
						break POPCORN;
						
					case 5:
						price[peopleIndex][0] = 0;
						break POPCORN;
						
					case -1:
						System.out.println("아 안먹을래요. 수고하세요.");
						break POPCORN;
						
					default:
						System.out.println("1 ~5 까지의 번호를 입력해주세요.");
						break;
						
					} // case off
				} // while off popcorn
			
			//음료 메뉴 출력 
			DRINK: 
				while (onMenu[1]) {
					
					pop.printDrinkMenu();
					
					int drinkMenu = scan.nextInt();
					
					switch (drinkMenu) {
					case 1:
						
						pop.infoDrink("콜라", price, peopleIndex);
						break DRINK;
						
					case 2:
						
						pop.infoDrink("제로콜라", price, peopleIndex);
						break DRINK;
						
					case 3:
						
						pop.infoDrink("사이다", price, peopleIndex);
						break DRINK;
						
					case 4:
						
						pop.infoDrink("환타 오렌지", price, peopleIndex);
						break DRINK;
						
					case 5:
						pop.infoDrink("환타 포도", price, peopleIndex);
						break DRINK;
						
					case 6:
						break DRINK;
						
					case -1:
						System.out.println("아 안먹을래요. 수고하세요.");
						break DRINK;
						
					default:
						System.out.println("1 ~6 이내의 번호를 입력해주세요.");
						break;
					} // case off
					
				} // while drink off
			
			// 스낵 메뉴 출력 
			SNACK: 
				while (onMenu[2]) {
					
					pop.printSnakMenu();
					
					int snakMenu = scan.nextInt();
					
					switch (snakMenu) {
					
					case 1:
						pop.infoSnack("나쵸", price, peopleIndex);
						break SNACK;
						
					case 2:
						
						pop.infoSnack("오징어", price, peopleIndex);
						break SNACK;
						
					case 3:
						
						pop.infoSnack("치즈볼", price, peopleIndex);
						break SNACK;
						
					case 4:
						System.out.println("스낵 안먹어요.");
						price[peopleIndex][2] = 0;
						break SNACK;
						
					case -1:
						System.out.println("아 안먹을래요. 수고하세요.");
						break SNACK;
						
					default:
						System.out.println("1 ~ 4 이내의 번호를 입력해주세요.");
						break;
						
					} // case off
				} // while snak off
			System.out.println();
			System.out.println();
			
			// 가격 출력
			int total = 0;
			for (int j = 0; j < 3; j++)
				for (int i = 0; i < 3; i++)
					total += price[j][i];
			
			// 추가 구매
			if (peopleIndex < 2) {
				System.out.printf("총 결제 금액은 <%d원> 입니다.\n", total);
				System.out.println("더 구매하시겠습니까? "); // order: 1 => 구매. 2 => 추가구매 x
				System.out.println("1 => 추가 구매 o    2=>   추가 구매 x"); // order: 1 => 구매. 2 => 추가구매 x
				int addOrder = scan.nextInt();
				if (addOrder == 1) {
					peopleIndex++;
					continue;
				}
			}
			
			// 할인 이벤트
			pop.printEvent(total);
			
			int quizMenu = scan.nextInt();
			
			FileInputStream fis = new FileInputStream("res/popcorn/movie.txt");
			Scanner fscan = new Scanner(fis);
			
			FileInputStream fis2 = new FileInputStream("res/popcorn/moviehint.txt");
			Scanner fscan2 = new Scanner(fis2);
			
			switch (quizMenu) {
			
			case 1:
				
				total = pop.eventProgram(total, fscan, fscan2);
				
			case 2:
				break;
				
			}
			// 결제금액
			pop.totalPrice(total);
			
		} // while off
	}// main off
	
}// class off
