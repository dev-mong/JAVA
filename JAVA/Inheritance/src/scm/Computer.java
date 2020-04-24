package scm;

public class Computer extends Product {
	
	//생성자
	Computer(int price) {
		super(price);
	}

	@Override
	public String toString() {
		return "Computer";
	}

	void Programming() {
		System.out.println("프로그래밍을 합니다.");
	}
}
