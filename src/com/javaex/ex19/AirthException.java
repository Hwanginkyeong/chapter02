package com.javaex.ex19;

import java.util.Scanner;

public class AirthException {
	
	private double  num;

	public static void main(String[] args) {
	
		double result; 
		int num;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		
		result = 100/num;		//0을 넣으면 오류가 나는걸 확인할 수 있다. 예외상황 
		System.out.println(result);
		
		
		
		
		sc.close();
		
	}

}
