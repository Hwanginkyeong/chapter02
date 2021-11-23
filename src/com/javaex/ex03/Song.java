package com.javaex.ex03;

public class Song {
	
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;
	
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getArtist() {
		return artist;
	}
	
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getAlbum() {
		return album;
	}
	
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public String getComposer() {
		return composer;
	}
	
	public void setYear(String year) {
		this.year = year;
	}
	public String getYear() {
		return year;
	}
	
	public void setTrack(int track) {
		this.track = track;
	}
	public int getTrack() {
		return track;
	}
	
	
	/*
	public void showInfo() {
		System.out.println("");
	}
	*/
	
	
	public String toString() {
		return "Song [title=" + title +", artist="+artist
				+", album=" + album +", composer="+ composer +
				", year="+year+", track="+track + "]";
	}
}
	
