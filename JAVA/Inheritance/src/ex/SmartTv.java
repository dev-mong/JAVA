package ex;

public class SmartTv extends Tv {

	String ch = "YOUTUBE";
	
	//메소드 오버라이딩
	void display() { //smartTv 메소드
		super.display();
		System.out.println(ch+" 방송을 시청합니다.");
	}
}
