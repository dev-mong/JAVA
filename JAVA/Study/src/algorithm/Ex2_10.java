package algorithm;


public class Ex2_10 {

	public static void main(String[] args) {
//		12345의 각 자리 수 합

		int num = 12345 ;
		int sum = 0;
		
		int value = num % 10;
		System.out.println(value);
		
		value = num % 100;
		System.out.println(value);
		value = num / 100;
		System.out.println(value);
		value = num / 10000;
		System.out.println(value);
		
		System.out.println("Sum: "+ sum);
		
	}

}
