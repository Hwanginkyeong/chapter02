package com.javaex.ex11;

public class Student extends Person{
	
	//필드
	private String schoolName;
	
	//생성자
	public Student() {
		
	}

	public Student(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public Student(String name, int age, String schoolName) {
		//부모 생성자 실행
		super();
		super.name = name;
		super.age = age;
		
		this.schoolName = schoolName;
		System.out.println("Student(3)");
	}

	//메소드 g/s
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + ", name=" + super.name + ", age=" + super.age + "]";
	}
	
	
	
	public void showInfo2() {
		
		System.out.println("***************");
		System.out.println("이름: "+ super.name);
		System.out.println("나이: "+ super.age);
		System.out.println("학교: "+ this.schoolName);
		System.out.println("***************");
		System.out.println("");
		
	}
	
	
	

	
	

}
