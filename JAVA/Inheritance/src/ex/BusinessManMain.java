package ex;

public class BusinessManMain {

	
	
	public static void main(String[] args) {
		
//		BusinessMan bMan = new BusinessMan("손흥민", "닭집", "대표"); // 값이 모두 존재 할 때
		//name이 null값일 때 
		BusinessMan bMan = new BusinessMan(null, "닭집", "대표"); // 인스턴스 생성 
		
		bMan.tellYourInto();

	}

}
