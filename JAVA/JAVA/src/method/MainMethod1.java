package method;

public class MainMethod1 {

	public static void main(String[] args) {
		//메서드를 사용하기 위해서 인스턴스화
		//메서드 코드를 메모리에 로드
		//인스턴스 생성 ( 객체 생성 )

		Method2 math = new Method2(); // 주소를 참조해서 메서드 사용
		long result = math.add(10, 100);
		System.out.println(result);
		System.out.println(math.add(1000000000L, 2000000000));
	}

}
