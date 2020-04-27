package ex;

import java.util.Scanner;

public class WeekMain {

	public static void main(String[] args) {
		System.out.println("요일을 선택해주세요");
		System.out.println("1.월");
		System.out.println("2.화");
		System.out.println("3.수");
		System.out.println("4.목");
		System.out.println("5.금");
		System.out.println("6.토");
		System.out.println("7.일");
		
		Scanner kb=new Scanner(System.in);
		
		switch (kb.nextInt()) {
		case Week.MON:
			System.out.println("월요일 입니다.");
			break;
		case Week.TUE:
			System.out.println("화요일 입니다.");
			break;
		case Week.WED:
			System.out.println("수요일 입니다.");
			break;
		case Week.THU:
			System.out.println("목요일 입니다.");
			break;
		case Week.FRI:
			System.out.println("금요일 입니다.");
			break;
		case Week.SAT:
			System.out.println("토요일 입니다.");
			break;
		case Week.SUN:
			System.out.println("일요일 입니다.");
			break;

		default:
			break;
		}
		
	}

}
