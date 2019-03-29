package com.yr.overloading;

public class Cal {	// 비슷한 일을 하는 메서드의 메서드명을 같게
	
	public void plus(int a, int b, int c) {}
	
	public int plus(int a, int b) {
		int sum = a+b;
		return sum;
	}
	public float plus(int a, float b) {
		float sum = a+b;
		return sum;
	}
	public float plus(float a, float b) {
		return a+b;
	}
	
}
