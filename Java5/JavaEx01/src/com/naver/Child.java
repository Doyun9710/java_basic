package com.naver;

public class Child extends Parent {
	public void viewChild() {
		System.out.println("Child viewCHild() 호출");
	}
	
	// annotation => compiler 알려주는 역할
	@Override
	public void viewParent() {
		// TODO Auto-generated method stub
		System.out.println("Child viewParent() 호출");
	}
}
