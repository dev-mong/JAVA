package ex;

public class IpTv extends Tv{

	String ipTvName="daumiptv";
	
	void display() {
		super.display(); //Tv의 display 메소드 호출
		System.out.println(ipTvName+"IP Tv를 봅니다.");
	}
}
