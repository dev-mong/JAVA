package Loop;

public class LoopTest {

	public static void main(String[] args) {

		for (int i = 1; i < 51; i++) {
			System.out.println(i);
		}

		System.out.println("--------------");

		int i = 1; // 초기화

		while (i < 51) {
			System.out.println(i);
			i++; // ☆☆☆☆☆☆☆중요☆☆☆☆☆☆
		}

		System.out.println("--------------");
		
		i = 1;// 초기화

		do {
			System.out.println(i);
			i++;
		} while (i < 51);
	}

}
