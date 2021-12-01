package com.javaex.exam;

public class PersonApp { //자바는 스태틱 영역을 미리 싹 조사해서 메모리에 올려놓음 메인함수는 스태틱이라 스타트 끊음 
						//시나리오 짜줌 

	public static void main(String[] args) {//두개의 생성자에서 뭘 올릴지 선택해야 함 첫 번째 생성자 실행 메모리에 올리는 작업
											//이 공간 안에서는 메모리에 올리고 이제 임무 끝. 할 일하고 없어짐.
		//Person
		Person p01 = new Person(); //첫번째 생성자 사용해서 넣은거
	
		//System.out.println(p01.toString()); //Person에서 메소드 일반에서 투 스트링을 값을 안넣은채로 출력해줌.
		p01.setName("황인경");
		p01.setAge(29);
		
		System.out.println(p01.toString());
		
		
		
		Person p02 = new Person("이정재",40); //set 필요없이 생성자 두번째꺼 쓴 거
		System.out.println(p02.toString());
		
		
		Person p03 = new Person("강호동", 50);
		System.out.println(p03.toString());
		
		p03.setAge(45); //setName은 당장 쓰지않더라도 값을 나중에 수정할 때 용이함
		
		//Student
		Student s01 = new Student("이효리",30,"제주고등학교"); 
		System.out.println(s01.toString());

	}

}


//두 번째 생성자 사용해서 new 사용해서 메모리에 올릴때 파라미터 안에 값을 넣어서 하면 부가해서 메모리에 올려버림 