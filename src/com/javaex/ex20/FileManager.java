package com.javaex.ex20;

import java.io.IOException;

public class FileManager {
	
	//필드
	
	//생성자
	//public FileManager() {}  //있으니 안만들어도 됨 
	
	//메소드 g/s
	
	//메소드 일반
	public void readFile() throws IOException{   // c://config.txt을 읽어오는 기능 
		System.out.println("강제예외상황발생");
		throw new IOException(); 
		
	}
		
		//System.out.println("파일을 읽었습니다.");
		/*
		try {
			System.out.println("강제예외상황발생");
			throw new IOException(); //파일이 없어서 오류가 나서 못읽었을 때 예외 발생 
									//원래는 파일을 읽어드리는 코드가 있어야 할 자리 
		} catch (IOException e) {
			System.out.println("파일이 없습니다.");
		}
		*/
	
		
		
	

}
