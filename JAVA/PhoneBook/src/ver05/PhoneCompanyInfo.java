package ver05;

//PhoneInfo 클래스를 상속해서 클래스 정의
public class PhoneCompanyInfo extends PhoneInfo{

	String company; //회사 이름
	String dept; 	//부서
	String job; 	//직급
	
	PhoneCompanyInfo(String name, String phoneNumber, String addr, String email,String company,String dept,String job) {
		super(name, phoneNumber, addr, email);
		this.company=company;
		this.dept=dept;
		this.job=job;
	}

	//전체 정보 출력하는 메소드 오버라이딩
	@Override
	public void showAllInfo() {
		showBasicInfo();  //기본 정보 출력 
		System.out.println("회사 이름: "+this.company);
		System.out.println("부서: "+this.dept);
		System.out.println("직급: "+this.job);
	}

}
