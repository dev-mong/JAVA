package ver02;

import java.util.Scanner;

/*
  메서드만 존재하는 클래스 
  전화번호 정보를 저장하는 기능만을 포함하는 클래스 
  1_사용자로 부터 데이터를 받아서 인스턴스를 생성하고 반환
*/
public class PhoneBookManager {

	Scanner sc = new Scanner(System.in);
	
	PhoneInfor createInstance() {
		
		PhoneInfor info = null;
		
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
			info = new PhoneInfor(name, phoneNumber);
		} else {
			info = new PhoneInfor(name, phoneNumber, birthday);
		}
		
		return info;
	}
	
}
