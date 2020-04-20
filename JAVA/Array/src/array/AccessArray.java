package array;

public class AccessArray {

	public static void main(String[] args) {
		// int 정수 데이터 3개 배열을 생성
		// 배열의 이름은 arr 선언
		// 배열의 선언
		
		int[] arr; // 지역변수 
		arr = new int[3]; // 배열의 인스턴스 생성
		
		// 배열의 요소 참조
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		
		int sum = arr[0]+arr[1]+arr[2];
		
		System.out.println("숫자들의 합: "+sum);
			
	}

}
