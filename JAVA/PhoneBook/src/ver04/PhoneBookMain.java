package ver04;

public class PhoneBookMain {
	
	public static void main(String[] args) {
		PhoneBookManager manager = new PhoneBookManager(100);
		
		while(true) {
			
			Menu.showMenu();
			int select=manager.kb.nextInt();
			manager.kb.nextLine();
			
			switch(select) {
			case 1: //전화번호 저장
				manager.createInfo();
				break;
			case 2: //전화번호 검색
				manager.showInfo();
				break;
			case 3: //전화번호 삭제
				manager.deleteInfo();
				break;
			case 4: //전화번호 수정
				manager.editInfo();
				break;
			case 5: //전화번호 전체 출력
				manager.showAllInfo();
				break;
			case 6: //프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			}
			
			
			
		}
	}

}
