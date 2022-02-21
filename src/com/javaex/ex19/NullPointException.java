package com.javaex.ex19;

public class NullPointException {

	public static void main(String[] args) {
		
		String str = new String("안녕하세요");
		
		try {
			str = null;
		} catch (Exception e) {
			System.out.println(str.toString());
		}

		System.out.println(str.toString());
	}

}
