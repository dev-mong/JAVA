package scm;

public class Audio extends Product{

	//생성자 
	Audio(int price) {
		super(price);
	}

	//오버라이딩
	@Override
	public String toString() {
		return "Audio";
	}

	void music() {
		System.out.println("음악을 듣습니다.");
	}
	
}
