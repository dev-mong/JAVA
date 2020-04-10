package op;

public class DivOp {

	public static void main(String[] args) {
		int num1 = 7;
		int num2 = 3;
		
		//정수의 나누기 연산 
		
		// 더하기 연산자보다 나누기 연산자가 우선 순위가 높음 
		System.out.println("num1 / num2 = " + num1 / num2);
		//num1을 float으로 형변환 시켜서 num2도 float로 변형 됨 
		System.out.println("num1 / num2 = " + (float)num1 / num2);
		System.out.println("형 변환 나눗셈: " + (float)7/3);

	}

}
