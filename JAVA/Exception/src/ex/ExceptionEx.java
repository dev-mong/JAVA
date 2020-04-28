package ex;

import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {
		
		Scanner kb=new Scanner(System.in);
		System.out.println("나이를 입력해주세요: ");
		int age=kb.nextInt();
		
		try {
//			Exception e=new Exception("고의로 발생시킴"); //예외 메세지
			if(age<0) {
				AgeInputException e=new AgeInputException();
				throw e; //강제적으로 예외발생 지점 -> 
			} 
			System.out.println("나이는 "+age+"세 입니다.");
		} catch(AgeInputException e) {
			System.out.println(e.getMessage());
			}
			catch(Exception e) {
			System.out.println("에러 메세지: "+e.getMessage());
			e.printStackTrace();
			}
		
		System.out.println("프로그램이 정상 종료되었습니다.");
	}
	

}
