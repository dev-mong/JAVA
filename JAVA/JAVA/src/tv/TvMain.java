package tv;

public class TvMain {

	public static void main(String[] args) {
		
		Tv t = new Tv(); // Tv 인스턴스 생성
		
		System.out.println("----------------");
		System.out.println("Tv의 속성값 : 인스턴스 생성");
		System.out.println("Tv의 color: " + t.color);
		System.out.println("Tv의 전원: "+t.power);
		System.out.println("Tv의 채널: "+t.channel);
		
		t.channel = 11;
		System.out.println("Tv의 채널: "+t.channel);
		
		t.channelUp();
		System.out.println("Tv의 채널: "+t.channel);
		
		t.channelChange(100);
		System.out.println("Tv의 채널: "+t.channel);
		
		t.channelDown();
		System.out.println("Tv의 채널: "+t.channel);
		
	}

}
