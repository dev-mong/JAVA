package Main;

import ex.Member;

public class TestMain1 {

	public static void main(String[] args) {
		
		Member member = new Member(); 
		System.out.println(member.getId()); //접근 제어지자가 default 값
		System.out.println(member.getName());
	}

}
