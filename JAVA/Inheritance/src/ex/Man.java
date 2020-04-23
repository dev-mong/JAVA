package ex;

public class Man { //상위 클래스
	
	String name;

	//생성자 
	Man(String name){ //하위 클래스에서 받은 값을 초기화
		this.name=name;
	}
	
	void tellYourName() {
		System.out.println("나의 이름은"+name+"입니다.");
	}
}
