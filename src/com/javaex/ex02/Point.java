package com.javaex.ex02;

public class Point {
	
	
		//필드
		private int x;
		private int y;
		
		
		//생성자	
		
		
		//메소드
		public void setX(int x) {
			this.x = x; //xx들어온 값 
		}
		
		public int getX() {
			return x;
		}
		
		
		public void setY(int y) {
			this.y = y;
			
		}
		public int getY() {
			return y;
		}
		
		public void draw() {
			System.out.println("점 [x="+ x +", y=" + y + "]을 그렸습니다");
		}
		

	


}
