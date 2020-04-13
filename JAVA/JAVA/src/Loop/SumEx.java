package Loop;

public class SumEx {

	public static void main(String[] args) {
		// 1~10까지의 합을 구한다
		// 반복 + 1 씩

		int sum = 0; // 연산의 합을 담는 변수

		for (int i = 1; i <= 1000; i++) {
			sum += i;
		}

		System.out.println("1부터 1000까지의 합 : " + sum);
		
		sum = 0; // 다시 초기화
		int i = 1;
	
		while(i <= 10) {
			sum += i;
			i++;
		}
		System.out.println("1부터 10까지의 합 : " + sum);

	}

}
