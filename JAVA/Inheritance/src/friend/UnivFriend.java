package friend;

public class UnivFriend extends Friend {

	String major; //전공
	int grade;   //학년
	
	//생성자
	public UnivFriend(String name, String phoneNum, String addr,String major,int grade) {
		super(name, phoneNum, addr);
		this.major=major;
		this.grade=grade;
	}

	
	@Override
	void showData() {
		super.showBasicInfo();
		System.out.println("전공: "+this.major);
		System.out.println("학년: "+this.grade);
	}
	
	

}
