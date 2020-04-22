package ver02;

public class PhoneBookMain {

	public static void main(String[] args) {
		
		PhoneBookManager manager = new PhoneBookManager();
		
		// 정보 저장 객체 생성
		PhoneInfor info = null;
	
		while(true) {
			info = manager.createInstance();
			info.showInfo();
		}
	}

}
