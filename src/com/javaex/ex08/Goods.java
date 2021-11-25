package com.javaex.ex08;

public class Goods {
	
	//필드
	private String name;
	private int price;
	private static int totalcount;
	
	//생성자
	public Goods() {
		
	}
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		this.totalcount++;
	}
	
	
	//메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTotal() {
		return totalcount;
	}
	public void setTotal(int total) {
		this.totalcount = total;
	}
	
	
	
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", totalcount=" + totalcount + "]";
	}
	public void showInfo() {
		System.out.println("상품명: " +name);
		System.out.println("가격: "+price);
		System.out.println("");
	}

}
