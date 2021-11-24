package com.javaex.ex05;

public class SongApp {

	public static void main(String[] args) {
		
		Song s01 = new Song();
		s01.setTitle("좋은날");
		s01.setArtist("아이유");
		s01.setAlbum("Real");
		s01.setComposer("이민수");
		s01.setYear("2010");
		s01.setTrack(3);
		
		//System.out.println(s01.toString());
		
		Song s02 = new Song("거짓말", "BIGBANG", "Always", "G-DRAGON", "2000", 3 );
		//System.out.println(s02.toString());
		
		
		//아이유출력
		s01.showInfo(); //얘가 프린트엘엔까지 가지고 있음
		//빅뱅출력
		
	}

}
