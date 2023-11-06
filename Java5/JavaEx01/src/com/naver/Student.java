package com.naver;

import java.util.Objects;

public class Student {
	private String hakbun;
	private String name;
	private int age;
	private double height;
	
	// default 생성자
	public Student() {
		// TODO Auto-generated constructor stub
	}

	// 자동생성
	public Student(String hakbun, String name, int age, double height) {
		this.hakbun = hakbun;
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	
	
	// 지동생성
	@Override
	public String toString() {
		return "Student [hakbun=" + hakbun + ", name=" + name + ", age=" + age + ", height=" + height + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, hakbun, height, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Objects.equals(hakbun, other.hakbun)
				&& Double.doubleToLongBits(height) == Double.doubleToLongBits(other.height)
				&& Objects.equals(name, other.name);
	}

	
	
	// setter/getter 생성
	// Source -> Generate getter and setter
	public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
}
