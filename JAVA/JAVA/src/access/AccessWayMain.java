package access;

public class AccessWayMain {
	
	public static void main(String[] args) {

		AccessWay aw = new AccessWay();
		
		System.out.println(AccessWay.num);
		AccessWay.num++;
		System.out.println(AccessWay.num);
		
		System.out.println(aw.num2);
		System.out.println(aw.num); // 참조변수를 이용하여 참조 가능 ㅋ
	}

}
