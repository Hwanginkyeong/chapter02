package com.javaex.ex18;

public class Rectangle extends Shape implements Drawable {
	
	//필드
	//private String lineColor;
	//private String fillColor;
	
	protected int width;
	protected int height;
	
	//생성자
	public Rectangle() {
		super(); //Shape 의 기본 생성자 Shape();
	}
	
	public Rectangle(String lineColor, String fillColor, int width, int height) {
		//super.setLineColor(lineColor);
		super(lineColor, fillColor);
		this.width = width;
		this.height = height;
	}

	
	//메소드 g/s
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	//메소드 일반
	//부모쪽에도 같은 메소드가 있다.
	//부모쪽의 메소드 사용 못하게 하려고 같은 이름으로 "재정의"
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", getLineColor()=" + getLineColor()
				+ ", getFillColor()=" + getFillColor() + "]";
	}
	
	public void draw() { //인터페이스의 메소드 구현
		System.out.println("선색: "+ super.lineColor +" 면색: "+super.fillColor+" 가로: "+this.width+" 세로: "+this.height+" 사각형을 그렸습니다.");
		
	}
	
	public double area() { //Shape의 추상클래스(미완성 클래스)를 상속
		double result = width * height;
		return result;
	}

	

	

	
	

}
