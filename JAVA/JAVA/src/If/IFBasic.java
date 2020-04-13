package If;

public class IFBasic {
	public static void main(String[] args) {

		if (true) {
			System.out.println("true 일 때 출력");
		}

//		 오류
//		if(else)
//		{
//			System.out.println("true 일 때 출력");
//		}

		// dead code : 문법적인 오류는 없으나 의미 없는 코드
		if (false) {
			System.out.println("true 일 때 출력");
		} else {
			System.out.println("false 일 떄 출력");
		}

		if (10 > 5) {
			System.out.println("10은 5보다 큽니다.");
		}
		
		//변수가 선언되어 dead code는 아님 
		int num = 10;
		
		if (num == 5) {
			System.out.println("10은 5와 같습니다.");
		}

	}
}
