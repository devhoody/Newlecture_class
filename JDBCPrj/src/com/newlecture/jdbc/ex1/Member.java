package com.newlecture.jdbc.ex1;

public class Member {
	
	
	private int id;
	private String name;
	private int age;
	
	public Member() {
		this(0,null,0);
	}
	
	public Member(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	
//	private Data[] dataList;
//
//	int current;
//
//	public void add(Data data) {
//		Data[] dataList = this.dataList;
//		int size = current;
//
//		// 가변 배열만들기
//		if (dataList.length == size) {
//			Data[] temp = new Data[size + 3];
//			for (int i = 0; i < dataList.length; i++) {
//				temp[i] = dataList[i];
//			}
//			dataList = temp;
//		}
//		this.dataList[this.current] = data;
//		this.current++;
//	}



	
}
