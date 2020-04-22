package ver01;

import java.util.*;

/*ver0.1 전화 번호 관리 프로그램
PhoneInfor라는 이름의 클래스 생성
변수는 string 타입
이름, 전화번호, 생년월일 
생년월일은 필수 사항이 아님*/

public class PhoneInfor {

	//private 정보 은닉 
	private String name; //이름
	private String phoneNumber; // 전화번호
	private String birtyday; // 생일 
	
	//초기화를 위한 생성자
	PhoneInfor(String name,String phoneNumber,String birthday) {
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.birtyday=birthday;
	}
	
	PhoneInfor(String name,String phoneNumber) {
//		this.name=name;
//		this.phoneNumber=phoneNumber;
		this(name,phoneNumber,"입력값이 없습니다."); 
	}	
	
	//데이터 출력 메소드 
	void showInfo() {
		System.out.println("이름: "+this.name);
		System.out.println("전화번호: "+this.phoneNumber);
		
//		if(this.birtyday == null) {
//		System.out.println("생일: ");
//		} else {
//			System.out.println("생일: "+this.birtyday);
//		}
		
		System.out.println("생일: "+this.birtyday);
		
	}
	


}
