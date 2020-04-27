package ex;

//class 앞에 abstract 키워드가 있는 경우 이 클래스는 추상 클래스
//추상 클래스는 미완성 된 클래스 
//클래스의 멤버 중 추상 메서드를 하나라도 포함하고 있는 경우 : 추상클래스
//추상 메서드:미완성 된 메소드
public abstract class Player {

	int currentPos;
	
	Player(){
		
	}
	
	//추상 메서드: abstract 반환형 메서드 이름(매개변수);
	abstract void play(int pos);
	
	//추상 메서드
	abstract void stop();
	
	void play() {
		play(currentPos);
	}
	
	
}	
