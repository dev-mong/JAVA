package array;

public class ArrayRandom {

	public static void main(String[] args) {
		
		//정수 45개를 저장 할 수 있는 배열 생성
		int[] ball = new int[45];
		
		
		//각 배열의 요소에 1~45 숫자를 초기화
		for(int i=0; i<ball.length;i++) {
			ball[i]=i+1;			
		}

		//		//배열의 값 출력
//		for(int i=0;i<ball.length;i++) {
//			System.out.println(ball[i]);
//		}
		
		
		
		//배열의 요소 값의 변경을 위한 임시 변수
		int temp;
		//랜덤한 인덱스 값 : 1~44
		int j=0; 
		
		for(int i=0;i<10000;i++) {
		
			j=(int)(Math.random()*44)+1;
			
			//값 교환
			temp=ball[0];
			ball[0]=ball[j];
			ball[j]=temp;
			
		}
		
		for(int i=0;i<6;i++) {
			System.out.println(ball[i]);
		}
		
		
	}

}
