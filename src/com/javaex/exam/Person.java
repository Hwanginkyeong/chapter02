package com.javaex.exam;

public class Person { //붕어빵 틀 
	
	//필드
	private String name;
	private int age;
	
	//생성자 ->하는 일은 메모리에 올리는 일 
	public Person() {
		System.out.println("Person(1)");
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person(2)"); //이 생성자를 사용할 경우 찍히는(프린트되는) 값
	}
	
	//메소드 g/s
	public String getName() { //읽는 기능 get
		return name;
	}
	public void setName(String name) { //파라미터 안에 값을 쓰는 기능
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//메소드 일반
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	

}
