package ver03;

import java.util.Scanner;

public class PhoneBookMain {
		
	
	public static void main(String[] args) {
		
		PhoneBookManager manager = new PhoneBookManager();
		
			
		while(true) {
			
			//메뉴
			Menu.showMenu(); //메뉴 출력 
			
			int selectMenu = manager.sc.nextInt(); // 메뉴값 입력 
			manager.sc.nextLine(); //버퍼공간 비움 
			
			switch(selectMenu) {
			
			//데이터 저장 
			case 1:
//				PhoneInfor info = manager.createInstance();
//				manager.addInfo();
				manager.addInfo();
				break;			
				
			//데이터 출력
			case 2:
				manager.searchInfo();
				break;
				
			//데이터 삭제
			case 3:
				manager.deleteInfo();
				manager.showAllData();
				break;
				
			//전체 데이터 출력	
			case 4:
				manager.showAllData();
				break;
				
			case 5:
//				return; // 프로그램 종료 , main메서드 종료
				System.exit(0); // 종료
				break;
				
			}
			
			
			// 정보 저장 객체 생성
//			PhoneInfor info = null;	
			
//			//사용자의 입력 데이터를 인스턴스 생성
//			info = manager.createInstance(); // 인스턴스 생성 후 참조값 반환 
//			
//			manager.addInfo(info); // 데이터를 배열에 저장 
//			
//			//사용자의 입력 데이터 생성
//			manager.showAllData();
//			
//			//이름으로 검색
//			manager.searchInfo();
//			
//			//이름으로 검색 후 삭제
//			manager.deleteInfo();
//			manager.showAllData();
			
			
		}//while문
	}//main
}//class PhoneBookMain
