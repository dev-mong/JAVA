package scm;

public class ScmMain {

	public static void main(String[] args) {
		
		// 상속 관계에서 다형성
		// 상위클래스 타입의 참조변수 = 하위 클래스의 인스턴스
//		Product p = new Tv(10000);
//		
//		Tv tv = new Tv(10);
//		Computer com = new Computer(20);	
//		Audio aud = new Audio(30);
//		
////		int sum = tv.price+com.price+aud.price;
//		
//		//참조변수 자동 형변환 
//		Product p1=tv; //tv 객체의 참조변수를 Product 타입으로 형변환
//		Product p2=com;
//		Product p3=aud;
		
		
		//상위 클래스 타입의 배열 생성
		Product[] products = new Product[3];
		products[0] = new Tv(100);
		products[1] = new Computer(300);
		products[2] = new Audio(200);
		
		//명시적 형변환 : 상위 타입의 변수 -> 하위타입의 변수 
		((Tv)products[0]).display(); //Tv 객체로 형변환 후 함수 호출
		
		//형변환 가능 여부 확인 
		//instanceof 연산자 사용 : 참조변수가 참조하는 인스턴스를 특정 클래스 타입으로 형 변환 가능한지 여부를 확인
		// instanceof 연산자 -> p1 instanceof Computer ==> true false		
		//전달하는 배열의 컴퓨터가 있다면 프로그래밍
		for(int i=0;i<products.length;i++) {
			if(products[i] instanceof Computer) {
				((Computer)products[i]).Programming();
			}
		}
		
		System.out.println("=========================");
		System.out.println("=========================");
		
		int sumOfPrice=0;
		int sumOfPoint=0;
		
//		for(int i=0;i<products.length;i++) {
//			System.out.println(products[i]); 
//			sumOfPrice += products[i].price;
//			sumOfPoint += products[i].bonusPoint;
//		}
//		System.out.println("전체 제품의 가격의 합은: "+sumOfPrice);
//		System.out.println("전체 제품의 포인트의 합은: "+sumOfPoint);
		

		
		// 구매자가 제품을 구매하는 과정
		Buyer buyer = new Buyer(); //구매자 생성
		
		// 제품 생성
		Tv product1 = new Tv(200);
		Computer product2 = new Computer(250);
		Audio product3 = new Audio(100);
		
		buyer.buy(product1); //Tv 구매
		buyer.buy(product2); //Computer 구매
		buyer.buy(product3); //Audio 구매 
		buyer.buy(product2);
		
		System.out.println("현재 보유금액: "+buyer.money);
		System.out.println("현재 보유 포인트: "+buyer.bonuesPoint);
		
		//구매 내역 영수증
		buyer.summary();
		
		
		
	}

}
