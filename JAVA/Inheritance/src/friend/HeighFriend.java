package friend;

public class HeighFriend extends Friend{ //고등학교 친구 클래스

	String work; // 직업 
	
	//생성자, 직업 초기화
	public HeighFriend(String name, String phoneNum, String addr,String work) {
		super(name, phoneNum, addr);
		this.work=work;
	}
	
	@Override
	public void showData() {
		showBasicInfo();
		System.out.println("직업: "+this.work);
	} 
	
	
}
