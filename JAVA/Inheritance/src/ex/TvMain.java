package ex;

public class TvMain {

	public static void main(String[] args) {
		
		Tv tv1 = new Tv();
		
		IpTv itv = (IpTv)tv1; //하위 클래스 참조변수에 상위 클래스 참조 변수를 넣으면 명시적 형변환
		
		CaptionTv cTv1 = new CaptionTv();
//		Tv t = (Tv)cTv1; //형변환 
		Tv t = cTv1;//자동 형변환도 가능
		
		
		//참조형 타입이 사용할 수있는 멤버들을 결정해줌 
		// captiontv의 변수는 사용 불가능
		Tv tv2 = new CaptionTv(); 
		
		IpTv itv3 = (IpTv)tv2; // 불가능 
		
		
		
		
		CaptionTv cTv2 = (CaptionTv)tv2;
		((CaptionTv) tv2).caption(); //captionTv로 형변환 
		
//		System.out.println(tv2.power);
//		tv2.power();
//		System.out.println(tv2.power);
////		System.out.println(tv2.text);  //오류발생, 메모리는 가지고 있지만 참조 불가능 
//		
//		 tv2.display(); // caption tv의 dispaly 호출
//		 
//		 Tv tv3 = new IpTv();
//		 Tv tv4 = new SmartTv();
//		 
//		 tv3.display();
//		 tv4.display();
//		 
		 
		 
		//배열을 이용하여 객체 생성 
		 Tv[] tvs = new Tv[4];
		 // 참조변수 배열 
		 tvs[0]=new Tv();
		 tvs[1]=new CaptionTv();
		 tvs[2]=new IpTv();
		 tvs[3]=new SmartTv();
		 
		 for(int i=0;i<tvs.length;i++)
		 {
			 
			 tvs[i].power();
			 tvs[i].display();
		 }
		
	}

}
