package If;

public class IEGrade {

	public static void main(String[] args) {
		int score = 99;
		String grade = ""; // A+, A, A-, B+, B, B-, C
		
		// 100~98 : A +, 95 ~94 : A, 93 ~ 90: A-
//		if (score >= 98 && score <= 100) {
//			grade = "A +";
//		}
//
//		if (score >= 94 && score <= 97) {
//			grade = "A";
//		}
//
//		if (score >= 93 && score <= 90) {
//			grade = "A -";
//		}

		// 중첩 이용하기
		if (score >= 90) {
			grade = "A";
			if (score >= 98) {
//				grade = grade + "+";
				grade += "+";
			} else if (score < 94) { // 90 이상인 조건
//				grade = grade + "-";
				grade += "-";
			}
		} else if (score >= 80) { // 90 > score >=80
			grade = "B";
			if (score >= 88) {
				grade += "+";
			} else if (score < 88) {
				grade += "-";
			}
		} else {
			grade = "C";
		}
		System.out.println(grade);

	}

}
