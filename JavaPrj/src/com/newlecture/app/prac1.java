package com.newlecture.app;

import java.util.Scanner;

public class prac1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("<뉴렉 카페 신메뉴 개발>");
		System.out.println("어떤 원두를 사용할까? : ");
		System.out.println("1. 가성비 원두 2. 제주도 원두 3. 프리미엄 뉴렉 원두 5.아메리카노");
		int num = scan.nextInt();
		System.out.println("그 원두의 가격은 얼마야? 순자만 입력");
		int price = scan.nextInt();
		
		int total = num * price;
		
		System.out.printf("대략\n%d\n원 이군!", total);
	}

}
