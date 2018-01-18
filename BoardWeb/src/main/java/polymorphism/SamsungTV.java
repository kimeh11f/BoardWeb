package polymorphism;

import org.springframework.stereotype.Component;


public class SamsungTV implements TV {
	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker 호출");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("===> setPrice 호출");
		this.price = price;
	}

	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("===> SamsungTV(1) 객체 생성됨");
	}
	
	public SamsungTV(Speaker speaker) {
		System.out.println("===> SamsungTV(2) 객체 생성됨");
	}
	
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("===> SamsungTV(3) 객체 생성됨");
		this.speaker = speaker;
		this.price = price;
	}
	
	
	
	public void powerOn() {
		System.out.println("Samsung TV --- 전원을 켠다.");
	}

	public void powerOff() {
		System.out.println("Samsung TV --- 전원을 끈다.");
	}

	public void volumeUp() {
		speaker.volumeUp();
	}

	public void volumeDown() {
		speaker.volumeDown();
	}

}