package ver05;

//메뉴 인터페이스
public interface Menu {
	/*
	 * 메뉴
	 * 	1 정보 저장
	 *  1.대학 2.회사 3.동호회
	 *  2 정보 검색 
	 *  3 정보 삭제 
	 *  4 정보 수정 
	 *  5 정보 전체보기 
	 *  6 프로그램 종료
	 */
	
	
	//public static final 자료형 상수=리터럴;
	int SELET_CREATE = 1; 	//정보 입력
	int SELET_SHOW = 2; 	//정보 검색
	int SELET_DELETE = 3; 	//정보 삭제
	int SELET_UPDATE = 4;	//정보 수정
	int SELET_SHOWALL = 5;	//정보 전체보기
	int SELET_EXIT = 6;		//프로그램 종료 
	
	int UNIV=1;				//대학
	int COMPANY=2;			//회사
	int CAFE=3;				//동호회
	
}
