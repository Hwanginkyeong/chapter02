package com.javaex.ex11;

public class PersonApp {
	//필드
	//생성자
	//메소드  getter/setter
	//메소드  일반
	public static void main(String[] args) {
		
		
		//Person test 
		Person p01 = new Person("정우성",45);
		
		Person p02 = new Person();
		p02.setName("이정재");
		p02.setAge(-1);
		
		//System.out.println(p01.toString());
		//System.out.println(p02.toString());
		
		p01.showInfo();
		p02.showInfo();
		
		System.out.println(p02.getAge());
		
	}

}
