package membercall;


public class Number {
	
	int num;
	
//	Number (){
//		System.out.println("생성자 호출"); // number 클래스 초기화 
//		num = 1000;
//	}
	
	Number(int n){ // 생성자
		System.out.println("생성자 호출");
		num = n;
		System.out.println(num);
	}

	public static void main(String[] args) {
		
		// 객체를 생성 후 변수를 참조
//		Number n1 = new Number();
//		System.out.println(n1.num);
		
		// 생성자에 매개변수 전달 
		Number n1 = new Number(1000000);
		
	}
}
