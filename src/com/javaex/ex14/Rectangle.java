package com.javaex.ex14;

public class Rectangle extends Shape{
	
	//필드
	//private String lineColor;
	//private String fillColor;
	
	private int width;
	private int height;
	
	//생성자
	public Rectangle(int width, int height) {
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
	//부모쪽의 메소드 사용 목하게 하려고 같은 이름으로 "재정의"
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", getLineColor()=" + getLineColor()
				+ ", getFillColor()=" + getFillColor() + "]";
	}

	

	

	
	

}
