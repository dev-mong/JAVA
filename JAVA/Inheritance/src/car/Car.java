package car;

public class Car {
	
	String color;
	int door;
	
	void drive() {
		System.out.println("운전");
	}
	
	void stop() {
		System.out.println("멈춤");
	}

	
	public static void main(String[] args) {
		
		Car car = null; // 최상위 클래스 
		Fireengine fe1 = new Fireengine();
		Fireengine fe2 = null;
		Ambulance am = null;
		
		
		fe1.water(); // 참조변수를 이용하여 메소드 호출 
		car = fe1; // car는 상위 클래스 이므로 형변환 생략 가능
		
		
//		car.water(); // 오류 ???????????????????
		
		car=fe2;
		
		fe2 = (Fireengine)car;
		
		if(car instanceof Ambulance) { //형변환 여부 확인 : instanceof
			am = (Ambulance)car; //오류 
			am.siren();
		}
		
	}

}

	class Fireengine extends Car{
		
	 	void water() {
	 		System.out.println("물뿌리기");
	 	}
	}
	
	class Ambulance extends Car{
	
	void siren() {
		System.out.println("~~~~~~~~~~~");
	}
	}


