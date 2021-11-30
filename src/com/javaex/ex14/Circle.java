package com.javaex.ex14;

public class Circle {
	
	//필드
	//private String linColor;
	//private String fillColor;
	protected int radius;
	
	//생성자
	public Circle(int radius) {
		super();
	}

	public Circle(String lineColor, String fillColor, int radius) {
		super();
		this.radius = radius;
	}
	
	//메소드 g/s
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	//메소드 일반
	public String toString3() {
		return "Circle [radius=" + radius + ", getRadius()=" + getRadius() + "]";
	}
	
	public void draw() {
		System.out.println(" 반지름 : "+this.radius);
	}

	
	
	
	
	
	

}
