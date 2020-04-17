package fruitProgram;

/*
작성자 : 박진명
수정일 :2020.04.17
수정 내용 : 생성자를 통한 변수 초기화, 현재 데이터 출력 메서드 생성(showResult()) 
*/

public class FruitSeller {
	// 속성 -> 변수

	// 멤버 변수 or 인스턴스 변수
//	int numOfApple = 20; // 사과의 개수
//	int myMoney = 0; // 판매 수입
//	final int PRICE = 1000; // 사과의 가격, 상수 -> 변경되면 안되는 값

	int numOfApple; // 사과의 개수
	int myMoney; // 판매 수입
	final int APPLE_PRICE; // 사과의 가격

	// 수정 : 변수의 명시적 초기화 변경
	FruitSeller() {
		//numOfApple = 20;
		//myMoney = 0;
		//APPLE_PRICE = 1000;

		this(20, 0, 1000); //다른 생성자를 호출
	}
	
	FruitSeller(int num, int money, int price) {
		numOfApple = num;
		myMoney = money;
		APPLE_PRICE = price;
	}

	
	//this 활용하기, 인스턴스변수와 지역변수
//	FruitSeller(int numOfApple, int myMoney, int price) {
//		this.numOfApple = numOfApple;
//		this.myMoney = myMoney;
//		APPLE_PRICE = price;
//	}

	// 기능 : 메서드
	// 1. 돈을 받는다 -> 매개변수를 받아야함, int money
	// 2. 받은 돈의 사과의 개수를 구한다.
	// 3. 나의 사과 개수에서 반환해야하는 사과의 개수를 뺴준다
	// 4. 받은 금액은 나의 수입으로 더해준다.
	// 5. 사과의 개수를 반환 -> 반환 데이터 int return 사과의 개수

	int saleApple(int money) { // int money 구매자가 낸 돈
		int num = money / APPLE_PRICE; // 받은 돈을 사과 가격 만큼 나눠준 사과의 개수, 구매자가 구매할 사과 개수
		numOfApple -= num; // 총 사과 개수에서 판매한 사과개수 뺴기
		myMoney += money; // 받을 돈을 총 수입에 더해준다
		return num;
	}
	


	//판매자의 현재 상황
	void showResult() {
		
		System.out.print("현재 보유 금액 : "+myMoney);
		System.out.println(" , 현재 보유한 사과의 개수 : "+numOfApple);
		
	}
	
	

}
