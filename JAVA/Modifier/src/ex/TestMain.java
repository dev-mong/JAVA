package ex;

public class TestMain {

	public static void main(String[] args) {
		
		Member member = new Member();
//		System.out.println(member.name); //private 제어자 

		System.out.println(member.getName());
		
		
		Singleton s = Singleton.getInstance(); //객체 생성 
		s.print();
		
		
	}

}
