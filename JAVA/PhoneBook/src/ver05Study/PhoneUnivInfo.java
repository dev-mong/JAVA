package ver05Study;

//PhoneInfo 클래스를 상속해서 새로운 클래스를 정의
public class PhoneUnivInfo extends PhoneInfo{

	String major; //전공
	String grade; //학년
	
	
	PhoneUnivInfo(String name, String phoneNumber, String addr, String email,String major,String grade) {
		super(name, phoneNumber, addr, email);
		this.major=major;
		this.grade=grade;
	}
	
		
	//전체 정보를 출력하는 메소드 오버라이딩 
	@Override
	public void showAllInfo() {
		super.showAllInfo(); 	//기본정보 출력
		System.out.println("학년 : "+this.grade);
		System.out.println("전공: "+this.major);
	}
	
}
