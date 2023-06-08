package com.newlecture.app;

class Hello {
	public static void main(String[] args) {
		// 변수 선언
		int kor1, kor2, kor3;
		int total;
		float avg;

		// 성적 계산
		kor1 = 50;
		kor2 = 60;
		kor3 = 80;

		total = kor1 + kor2 + kor3;
		avg = total / 3.0f;

		// 출력
		System.out.printf("total is %d\n", total); // total 출력
		System.out.printf("avg is %f\n", avg); // avg 출력

	}
}