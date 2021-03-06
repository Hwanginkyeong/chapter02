package com.javaex.ex18;

public class Triangle extends Shape implements Drawable{
	
	
	//필드
	protected int width;
	protected int height;
	
	
	//생성자
	public Triangle() {
	}
	
	public Triangle(String lineColor, String fillColor, int width, int height) {
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
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + ", lineColor=" + lineColor + ", fillColor="
				+ fillColor + "]";
	}
	
	public void draw() { //인터페이스의 메소드를 구현
		System.out.println("선색: "+ super.lineColor +" 면색: "+super.fillColor+" 가로: "+this.width+" 세로: "+this.height+" 삼각형을 그렸습니다.");
	}
	
	public double area() {
		double result = (width * height)/2;
		return result;
	}
	
	
	
	
	

}
