package membercall;


public class Number {
	
	//인스턴스 변수
	int iv =10;
	// 클래스 변수, static 변수
	static int cv = 100;
	
	int iv2 = cv; //인스턴스 변수에 static 변수 값을 넣었기에 가능 
//	static int cv2 = iv; // 오류 발생,
	// 해결방법
	static int cv2 = new Number().iv; //인스턴스 생성 후 선언, 한번만 사용 할 떄
	
	
	static void staticMethod() {
		// static 멤버 출력
		System.out.println(cv);
		
		// 인스턴스 멤버 출력
//		System.out.println(iv);
		
		Number mc = new Number();
		System.out.println(mc.iv);
		
	}
	
	void instanceMethod() {
		// static 멤버 출력
		System.out.println(cv);
		// 인스턴스 멤버 출력
		System.out.println(iv);
	}
	
}
