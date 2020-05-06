package ex;

public class ThreadMain2 {

	public static void main(String[] args) {

		//Runnable을 구현하는 인스턴스 생성
		AdderThread at1=new AdderThread(1,50);
		AdderThread at2=new AdderThread(51,100);
		
		//쓰레드 인스턴스 생성
		Thread t1=new Thread(at1);
		Thread t2=new Thread(at2);
		
		//실행의 흐름 생성
		t1.start(); //run() 호출하여 프로그램 실행 
		t2.start(); 
		
//		t1.join(3000); //3초 동안 cpu가thread 1만 사용하도록
		
		try {
			t1.join(); //현재 쓰레드를 실행하고 나머지 메소드는 대기
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		System.out.println("1-100까지의 합은: "+(at1.getNum()+at2.getNum()));
		
	}

}
