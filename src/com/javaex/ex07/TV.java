package com.javaex.ex07;

public class TV {
	
	//필드
	private int channel;
	private int volume;
	private boolean power;
	
	
	//생성자
	public TV() {
	
	}

	public TV(int channel, int volume, boolean power ) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
		//System.out.println("TV(3)");
		
	}

		


	//메소드 -g/s
	public int getChannel() {
		return channel;
	}
	
	public int getVolume() {
		return volume;
	}


	public Boolean power() {
		return power;
	}
	
	
	//메소드 -일반
	@Override
	public String toString() {
		return "TV [channel=" + channel + ", volume=" + volume + ", power=" + power + "]";
	}
	
	
	
	
	
	

}
