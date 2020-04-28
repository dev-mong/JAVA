package ex;

import java.util.Scanner;

//예외 처리 throw 
public class AgeInputException2 {

	public static void main(String[] args) {
		
		try {
			int age=readAge(); //예외 발생 
			System.out.println("나이는 "+age+"세 입니다.");
		}catch(AgeInputException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("에러 메세지: "+e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	static int readAge() throws AgeInputException { // 메소드를 호출하는 곳에서 예외 처리 함 
		Scanner kb=new Scanner(System.in);
		System.out.println("나이를 입력해주세요: ");
		int age=kb.nextInt();
		if(age<0) {
			AgeInputException e=new AgeInputException();
			throw e; //예외 발생을 메소드 호출 시 처리 
		} 
		return age;
		
		
	}
	
}
