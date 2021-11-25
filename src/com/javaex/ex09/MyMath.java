package com.javaex.ex09;

public class MyMath {
	
	//필드  --필요없음 
	//변수를 위해서 이제 써보겠음 3.14때문 static을 빼니까 에러남. static이 없어서 넘어가서?
	//필드값을 사용을 하면 static으로 미리 올려줘야함
	private static double pi = 3.14;
	
	//생성자 -- 디폴트 생성자 사용
	
	//메소드 g/s  -- 필드가 없기 때문에 없음
	
	//메소드 일반
	public static int plus(int a,int b) { //plus로 통칭해도 됨. 이유는 파라미터가 이미 다르기 때문.
									//이게 메소드 오버로딩. 
		return a+b;
	}
	
	public static double plus(double a,double b ) {
		return a+b;
	}
	public static double plus(double a, int b) {
		//double sum = a+b;    //3.5 + 3.0 으로 바뀐다. 자동형변환
		return a+b;
	}
	
	public static double plus(int a, double b) {
		return a+b;
	}
	public static double circleArea(int radius) {
		double area = radius*radius*pi;
		return area;
	}
	public static double circleRound(int radius) {
		return (radius+radius)*pi;
	}
	

}
