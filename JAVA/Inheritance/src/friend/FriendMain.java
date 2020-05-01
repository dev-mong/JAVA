package friend;

import java.util.InputMismatchException;

//추가 
//try-catch 추가

public class FriendMain {

	public static void main(String[] args) {
//		FriendInfoHandler handler = new FriendInfoHandler(10); //배열 길이 결정
		
		//싱글톤 패턴 처리
		FriendInfoHandler handler = FriendInfoHandler.getInstance();
		
		while(true) {
			System.out.println("=====메뉴를 선택해주세요=====");
			System.out.println(" "+Menu.INSERT_HEIGH+" 고교 친구 저장");
			System.out.println(" "+Menu.INSERT_UNIV+" 대학 친구 저장");
			System.out.println(" "+Menu.PRINT_BASIC+" 친구 기본정보 출력");
			System.out.println(" "+Menu.PRINT_ALL+" 전체 정보 출력");
			System.out.println(" "+Menu.EXIT+" 프로그램 종료");
			System.out.println("=====전체정보 출력=========");
		
			int choice=0;
			
			try {
				choice = handler.kb.nextInt();
				//InputMismatchException 오류 발생 하여 catch로 이동 
			}
//			catch(Exception e) 
			catch(InputMismatchException e)
			{ //InputMismatchException 인스턴스 전달
				System.out.println("정상적인 메뉴의 번호 입력이 되지 않았습니다.");
				System.out.println("메뉴를 다시 입력해주세요.");
				handler.kb.nextLine(); // 버퍼 공간 클리어 
				continue; // 반복문 마지막 블록으로 이동 => 조건식으로 이동 
			} catch (Exception e) {
				System.out.println("예외발생");
				handler.kb.nextLine(); // 버퍼 공간 클리어 
				continue; // 반복문 마지막 블록으로 이동 => 조건식으로 이동
			}finally {
				handler.kb.nextLine(); 
			}
			
			switch(choice) {
			case Menu.INSERT_HEIGH: case Menu.INSERT_UNIV:
				handler.addFriend(choice);
				break;
			case Menu.PRINT_BASIC: 
				handler.showAllSimpleData();
				break;
			case Menu.PRINT_ALL:
				handler.showAllData();
				break;
			case Menu.EXIT:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
		
			}
			
		} //while

	} //main

}//class
