package com.javaex.ex19;

public class ArrayException {

	public static void main(String[] args) {
	
		int[] intArray = new int[] {3,6,9};
		
		try {
			System.out.println(intArray[1]);
		}catch(ArrayIndexOutOfBoundsException e) {  //Exception으로 잡아버리는 게 나을 때도 있음
			System.out.println(e.toString());
		}finally {
			System.out.println("finally 영역");
		}

	}

}
