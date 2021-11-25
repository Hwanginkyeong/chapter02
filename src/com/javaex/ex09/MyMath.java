package com.javaex.ex09;

public class MyMath {
	
	//필드  --필요없음
	
	//생성자 -- 디폴트 생성자 사용
	
	//메소드 g/s  -- 필드가 없기 때문에 없음
	
	//메소드 일반
	public int plus(int a,int b) { //plus로 통칭해도 됨. 이유는 파라미터가 이미 다르기 때문.
									//이게 메소드 오버로딩. 
		return a+b;
	}
	
	public double plus(double a,double b ) {
		return a+b;
	}
	public double plus(double a, int b) {
		//double sum = a+b;    //3.5 + 3.0 으로 바뀐다. 자동형변환
		return a+b;
	}
	
	public double plus(int a, double b) {
		return a+b;
	}
	
	

}
