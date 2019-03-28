package com.yr.mobile;

public class Phone {
	
	String brand;
	int price;
	String color;
	int size; 
	
	public Phone() {
		//디폴트 생성자 , 빈 생성자, 기본 생성자, 
		//매개변수가 없는 생성자
		//클래스 내에 생성자가 하나라도 없으면 컴파일러가 디폴트생성자를 하나 만들어 줌
		this(200);
		this.size=20;

	}
	
	public Phone(int price) {	// 가격이 다를 때
		this(price, "Red");
		
	}
	
	public Phone(int price, String color) {		//가격, 색 다를 때
		this(price, color, 15);
		
	}
	
	public Phone(int price, String color, int size) {	//가격, 색, 사이즈 다를 때
		
		brand = "LG"; 
		this.price = price;
		this.color = color;
		this.size = size;
		
	}
	
	public void info() { 	    //메서드
		System.out.println("Phone!~~!~!~");
		
	


	}
}
