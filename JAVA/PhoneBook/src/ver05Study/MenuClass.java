package ver05Study;

public class MenuClass {
	
	//메뉴 메소드
	public static void showMenu() {
		System.out.println("==========================");
		System.out.println("메뉴를 입력하세요");
		System.out.println(" "+Menu.SELET_CREATE+" 정보 저장");
		System.out.println(" "+Menu.SELET_SHOW+" 정보 검색");
		System.out.println(" "+Menu.SELET_DELETE+" 정보 삭제");
		System.out.println(" "+Menu.SELET_UPDATE+ " 정보 수정");
		System.out.println(" "+Menu.SELET_SHOWALL+" 정보 전체보기");
		System.out.println(" "+Menu.SELET_EXIT+" 프로그램 종료");
		System.out.println("==========================");
	}

}
