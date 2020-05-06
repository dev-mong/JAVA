package ex;

public class TreadMain1 {

	public static void main(String[] args) {
		
		//쓰레드 인스턴스 생성
		ShowThread st1= new ShowThread("멋진 쓰래드");
		ShowThread st2= new ShowThread("예쁜 쓰래드");
		
		st1.setPriority(10); //우선순위 설정
		
		//쓰래드의 실행: 새로운 프로그램 코드 실행희 흐름
		st1.start();
		st2.start();
		
		for(int i=0;i<100;i++) {
			System.out.println("메인 쓰래드가 실행중입니다.");
		}
		
	}

}
