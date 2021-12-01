package com.javaex.ex18;

public abstract class Shape {
	
	//필드
	protected String lineColor;
	protected String fillColor;
	
	//생성자
	public Shape() {
	}

	public Shape(String lineColor, String fillColor) {
		super();
		this.lineColor = lineColor;
		this.fillColor = fillColor;
	}
	
	
	//메소드 g/s
	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	
	
	//메소드 일반
	@Override
	public String toString() {
		return "Shape [lineColor=" + lineColor + ", fillColor=" + fillColor + "]";
	}
	
	/*
	public void draw() {
		System.out.println("선색: "+lineColor+" 면색: "+fillColor+" 도형을 그렸습니다.");
	}
	*/
	
	//area() 만들지 못함
	public abstract double area();
	// return 0.0; //억지로 모양을 맞추기 위해 사용
	//추상메소드 

	

	

	
	

}
