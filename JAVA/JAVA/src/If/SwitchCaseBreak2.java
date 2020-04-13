package If;

public class SwitchCaseBreak2 {

	public static void main(String[] args) {
		int menuNum = 1;

		switch (menuNum) {

		case 1:
			System.out.println("1.Simple Java");
			break;
		case 2:
			System.out.println("2.Funny Java");
			break;
		case 3:
			System.out.println("3.Fantastic Java");
			break;
		default:
			System.out.println("d.The Best Programming Lanaguage");
		}

		System.out.println("Do you like coffee?");
	}

}
