package com.javaex.ex15;

public class Circle extends Shape{
	
	//필드
	//private String linColor;
	//private String fillColor;
	protected int radius;
	
	//생성자
	public Circle(int radius) {
		super();
	}

	public Circle(String lineColor, String fillColor, int radius) {
		super(lineColor, fillColor);
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
	public String toString() {
		return "Circle [radius=" + radius + ", getRadius()=" + getRadius() + "]";
	}
	
	public void draw() {
		System.out.println("선색: "+ super.lineColor +" 면색: "+super.fillColor+"반지름 : "+this.radius+" 원을 그렸습니다.");
	}

	
	
	
	
	
	

}
