package Loop;

public class ForContinue {

	public static void main(String[] args) {
		// 1~10 까지의 숫자 중 3의 배수를 제외하고 출력
		// 1~10 까지의 숫자 중 3의 배수만 출력

		//3의 배수일 떄는 출력하지 않음 
		for (int i = 0; i <= 10; i++) {
			if (i%3==0) {
				continue;
			}
			System.out.println(i); // 3의 배수는 출력 x
		}

	}

}
