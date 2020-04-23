package ex;

public class BusinessMan extends Man { //하위 클래스 
	
	String company;
	String position;
	
	
	BusinessMan(String name,String company,String position) {
		super(name); // 상위 클래스의 생성자 호출 후 name 값 초기화  
		this.company=company;
		this.position=position;
	}
	
	void tellYourInto() {
		super.tellYourName();
//		tellYourName();
		System.out.println("나의 직급은 "+position+" 입니다.");
		System.out.println("나의 직장 이름은 "+company+" 입니다.");
	}
	
}