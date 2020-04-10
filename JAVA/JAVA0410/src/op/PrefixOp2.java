package op;

public class PrefixOp2 {

	public static void main(String[] args) {
	
		int num1 = 7; // num1의 값은 7
		int num2 = num1++; // num2 = 7, num1 = 8
		int num3 = num1--; // num3 = 8, num1 = 7, num2 =7
		
		System.out.println(num1++); // 출력은 7 num1은 8 
		System.out.println(num2); // num2 = 7
		System.out.println(num2--); // 출력 7  num2는 6 
		System.out.println(num3); // num3 = 8 
		
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);
		
		System.out.println("test");
	}

}
