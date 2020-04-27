package Persnal;

public class AbstractInterfaceMain {

	public static void main(String[] args) {
	
		//추상 클래스
//		PersonalNumberStorage storage = new PersnalNumberStorageImpl(100);
//		storage.addPersnalInfo("202020-1111111", "손흥민");
//		storage.addPersnalInfo("201010-2222222", "박지성");
//	
//		System.out.println(storage.searchName("202020-1111111"));
//		System.out.println(storage.searchName("201010-2222222"));
//		
		
		//인터페이스 - 다형성 사용 가능
		PersnalNumber storage=new PersnalNumberStorageImpl(100);

		storage.addPersnalInfo("202020-1111111", "손흥민");
		storage.addPersnalInfo("201010-2222222", "박지성");
	
		System.out.println(storage.searchName("202020-1111111"));
		System.out.println(storage.searchName("201010-2222222"));
		
		
	}

}
