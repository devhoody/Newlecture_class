package com.NewlecMentoring;

public class String_230622 {

	public static void main(String[] args) {
		String str = "우리반짱이다";
		String str2 = "우리반짱이다";
		
		String str3 = new String("우리반짱이다");
		
		// 문자열 길이 
		int length = str.length();
		
		// 문자 대체 
//		str = str.replace("우", "아"); 
		
		System.out.println(str.substring(0,3));
		System.out.println(str.substring(2)); // index 2 이후로 모두 출력
		
		System.out.println(length);
		System.out.println(str);
		System.out.println(str.indexOf("반")); // 특정 단어의 위치 인덱스 출력  없으면 -1 반환 
		
		System.out.println(str.equals(str2)); // 문자열 내용이 같은지 확인 
		System.out.println("                                 Hi              ddd  dddddd".trim());// 양끝에 있는 공백 제거 
		
	}

}
