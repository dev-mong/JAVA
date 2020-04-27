package ver04;

import java.util.Scanner;

//PhoneInfo 타입의 배열로 전화번호 정보를 저장,수정,삭제,검색,출력 
public class PhoneBookManager{

	//1. 배열 선언
	PhoneInfo[] books;
	int numOfInfo; 	   //배열에 저장 된 요소의 개수 
	
	Scanner kb;
	
	//생성자를 통해서 배열 생성, 오소의 개수 초기화
	PhoneBookManager(int num){
		this.books=new PhoneInfo[num];  //배열 생성 
		this.numOfInfo=0;				//요소 개수 초기화 
		kb=new Scanner(System.in);
	}
	
	//2. 배열에 정보를 저장
	//배열 추가
	void addInfo(PhoneInfo info) {
		//배열에 numOfInfo 숫자-> index로 참조값을 저장 
		books[numOfInfo]=info;
		//배열에 정보의 개수를 1 증가 시킴 
		numOfInfo++;
	}
	
	//사용자로 부터 받은 데이터로 인스턴스 생성
	void createInfo() {
		
		System.out.println("1.일반");
		System.out.println("2.대학");
		System.out.println("3.회사");
		System.out.println("4.동호회");
		
		//사용자 선택 번호
		System.out.println("입력하고자 하는 번호를 입력하세요");
//		int select=kb.nextInt();
//		kb.nextLine();
		int select=Integer.parseInt(kb.nextLine());
		
		if(!(select>0 && select<5)) {
			System.out.println("정상적인 메뉴 선택이 아닙니다. \n 메뉴를 다시 선택해주세요");
			return;
		}
		
		//기본 정보 수집 = 이름, 전화번호, 주소, 이메일
		System.out.println("이름을 입력하세요");
		String name= kb.nextLine();
		System.out.println("전화 번호을 입력하세요");
		String phoneNumber= kb.nextLine();
		System.out.println("주소을 입력하세요");
		String addr= kb.nextLine();
		System.out.println("이메일을 입력하세요");
		String email= kb.nextLine();

		PhoneInfo info=null;
		
		switch(select) {
		case 1:
			//기본 클래스로 인스턴스 생성
			
			info=new PhoneInfo(name, phoneNumber, addr, email);
			break;
		case 2:
			//대학 클래스로 인스턴스 생성
			System.out.println("전공을 입력하세요");
			String major=kb.nextLine();
			System.out.println("학년을 입력하세요");
			String grade=kb.nextLine();
			info=new PhoneUnivInfo(name, phoneNumber, addr, email, major, grade);
			break;
		case 3:
			//회사 클래스로 인스턴스 생성
			System.out.println("회사이름을 입력하세요");
			String company=kb.nextLine();
			System.out.println("부서의 이름을 입력하세요");
			String dept=kb.nextLine();
			System.out.println("직급을 입력하세요");
			String job=kb.nextLine();
			info=new PhoneCompanyInfo(name, phoneNumber, addr, email, company, dept, job);
			break;
		case 4:
			//기본 클래스로 인스턴스 생성
			System.out.println("동호회 이름을 입력하세요");
			String cafeName=kb.nextLine();
			System.out.println("닉네임을 입력하세요");
			String nickName=kb.nextLine();
			info=new PhoneCafeInfo(name, phoneNumber, addr, email, cafeName, nickName);
			break;
		}
		
		//생성된 인스턴스를 배열에 저장 
		addInfo(info);
		
	}
	
	//3. 배열의 데이터 출력 
	void showAllInfo() {
		System.out.println("전체 정보를 출력합니다.============");
		for(int i=0;i<numOfInfo;i++) {
			books[i].showAllInfo();
			System.out.println("-------------------------------");
		}
	
	}

	//인스턴스에 name을 기준으로 index 검색
	int searchIndex(String name)
	{
		int searchIndex=-1; // 정상적 index값은 0 이상값, 찾지 못했을때 -1로 구분
		//배열의 반복으로 인데값을 이용하여 찾는다.
		for(int i=0;i<numOfInfo;i++) {
			if(books[i].name.equals(name)) {
				searchIndex=i;
				break;
			}
		}
		
		return searchIndex;
	}
	
	//4. 배열의 정보 검색 : 이름 기준
	void showInfo() {
		System.out.println("----------검색-----------");
		System.out.println("이름을 입력하세요");
		String name=kb.nextLine();
		
		int index=searchIndex(name);

		if(index<0) {
			System.out.println("찾으시는 이름의 정보가 없습니다.");
		}else {
			System.out.println("------------------");
			books[index].showBasicInfo();
			System.out.println("------------------");
		}
	}
	
	//5. 배열의 정보 삭제 : 이름 기준
	void deleteInfo() {
		System.out.println("----------삭제----------");
		System.out.println("삭제할 이름을 입력하세요");
		String name=kb.nextLine();
		
		int index =searchIndex(name);
		
		if(index<0) {
			System.out.println("찾으시는 이름의 정보가 없습니다.");
		}else {
			//삭제 위치에서 왼쪽으로 시프트 처리
			for(int i=index;i<numOfInfo-1;i++) {
				books[i]=books[i+1];
			}
			//삭제가 되었으므로 요소의 개수도 -1
			numOfInfo--;
		}
		
	}
	
	//6. 배열의 정보 수정 : 이름 기준 
	void editInfo() {
		System.out.println("-----수정------");
		System.out.println("수정할 이름을 입력하세요");
		String name=kb.nextLine();
		
		int index=searchIndex(name);
		
		if(index<0) {
			System.out.println("찾으시는 이름의 정보가 없습니다.");
			return;
		}else {
		
			String editName=books[index].name;
			
			System.out.println("--------수정 데이터 입력을 시작합니다.------");
			System.out.println("이름은 "+editName+" 입니다.");
			System.out.println("전화번호를 입력하세요");
			String phoneNumber=kb.nextLine();
			System.out.println("주소를 입력하세요");
			String addr=kb.nextLine();
			System.out.println("이메일을 입력하세요");
			String email=kb.nextLine();

			PhoneInfo info=null;
			
			//저장된 인스턴스 : 기본? 대학? 회사? 동호회?
		if(books[index] instanceof PhoneUnivInfo) {
				System.out.println("전공을 입력하세요");
				String major=kb.nextLine();
				System.out.println("학년을 입력하세요");
				String grade=kb.nextLine();
				info=new PhoneUnivInfo(editName, phoneNumber, addr, email, major, grade);
			} else if(books[index] instanceof PhoneCompanyInfo) {
				System.out.println("회사이름을 입력하세요");
				String company=kb.nextLine();
				System.out.println("부서를 입력하세요");
				String dept=kb.nextLine();
				System.out.println("직급을 입력하세요");
				String job=kb.nextLine();
				info=new PhoneCompanyInfo(editName, phoneNumber, addr, email, company, dept, job);
			} else if(books[index] instanceof PhoneCafeInfo) {
				System.out.println("동호회 이름을 입력하세요");
				String cafeName=kb.nextLine();
				System.out.println("닉네임을 입력하세요");
				String nickName=kb.nextLine();
				info=new PhoneCafeInfo(editName, phoneNumber, addr, email, cafeName, nickName);
			} else 	if(books[index] instanceof PhoneInfo) {
				info=new PhoneInfo(editName, phoneNumber, addr, email);
				
			} 
			
			//배열에 새로운 인스턴스 저장 
			books[index]=info;
		}
	}
	
	
}
