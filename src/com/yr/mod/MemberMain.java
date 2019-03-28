package com.yr.mod;

public class MemberMain {

	public static void main(String[] args) {
		
		Member member = new Member("iu", 20, 96.3, 170);
		member.check();
	
		
		member.setAge(1200);
		int age = member.getAge();
		
		
		System.out.println(age);
	}

}
