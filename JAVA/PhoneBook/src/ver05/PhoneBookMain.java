package ver05;

import java.util.InputMismatchException;

import ver05.exception.BadNumberException;

public class PhoneBookMain {
	
	public static void main(String[] args) {
//		PhoneBookManager manager = new PhoneBookManager(100);
		PhoneBookManager manager = PhoneBookManager.getInstance();
		
		while(true) {
			
			MenuClass.showMenu();
			
			int select=0;
			
			//예외 처리는 순차적으로 
			try {
				select=manager.kb.nextInt();

				//정상 범위는 1~6 
				//MenuNum.INSERT ~ MenuNum.EXIT
				if(!(select >= Menu.SELET_CREATE && select <=Menu.SELET_EXIT)) {
					BadNumberException e = new BadNumberException("잘못된 메뉴 입력");
				
					//강제적인 예외 발생 
					throw e;
				}
			} catch(InputMismatchException e) { //숫자말고 다른 문자 입력 오류
				System.out.println("잘못된 메뉴 입력입니다. 다시 입력해주세요");
//				manager.kb.nextLine(); //catch문 발생 시 아래 코드는 실행되지 않음 
				continue;
			} catch(BadNumberException e) {
				System.out.println("메뉴 범위를 벗어난 숫자입니다.\n다시 입력해주세요");
				continue;
			} catch(Exception e) {
				System.out.println("잘못된 메뉴 입력입니다. 다시 입력해주세요");
				continue;
			} finally { //예외에 상관없이 실행됨
				manager.kb.nextLine();
			}
			
			switch(select) {
			case Menu.SELET_CREATE: //전화번호 저장
				manager.createInfo();
				break;
			case Menu.SELET_SHOW: //전화번호 검색
				manager.showInfo();
				break;
			case Menu.SELET_DELETE: //전화번호 삭제
				manager.deleteInfo();
				break;
			case Menu.SELET_UPDATE: //전화번호 수정
				manager.editInfo();
				break;
			case Menu.SELET_SHOWALL: //전화번호 전체 출력
				manager.showAllInfo();
				break;
			case Menu.SELET_EXIT: //프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			}
			
			
			
		}
	}

}
