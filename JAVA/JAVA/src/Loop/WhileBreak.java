package Loop;

public class WhileBreak {

	public static void main(String[] args) {
		// 무한 반복

		int i = 0;
		int sum = 0;

		while (true){
			if (sum > 100){
				break; // while문 종료 조건
			}
			System.out.println("0");
			i++;
			sum += i;
		}
		System.out.println("마지막 값 : " + i);
		System.out.println("합이 100이 넘어간 값 : " + sum);

	}

}
