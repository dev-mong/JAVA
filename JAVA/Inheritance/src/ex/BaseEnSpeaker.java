package ex;

public class BaseEnSpeaker extends Speaker{
	
	private int baseRate;
	
	void setBaseRate(int base) {
		this.baseRate=base;
	}

	
	//메소드 오버라이딩 
	@Override
	void showCurrentState() {
		// TODO Auto-generated method stub
		super.showCurrentState();
		System.out.println("베이스의 크기: "+baseRate);
	}
	
	//object 객체를 오버라이딩
	@Override
	public String toString() {
		return "베이스 스피커";
	}

	
	
	
}
