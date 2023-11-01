// package pack1;
package com.naver;
/*
 * javac -encoding utf-8 -d . Student.java
 * java Student
 */

public class Student {
    private String hakbun;
    private String name;
    private int age;
    private double height;

    public void setHakbun( String hakbun ) {
        this.hakbun = hakbun;
    }

    public String getHakbun() {
        return this.hakbun;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    } 

    public void setAge( int age ) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    } 

    public void setHeight( double height ) {
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    } 

    public static void main(String[] args) {
        
    }
}
