package com.javaex.ex08;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods("니콘", 400000);
		System.out.println(camera.toString());
		//camera.setName("니콘");
		//camera.setPrice(400000);
		
		
		Goods computer = new Goods();
		computer.setName("LG그램");
		computer.setPrice(900000);
		System.out.println(computer.toString());
		
		Goods cup = new Goods();
		cup.setName("머그컵");
		cup.setPrice(2000);
		System.out.println(cup.toString());
		
		

		//camera.showInfo();
		//computer.showInfo();
		//cup.showInfo();
		

	}

}
