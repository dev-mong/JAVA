package fruitProgram;

public class FruitMain2 {

	public static void main(String[] args) {
		
		//seller1 객체 생성
		FruitSeller seller1 = new FruitSeller(30, 0, 1000);
		//seller2 객체 생성
		FruitSeller seller2 = new FruitSeller(20, 0, 1500);
		//seller3 객체 생성
		FruitSeller seller3 = new FruitSeller(); // default 생성자 이용 
		
		//buyer 객체 생성
		FruitBuyer buyer1 = new FruitBuyer(10000, 0); 
		
		//seller1에게 구매
		buyer1.buyApple(seller1, 3000);
		//seller2에게 구매
		buyer1.buyApple(seller2, 3000);
		//seller3에게 구매
		buyer1.buyApple(seller3, 4000);
		
		//판매자의 판매 결과 
		System.out.println("<<판매자1의 현재 상황>>");
		seller1.showResult();
		System.out.println("<<판매자2의 현재 상황>>");
		seller2.showResult();
		System.out.println("<<판매자3의 현재 상황>>");
		seller3.showResult();
			
		System.out.println(seller1.APPLE_PRICE);
		
		
		
	}

}
