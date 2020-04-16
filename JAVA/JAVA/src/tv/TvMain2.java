package tv;

public class TvMain2 {

	public static void main(String[] args) {

		// tv1과 tv2는 서로 다른 참조 변수
		Tv tv1 = new Tv(); // Tv 클래스 인스턴스화
		Tv tv2 = new Tv(); // Tv 클래스 인스턴스화
		System.out.println(tv1 == tv2);// 주소 값 비교, 서로 다른 객체

		System.out.println("-----------------");
		System.out.println("Tv1의 channel : " + tv1.channel);
		System.out.println("Tv2의 channel : " + tv2.channel);

		System.out.println("-----------------");

		tv1.channel = 10;
		System.out.println("tv1의 channel을 10으로 변경");
		System.out.println("Tv1의 channel : " + tv1.channel);
		System.out.println("Tv2의 channel : " + tv2.channel);
		
	}

}
