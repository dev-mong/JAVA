package ver05;

//상속을 위한 기본 클래스 구성 
public abstract class PhoneInfo implements PhoneInfoInterface{

//	 private String name; 		//이름
//	 private String phoneNumber; //전화번호
//	 private String addr;        //주소
//	 private String email;		//이메일
	
	  String name; 		//이름
	  String phoneNumber; //전화번호
	  String addr;        //주소
	  String email;		//이메일
	
	PhoneInfo(){}
	
	//인스턴스 변수들 초기화
	PhoneInfo(String name,String phoneNumber,String addr,String email){
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.addr=addr;
		this.email=email;
	}
	
	//기본 정보 출력 메서드
	void showBasicInfo() {
		System.out.println("이름: "+this.name);
		System.out.println("전화번호: "+this.phoneNumber);
		System.out.println("주소: "+this.addr);
		System.out.println("이메일: "+this.email);
	}
	
	/*
	 * 날짜 	 :  20.04.29 
	 * 수정 내용 : interface 구현으로 메서드 오버라이딩 생략
	 * 						 PhoneInfo 클래스 -> 추상 클래스
	 */

	//전체 정보 출력 메서드
	public void showAllInfo() {
		// 상속 후 오버라이딩을 통해 재구성 
		
	}

}
