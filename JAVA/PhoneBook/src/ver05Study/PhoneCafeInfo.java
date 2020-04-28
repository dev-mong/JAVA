package ver05Study;

//PhoneInfo 클래스를 상속받아서 클래스 정의
public class PhoneCafeInfo extends PhoneInfo{

	String cafeName; 	//동회회 이름
	String nickName;	// 닉네임
	
	PhoneCafeInfo(String name, String phoneNumber, String addr, String email,String cafeName,String nickName) {
		super(name, phoneNumber, addr, email);
		this.cafeName=cafeName;
		this.nickName=nickName;
	}
	
	//전체 정보를 출력하는 메소드 오버라이딩 
	@Override
	public void showAllInfo() {
		super.showAllInfo();  //기본 정보 출력
		System.out.println("동회회 이름: "+this.cafeName);
		System.out.println("닉네임: "+this.nickName);
	}
	
}
