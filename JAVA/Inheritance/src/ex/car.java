package ex;

class Car {
	int gasolinegauge;
	
	Car(int gasolinegague){
		this.gasolinegauge=gasolinegague;
	}
}

class HybridCar extends Car {
	
	int electronicGauge;
	
	HybridCar(int gasolinegague, int electroniGauge){
		super(gasolinegague);
		this.electronicGauge=electroniGauge;
	}
}

class HybridWaterCar extends HybridCar {
	
	int waterGauge;
	
	HybridWaterCar(int gasolinegague,int electroniGauge,int waterGauge) {
		super(gasolinegague,electroniGauge);
		this.waterGauge=waterGauge;
		
	}

	public void showCurrentGauge() {
		System.out.println("잔여 가솔린 : " + gasolinegauge);
		System.out.println("잔여 가솔린 : " + electronicGauge);
		System.out.println("잔여 가솔린 : " + waterGauge);
	}
}
