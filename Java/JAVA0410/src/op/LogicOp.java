package op;

public class LogicOp {

	public static void main(String[] args) {

		// 정수형 데이터 두 개를 받는다.
		// int num1 = 10 ,num2 = 20;
		int num1 = 10; // 사용자에게 받는 첫번쨰 숫자
		int num2 = 20; // 사용자에게 받는 두번째 숫자

		// num1이 num2 보다 큰지 확인
		// 큰 경우에는 true, 작은 경우 false
		boolean check1 = num1 > num2;
		boolean check2 = num1 == num2;

		if (check2) {
			System.out.println("num1과 num2의 값은 같습니다.");
			
		} else {
			System.out.println("num1과 num2의 값은 다릅니다.");
		}

		if (check1) {
			System.out.println("num1의 값이 num2의 값 보다 큽니다.");
		} else {
			System.out.println("num1의 값이 num2의 값 보다 큽니다");
		}
		
		//성인 여성 중 기혼자에게만 메세지를 출력합니다. 
		
		int age = 20;
		char gendar = 'w';
		boolean mCheck = true;
		
		// gendar은 문자형이므로 유니코드 값으로 변환되어 연산자 주의
		boolean result = age>19 && gendar == 'w' && mCheck;
		
		if(result) {
			System.out.println("메세지를 보냅니다.");
		}
		

	}

}
