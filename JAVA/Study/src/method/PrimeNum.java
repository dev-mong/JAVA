package method;

public class PrimeNum {

	static String num;
	
	public static void main(String[] args) {
		
		prime();
	
	}

	static void prime() {
		int count;
		for (int i = 1; i <= 100; i++) {
			count = 0;
			for (int j = 1; j <=i; j++) {
				if (i % j == 0) {
					count++;
				}
			}  
			if (count == 2) {
				System.out.println(i + " 소수입니다." + "true");
			}else if(count > 0) {
				System.out.println(i + " 소수가 아닙니다."+"false");
			}
		}
		
		
	}

}
