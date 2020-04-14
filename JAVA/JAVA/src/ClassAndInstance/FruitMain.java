package ClassAndInstance;

public class FruitMain {

	public static void main(String[] args) {
		
		// 판매자 생성 : 인스턴스화
		FruitSeller seller = new FruitSeller(); // 객체생성 = 인스턴스 생성 -> 메모리에 변수와 변수의 데이터 메서드가 저장됨
		// 구매자 생성 : 인스턴스화
		FruitBuyer buyer = new FruitBuyer(); 
		
		// 구매자가 사과를 구매
		buyer.buyApple(seller, 5000);
		System.out.println("구매자가 5000원을 지불해서 사과를 구매했습니다.");
		System.out.println();
		
		//판매 정보 출력
		System.out.println("-----판매자 판매 정보 출력-----");
		System.out.println("판매자의 현재 사과의 개수 :" + seller.numOfApple); // 판매 후 사과 개수
		System.out.println("판매자 판매 금액: " + seller.myMoney); // 판매자의 총 수입 출력
		System.out.println();
		System.out.println("-----구매자 구매 정보 출력-----");
		System.out.println("구매자의 구매 한 사과 개수: " + buyer.numOfApple); // 구매자가 산 사과 개수
		System.out.println("구매자의 현재 보유한 금액 : " + buyer.myMoney); // 구매자의 지출 후 금액 
	}

}
