package op;

public class PrefixOp {

	public static void main(String[] args) {
	
		int num1 = 7; // num1의 값은 7
		int num2 = ++num1; // num2 = 8 , num1 = 8
		int num3 = --num1; // num3 = 7, num2 = 8, num1 = 7
		
		System.out.println(++num1); // 출력 값 num1 = 8, num2 = 8 num3 =7
		System.out.println(num2); // 출력 값num2 = 8 
		System.out.println(--num2); // 출력 값 num2 = 7 
		System.out.println(num3); // 출력 값 num 3 = 7 
	}

}
