package com.NewlecMentoring.popcorn;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

public class ProgramMembership {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		
		int[][] price = new int[3][3];
		int peopleIndex = 0;
		boolean onPopcorn = true;
		boolean onDrink = true;
		boolean onSnak = true;
		
		while(true) {
			
			POPCORN :
			while(onPopcorn) {
				
				PrintPopMenu();
				
				int popcornMenu = scan.nextInt();
				
				switch(popcornMenu) {
				case 1 :
					
					infoPopcorn("고소팝콘",price, peopleIndex);
					break POPCORN;
					
				case 2 :
					
					infoPopcorn("캬라멜팝콘",price, peopleIndex);
					break POPCORN;
					
				case 3 :
					
					infoPopcorn("어니언팝콘",price, peopleIndex);
					break POPCORN;
					
				case 4 :
					
					infoPopcorn("치즈팝콘",price, peopleIndex);
					break POPCORN;
					
				case 5 : 
					price[peopleIndex][0] = 0;
					break POPCORN;
				
				case -1 : 
					System.out.println("수고하세요.");
					return;
					
				default :
					System.out.println("1 ~5 까지의 번호를 입력해주세요.");
					break;
					
				} // case off
			} // while off popcorn
			
			Drink :
			while(onDrink) {
				
				printDrinkMenu();
			
				int drinkMenu = scan.nextInt();
				
				switch(drinkMenu) {
				case 1 :
					
					infoDrink("콜라",price, peopleIndex);
					break Drink;
				
				case 2 :
					
					infoDrink("제로콜라",price, peopleIndex);
					break Drink;
					
				case 3 :
					
					infoDrink("사이다",price, peopleIndex);
					break Drink;
					
				case 4 :
					
					infoDrink("환타 오렌지",price, peopleIndex);
					break Drink;
					
				case 5 : 
					infoDrink("환타 포도",price, peopleIndex);
					break Drink;
					
				case 6 : 
					break Drink;
					
				case -1 : 
					System.out.println("수고하세요.");
					return;
					
				default :
					System.out.println("1 ~6 이내의 번호를 입력해주세요.");
					break;
				} // case off
				
			} // while drink off
			
			// 스낵 
			snak : 
			while(onSnak) {
				
				printSnakMenu();
				
				int snakMenu = scan.nextInt();
				
				switch(snakMenu) {
				
				case 1 :
					infoSnack("나쵸",price, peopleIndex);
					break snak;
					
				case 2 :
					
					infoSnack("오징어",price, peopleIndex);
					break snak;
					
				case 3 :
					
					infoSnack("치즈볼",price, peopleIndex);
					break snak;
					
				case 4 :
					System.out.println("스낵 안먹어요.");
					price[peopleIndex][2] = 0;
					break snak;
					
				case -1 : 
					System.out.println("수고하세요.");
					return;
					
				default :
					System.out.println("(1~4) 다시 한번 말씀해주시어요?");
					break;
					
				} // case off
			} // while off
			System.out.println();
			System.out.println();
			
			// 가격 출력 
			int total = 0;
			for(int j=0; j<3; j++)
				for(int i=0; i<3; i++) 
					total += price[j][i];
			
			// 추가 구매
			if(peopleIndex <2) {
				System.out.println("더 구매하시겠습니까? "); // order: 1 => 구매. 2 => 추가구매 x
				System.out.println("1 => 추가 구매 o    2=>   추가 구매 x"); // order: 1 => 구매. 2 => 추가구매 x
				int addOrder = scan.nextInt();
				if(addOrder == 1) {
					peopleIndex++;
					continue;
				} 
			}
			
			// 할인 이벤트 
			printEvent();
			
			int memberMenu = scan.nextInt();
			
			FileInputStream fis = new FileInputStream("res/popcorn/movie.txt");
			Scanner fscan = new Scanner(fis);
			
			FileInputStream fis2 = new FileInputStream("res/popcorn/moviehint.txt");
			Scanner fscan2 = new Scanner(fis2);
			
			int i = 1;
			
			switch(memberMenu) {
			
			// 1. 멤버쉽 체크 
			case 1:
				
				HaveMembers(total);
				break;
				
			// 2. 멤버십가입	
			case 2:
				MakeMembers(total);
				break;
			
			// 괜찮다 결제해달라 .
			case 3:
				break;
			}
			// 결제금액 
			System.out.println("┌──────────────┐");
			System.out.println("│              결제 금액               │");
			System.out.println("└──────────────┘");
			System.out.println();
			System.out.println();
			System.out.printf("총 결제 금액은 <%d원> 입니다.\n", total);
			System.out.println();

		
		} // while off
	}// main off

	private static void printEvent() {
		System.out.println("┌──────────────┐");
		System.out.println("│              멤버십 적립             │");
		System.out.println("└──────────────┘");
		System.out.println();
		System.out.println("적립하실 멤버십 포인트 있으세요? ");
		System.out.println(" 1  ==> 네      2 ==> 아니오. 만들어주세요.     3.괜찮습니다. 결제해주세요.");
	}

	private static void HaveMembers(int total) throws IOException {
		FileInputStream fis = new FileInputStream("res/member.txt");
		Scanner scan = new Scanner(System.in);
		Scanner fscan = new Scanner(fis);
		
		int memberPhone2 = 0; // 멤버 번호 4자리 
		String memberName2 = null; //  멤버 이름 
		float memberTotal2 = 0; // 적립금 input
		int memberSpend = 0; // 사용할 적립금 
		
		
		System.out.println("핸드폰 뒷번호 4자리를 입력해주세요.");
		int memberPhone = scan.nextInt();
		
		while(fscan.hasNext()) {
			memberPhone2 = fscan.nextInt();
			memberName2 = fscan.next();
			memberTotal2 = fscan.nextFloat();
			if (memberPhone == memberPhone2)
				break;
		}
		
		System.out.printf("%s 고객님, 현재 적립된 금액은 %.0f원 입니다. 얼마를 사용해드릴까요?\n", memberName2, memberTotal2);
		
		do {
			memberSpend = scan.nextInt();
			
			if(memberSpend > memberTotal2) 
				System.out.printf("사용 가능한 금액은 %.0f원 이하입니다. 얼마를 사용해드릴까요?");
			
		}while(memberSpend > memberTotal2);
		
		System.out.printf("%d 포인트 사용해 드려서 총 %d원 결제 도와드리겠습니다.\n", memberSpend, total - memberSpend);
		
		
	}
	private static void MakeMembers(int total) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("핸드폰 뒷번호 4자리와 성함을 입력해주세요.");
		int memberPhone = scan.nextInt();
		String memberName = scan.next();
		float memberTotal = total * 0.01f;
		
		FileOutputStream fos = new FileOutputStream("res/member.txt");
		PrintWriter pw = new PrintWriter(fos, true, Charset.forName("UTF-8"));
		
		pw.printf("%d %s %.0f \n", memberPhone, memberName, memberTotal);
		
		System.out.printf("%.0f 원 적립 되었습니다.\n", memberTotal);
		System.out.println("결제 완료 되었습니다..안녕히 가세요!");
		
		pw.close();
		fos.close();
		
	}
	private static void printSnakMenu() {
		System.out.println("┌──────────────┐");
		System.out.println("│      어떤 스낵을 먹을까?         │");
		System.out.println("└──────────────┘");
		System.out.println("1. 나쵸\t 2. 오징어\t 3. 치즈볼\t 4. 스낵 안먹음!");
		System.out.println("안먹을래요 : -1 ");
		
	}

	private static void printDrinkMenu() {
		System.out.println("┌──────────────┐");
		System.out.println("│      어떤 음료를 먹을까?         │");
		System.out.println("└──────────────┘");
		System.out.println("1. 콜라\t 2. 제로콜라\t 3. 사이다\t 4. 환타 오렌지\t 5.환타 포도\t 6. 다음 선택으로");
		System.out.println("안먹을래요 : -1 ");		
	}

	private static void PrintPopMenu() {
		System.out.println("┌──────────────┐");
		System.out.println("│      어떤 팝콘을 먹을까?         │");
		System.out.println("└──────────────┘");
		
		System.out.println("1. 고소팝콘\t 2. 카라멜팝콘\t 3. 어니언팝콘\t 4. 치즈팝콘\t 5. 다음 선택으로");
		System.out.println();
		
		
		System.out.println("다음에 올게요. : -1 ");
		
	}

	private static void infoSnack(String string, int[][] price, int peopleIndex) {
		Scanner scan = new Scanner(System.in);

		System.out.println("나쵸는 2000원 입니다.");
		System.out.println("몇개를 구매하시나요?");
		int n = scan.nextInt();
		price[peopleIndex][2] = 2000 * n;
		
	}

	private static void infoDrink(String string, int[][] price, int peopleIndex) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("콜라는 1000원 입니다.");
		System.out.println("몇개를 구매하시나요?");
		int n = scan.nextInt();
		price[peopleIndex][1] = 1000 * n;
		
	}

	private static void infoPopcorn(String PopcornName, int[][] price, int peopleIndex) {
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("%s은 2000원 입니다.",PopcornName);
		System.out.println("몇개를 구매하시나요?");
		int n = scan.nextInt();
		
		price[peopleIndex][0] = 2000 * n;	
		
	}
}// class off
