package com.javaex.ex10;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods[] goodsArray = new Goods[3];
		
		Goods camera = new Goods("니콘", 400000);
		goodsArray[0] = camera;
		
		Goods cup = new Goods("머그컵", 2000);
		goodsArray[1] = cup;
		
		Goods computer = new Goods("그램", 900000);
		goodsArray[2] = computer;
		
		
		/*
		System.out.println(camera.toString());
		System.out.println(cup.toString());
		System.out.println(computer.toString());
		*/
		
		int count =0;
		for(int i=0; i<goodsArray.length; i++) {
			
			if(goodsArray[i]!= null) {//주소가 없지 않다면
				System.out.println(goodsArray[i].toString());
				count++;
			}
			
		}
		
		
		//이름만 출력하기 
		for(int i=0; i<goodsArray.length; i++) {
		goodsArray[i].showInfo();
		}
		
		
		
	}

}
