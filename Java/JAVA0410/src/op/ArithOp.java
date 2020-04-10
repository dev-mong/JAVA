package op;

public class ArithOp {
	public static void main(String[] args) {

		// 1. 숫자 정수 두 개를 받는다( 변수선언 )
		int num1;
		int num2;

		num1 = 10;
		num2 = 20;

		// 2. 덧셈 연산을 한다. 결과를 출력
		int result = num1 + num2;

		System.out.println("num1 + num2 = " + result);

		// 3. 빼기 연산을한다. 결과를 출력
		result = num1 - num2;

		System.out.println("num1 - num2 = " + result);

		// 4. 곱의 연산 -> 결과 출력
		result = num1 * num2;
		System.out.println("num1 * num2 = " + result);

		// 5. 나누기 연산 -> 결과 출력
		result = num1 / num2;
		System.out.println("num1 / num2 = " + result);

		// 6. 나머지연산 -> 결과 출력
		result = num1 / num2;
		System.out.println("num1 / num2 = " + result);
	}


}
