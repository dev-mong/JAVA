package ex;

public class CaptionTv extends Tv{ //상속, tv클래스의 멤버를 포함한다
	
	String text;

	void caption() {
		System.out.println("자막 출력:"+text);
	}
	
	//메서드 오버라이딩
	void display() {
		super.display();
		caption();
	}
	
}
