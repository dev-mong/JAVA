package sample;

import java.util.Scanner;

public class KeyboardScaning {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요");
		int num1 = sc.nextInt();
		
		System.out.println("숫자를 입력해주세요");
		int num2 = sc.nextInt();
		
		System.out.println("숫자를 입력해주세요");
		int num3 = sc.nextInt();
		
		
		int sum = 0;
		sum = num1+num2+num3;
		System.out.printf("입력된 정수 %d, %d, %d입니다.",num1,num2,num3);
		System.out.println("입력한 수의 합 : "+sum);
		
	}
}
