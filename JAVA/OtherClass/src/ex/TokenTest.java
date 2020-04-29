package ex;

import java.util.StringTokenizer;

public class TokenTest {

	public static void main(String[] args) {
		
		String phoneNumber="Tel 82-02-9917-2059";
		
		System.out.println(phoneNumber);
		
		StringTokenizer st1=new StringTokenizer(phoneNumber); //공백을 기준으로 반환
		
		while(st1.hasMoreTokens()) { 
			System.out.println(st1.nextToken()); //값 반환
		}
		
		System.out.println("-----------------------");
		
		StringTokenizer st2=new StringTokenizer(phoneNumber, " -",true);//'-'같이 표현
	
		while(st2.hasMoreTokens()) { // '-' 으로 구분 
			System.out.println(st2.nextToken());
		}
		

	}

}
