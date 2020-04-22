package ver03;

import java.util.Scanner;

/*
  메서드만 존재하는 클래스 
  전화번호 정보를 저장하는 기능만을 포함하는 클래스 
  1_사용자로 부터 데이터를 받아서 인스턴스를 생성하고 반환
*/
public class PhoneBookManager {

	final PhoneInfor[] pBooks; //PhoneInfor 타입의 배열 생성, 배열 길이 고정 
	Scanner sc ;
	
	//입력된 정보 개수 -> 입력된 배열의 요소 개수
	//참조할 때 반복의 횟수
	//새로운 객체를 저장할 때 index로 사용 	
	int cnt; //-> 배열의 길이
	
	PhoneInfor info; // PhoneInfor 객체의 참조변수 선언 
	
	
	//생성자=> 값을 초기화 
	public PhoneBookManager() {
		pBooks=new PhoneInfor[100]; //배열 초기화 
		cnt=0;//저장개수 초기화
		sc=new Scanner(System.in); //Scanner 객체 초기화
		info = null; // 참조변수 초기화 
	}
	
	//저장 : 이름, 전화번호, 생년월일 정보를 대상으로 하는 저장 
	// 배열에 PhoneInfor 타입의 참조값을 저장
//	void addInfo(PhoneInfor info) {
//		
//		//배열에 요소 대입
//		pBooks[cnt]=info;
//		cnt++;
//	}	
	//메소드 오버로딩 
	void addInfo() {
		
		//배열에 요소 대입
		//등록된 정보 개수, 배열의 길이 결정
		pBooks[cnt++]=createInstance(); //값 저장 후 증가 

	}
	

	//PhoneInfor 타입으로 PhoneInfor 객체를 생성하는 메소드 (인스턴스화)
	PhoneInfor createInstance() {
		
		System.out.println("정보를 저장하기 위한 데이터를 입력하세요");
		
		System.out.println("이름을 입력하세요: ");
		String name = sc.nextLine();
		
		System.out.println("전화번호를 입력하세요");
		String phoneNumber = sc.nextLine(); 
		
		System.out.println("생일을 입력하세요");
		String birthday = sc.nextLine();
		
		// 입력 데이터에 따라 인스턴스 생성 방법을 구분 
		// 생일을 입력하거나 입력하지 않을 때 구분 
		if(birthday==null||birthday.trim().isEmpty()) { //null값 또는 공백
			info = new PhoneInfor(name, phoneNumber); //PhoneInfor 인스턴스화(객체생성하면서 주소값 저장)
		} else {
			info = new PhoneInfor(name, phoneNumber, birthday);//PhoneInfor 인스턴스화(객체생성하면서 주소값 저장)
		}
		
		return info;
	}
	
	//전체 리스트 출력
	void showAllData() {
		for(int i=0;i<cnt;i++) {
			pBooks[i].showInfo();
			System.out.println("----------------");
		}
	}
	
	
	//배열에서 이름을 기준으로 검색 후 index 값을 반환 하는 메소드
	int searchIndex(String name){
		int searchIndex=-1;//검색하는 이름의 데이터를 출력하지 않음 
		
		//사용자가 입력한 이름으로 배열에 요소를 검색
		for(int i=0;i<cnt;i++) {
			if(pBooks[i].checkName(name)) {
				searchIndex=i;
				break; //같은 이름이면 첫번째 요소가 출력되도록 반복 중지 
			}
		}
		return searchIndex;
	}
	
	
	//검색 리스트 출력
	//이름 기준으로 데이터를 찾음 => 배열 요소(PhoneInfor)의 name 속성 값으로 배열의 요소 찾음
	void searchInfo() {
		
		System.out.println("검색할 이름을 입력하세요.");
		String name = sc.nextLine();
		
		int searchIndex = searchIndex(name);
		
		if(searchIndex<0) {
			System.out.println("찾으시는 이름의 데이터가 존재하지 않습니다.");
		} else {
			
			pBooks[searchIndex].showInfo();
		}
		
	}
	
	
	// 리스트를 삭제
	void deleteInfo() {
		
		System.out.println("삭제할 이름을 입력하세요.");
		String name = sc.nextLine();
		
		int searchIndex = searchIndex(name);
		
		if(searchIndex<0) {
			System.out.println("찾으시는 이름의 데이터가 존재하지 않습니다.");
		} else {

			//삭제 기능 : 검색한 index 부터 저장된 위치까지 왼쪽으로 이동 
			for(int i=searchIndex;i<cnt-1;i++) {
				pBooks[i]=pBooks[i+1];
			}
			
			cnt--; //저장된 정보의 개수를 -1 ,배열의 길이를 줄임
		}
		System.out.println("요청하신 이름의 정보를 삭제했습니다.");
	}
	
	
	
	
	
	
	
	
	
}
