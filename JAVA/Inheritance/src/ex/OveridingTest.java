package ex;

public class OveridingTest {

	public static void main(String[] args) {
		BaseEnSpeaker bSpeaker = new BaseEnSpeaker();
		
		bSpeaker.setVolume(10);
		bSpeaker.setBaseRate(20);
		
		bSpeaker.showCurrentState();
		
		System.out.println(bSpeaker);
		System.out.println("-----------");
		
		//다형성 : 상위클래스 타입의 참조변수에 하위클래스의 인스턴스를 참조 
		Speaker sp = new BaseEnSpeaker();
		
		//참조 변수 sp는 baseEnSpeaker가 가지던 멤버만 사용한다.
		//speaker 타입으로 선언되어 speak가 가진 값만 사용 가능
		sp.setVolume(10); 
		
		sp = bSpeaker;	
//		sp.setBaseRate(20); // 참조변수의 타입이 speak이므로 참조가 되지 않음
		
		
		
		sp.showCurrentState();
//		sp.setBaseRate(100);//에러 
		

	}

}
