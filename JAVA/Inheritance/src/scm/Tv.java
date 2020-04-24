package scm;

public class Tv extends Product{

	//생성자 초기화 
	Tv(int price){
		super(price); // 부모 클래스 생성자 초기화
		
	}
		
	//오버라이딩
	@Override
	public String toString() {
		return "Tv";
	}

	void display() {
		System.out.println("Tv를 시청합니다.");
	}
}
