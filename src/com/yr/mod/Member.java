package com.yr.mod;

public class Member {

	//멤버변수는 대부분 private으로 선언
	//setter, getter 메서드 생성
	
	private String name;
	private int age;
	private double muge;
	private double ki;

	// 생성자 2개
	// 디폴트 생성자 / 회원 정보를 매개변수로 받는 생성자

	public Member() {
	}

	public Member(String name, int age, double muge, double ki) {
		this.name=name;
		
		if(age>0 && age<120) {
			this.age=age;
		} else this.age=25;
		
		this.age=age;
		this.muge=muge;
		this.ki = ki; 
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMuge() {
		return muge;
	}

	public void setMuge(double muge) {
		this.muge = muge;
	}

	public double getKi() {
		return ki;
	}

	public void setKi(double ki) {
		this.ki = ki;
	}

	
	public void setAge(int age) {
		if(age>0 && age<130) {
			this.age=age;
		} else 
			this.age=25;	
	}

	public int getAge() {
		if(age>0 || age>130) {
			this.age=25;
		} return this.age;

	}

	public void check() {
		// 자기 키에서 -100 한 결과물 *0.95 의 결과물이
		// 자기 몸무게보다 작다면 비만 출력, 크다면 저체중 출력, 나머지 표준 출력
		double result = (ki-100)*0.95;
		if(result<muge) { 
			System.out.println("비만");
		} else if(result>muge) {
			System.out.println("저체중");
		} else System.out.println("표준");


	}

}
