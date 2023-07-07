package com.NewlecMentoring.popcorn;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Program_addQuiz {
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
				
				System.out.println("┌──────────────┐");
				System.out.println("│      어떤 팝콘을 먹을까?         │");
				System.out.println("└──────────────┘");
				
				System.out.println("1. 고소팝콘 2. 카라멜팝콘 3. 어니언팝콘 4. 치즈팝콘 5. 다음 선택으로");
				System.out.println();
				
				
				System.out.println("다음에 올게요. : -1 ");
				
				int popcornMenu = scan.nextInt();
				
				switch(popcornMenu) {
				case 1 :
					
					System.out.println("고소팝콘은 1000원 입니다.");
					System.out.println("몇개를 구매하시나요?");
					int n = scan.nextInt();
					
					price[peopleIndex][0] = 1000 * n;
					break POPCORN;
					
				case 2 :
					
					System.out.println("카라멜팝콘은 2000원 입니다.");
					System.out.println("몇개를 구매하시나요?");
					n = scan.nextInt();
					price[peopleIndex][0] = 2000 * n;	
					break POPCORN;
					
				case 3 :
					
					System.out.println("어니언 팝콘은 2000원 입니다.");
					System.out.println("몇개를 구매하시나요?");
					n = scan.nextInt();
					price[peopleIndex][0] = 2000 * n;	
					break POPCORN;
					
				case 4 :
					System.out.println("치즈 팝콘은 1000원 입니다.");
					System.out.println("몇개를 구매하시나요?");
					n = scan.nextInt();
					price[peopleIndex][0] = 2000 * n;	
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
				System.out.println("┌──────────────┐");
				System.out.println("│      어떤 음료를 먹을까?         │");
				System.out.println("└──────────────┘");
				System.out.println("1. 콜라 2. 제로콜라 3. 사이다 4. 환타 오렌지 5.환타 포도 6. 다음 선택으로");
				System.out.println("안먹을래요 : -1 ");

				int drinkMenu = scan.nextInt();
				
				switch(drinkMenu) {
				case 1 :
					
					System.out.println("콜라는 1000원 입니다.");
					System.out.println("몇개를 구매하시나요?");
					int n = scan.nextInt();
					price[peopleIndex][1] = 1000 * n;
					break Drink;
					
				case 2 :
					
					System.out.println("제로콜라는 1000원 입니다.");
					System.out.println("몇개를 구매하시나요?");
					n = scan.nextInt();
					price[peopleIndex][1] = 1000 * n;	
					break Drink;
					
				case 3 :
					
					System.out.println("사이다는 1000원 입니다.");
					System.out.println("몇개를 구매하시나요?");
					n = scan.nextInt();
					price[peopleIndex][1] = 1000 * n;	
					break Drink;
					
				case 4 :
					System.out.println("환타 오렌지는 1000원 입니다.");
					System.out.println("몇개를 구매하시나요?");
					n = scan.nextInt();
					price[peopleIndex][1] = 1000 * n;	
					break Drink;
					
				case 5 : 
					System.out.println("환타 포도는 1000원 입니다.");
					System.out.println("몇개를 구매하시나요?");
					n = scan.nextInt();
					price[peopleIndex][1] = 1000 * n;
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
				System.out.println("┌──────────────┐");
				System.out.println("│      어떤 스낵을 먹을까?         │");
				System.out.println("└──────────────┘");
				System.out.println("1. 나쵸 2. 오징어 3. 치즈볼 4. 스낵 안먹음!");
				System.out.println("안먹을래요 : -1 ");
				
				int snakMenu = scan.nextInt();
				
				switch(snakMenu) {
				
				case 1 :
					
					System.out.println("나쵸는 1500원 입니다.");
					System.out.println("몇개를 구매하시나요?");
					int n = scan.nextInt();
					price[peopleIndex][2] = 1500 * n;
					break snak;
					
				case 2 :
					
					System.out.println("오징어는 2000원 입니다.");
					System.out.println("몇개를 구매하시나요?");
					n = scan.nextInt();
					price[peopleIndex][2] = 2000 * n;	
					break snak;
					
				case 3 :
					
					System.out.println("치즈볼은 1500원 입니다.");
					System.out.println("몇개를 구매하시나요?");
					n = scan.nextInt();
					price[peopleIndex][2] = 1500 * n;	
					break snak;
					
				case 4 :
					System.out.println("스낵 안먹어요.");
					price[peopleIndex][2] = 0;
					break snak;
					
				case -1 : 
					System.out.println("진상 : 아 안먹을께요 수고하세요.");
					return;
					
				default :
					System.out.println("1 ~ 4 이내의 번호를 입력해주세요.");
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
				
			
			if(peopleIndex <2) {
				System.out.println("더 구매하시겠습니까? "); // order: 1 => 구매. 2 => 추가구매 x
				System.out.println("1 => 추가 구매 o    2=>   추가 구매 x"); // order: 1 => 구매. 2 => 추가구매 x
				int addOrder = scan.nextInt();
				if(addOrder == 1) {
					peopleIndex++;
					continue;
				} 
			}
			
			// 결제금액 
			System.out.println("┌──────────────┐");
			System.out.println("│              결제 금액               │");
			System.out.println("└──────────────┘");
			System.out.println();
			System.out.println();
			System.out.printf("총 결제 금액은 <%d원> 입니다.\n", total);
			System.out.println();

		System.out.println("적립하실 멤버십 포인트 있으세요? ");
		System.out.println(" 1  ==> 네      2 ==> 아니오. 만들어주세요.     3.괜찮습니다. 결제해주세요.");
		int pointMenu = scan.nextInt();
		int[] point = new int[3];
		
		switch(pointMenu) {
		
		case 1:
			FileInputStream fis = new FileInputStream("res/member.txt");
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
			
			System.out.printf("2700 포인트 사용해 드려서 총 %d원 결제 도와드리겠습니다.", total - memberSpend);
			System.out.println("감사합니다. 안녕히 가십시오.");
			break;
			
			
		case 2:
			System.out.println("핸드폰 뒷번호 4자리와 성함을 입력해주세요.");
			memberPhone = scan.nextInt();
			String memberName = scan.next();
			float memberTotal = total * 0.01f;
			
			FileOutputStream fos = new FileOutputStream("res/member.txt");
			PrintWriter pw = new PrintWriter(fos, true, Charset.forName("UTF-8"));
			
			pw.printf("%d %s %.0f \n", memberPhone, memberName, memberTotal);
			
			
			System.out.printf("%.0f 원 적립 되었습니다.\n", memberTotal);
			System.out.println("결제 완료 되었습니다..안녕히 가세요!");
			
			pw.close();
			fos.close();
			break;
		
		case 3:
			System.out.println("결제 완료 되었습니다..안녕히 가세요!");
			return;
		} // switch off
		
		
		} // while off
	}// main off
}// class off
