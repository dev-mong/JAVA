package membership;

public class Member {

	String memberId;
	String memberName;
	String memberEmail;
	
	//생성자
	Member(String memberId, String memberName,String memberEmail)
	{
		this.memberId=memberId;
		this.memberName=memberName;
		this.memberEmail=memberEmail;
	}
	
	void showInfo() {
		System.out.println("아이디 : "+this.memberId);
		System.out.println("이름 : "+this.memberName);
		System.out.println("이메일 : "+this.memberEmail);
		System.out.println("----------------");
	}
	
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + ", memberEmail=" + memberEmail + "]";
	}


}
