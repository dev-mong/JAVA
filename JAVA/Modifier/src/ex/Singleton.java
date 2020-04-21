package ex;

public class Singleton {

	//생성자의 접근제어지시자 : private-> 인스턴스 생성 불가
	private Singleton() {}
	
	//공유 할 객체를 생성
	//Singleton s = new Singleton(); // 인스턴스 변수로 생성 됨
//	static Singleton s = new Singleton(); // 외부에서 접근이 가능해 짐
	private static Singleton s = new Singleton(); // static은 외부에서 참조 가능하므로 private 제어자 선언  
	
	//참조 값을 반환하는 메서드를 생성
	public static Singleton getInstance() {
		return s;
	}
	
	public void print() {
		
		System.out.println("Singleton !!");
	}

}
