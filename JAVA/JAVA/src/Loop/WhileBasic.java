package Loop;

public class WhileBasic {

	public static void main(String[] args) {
		int num = 0; //반복의 조건을 체크하는 변수
		
		while(num < 5) {
			System.out.println("I like JAVA" + num);
			num ++; // 선언안하면 무한 반복 
		}

	}

}
