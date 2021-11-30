package com.javaex.ex14;

public class ShapeApp {

	public static void main(String[] args) {
		
		/*
		Shape s01 = new Shape("빨강", "빨강");
		System.out.println(s01.toString());
		*/
		
		Rectangle r01 = new Rectangle("빨강", "빨강", 5,5);
		//System.out.println(r01.toString());
		Rectangle r02 = new Rectangle("노랑", "노랑", 7,7);
		Rectangle r03 = new Rectangle("파랑", "파랑", 10,10);
		
		
		//사각형 관리를 위한 배열을 만든다.
		Rectangle[] rArray = new Rectangle[3];
		
		//사각형을 배열에 넣는다.
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		//배열을 순회 하면서 출력한다.
		for(int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		System.out.println("=================================");
		Circle c01 = new Circle("노랑","노랑",5);
		Circle c02 = new Circle("파랑","파랑",10);
		Circle c03 = new Circle("빨강","빨강",20);
		
		Circle[] cArray = new Circle[3];
		
		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;
		
		for(int i=0; i<cArray.length; i++) {
			cArray[i].draw();
		}
		
		
		
		
		
	}

}
