package com.javaex.ex19;

import java.util.Scanner;

public class AirthException2 {
	
	private double  num;

	public static void main(String[] args) {
	
		double result; 
		int num;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		//0이 입력되었을 때를 대비하는 상황
		try {
			result = 100/num;
			System.out.println(result);
		}catch(ArithmeticException e) {
			System.out.println(e.toString()); 
			//예외상황일 때 처리할 로직(상황이 발생하면 이 부분 실행) 
			//'예외 상황을 잡아낸다.' 라고  함.
		}finally {
			System.out.println("finally영역"); 
			//예외상황 유무 관계없이 처리됨 
		}
		
		
		
		sc.close();
		
	}

}
