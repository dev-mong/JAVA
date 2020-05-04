package ex;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		
//		HashMap<Integer, String> map = new HashMap<Integer,String>();
//		HashMap<Integer, String> map = new HashMap<>();
		Map<Integer, String> map = new HashMap<Integer,String>();

		//입력
		map.put(1, "일번");
		map.put(2, "이번");
		map.put(3, "삼번");
		map.put(8, "팔번");
		
		//참조
		System.out.println("1번 학생의 이름은: "+map.get(1));
		System.out.println("8번 학생의 이름은: "+map.get(8));
		
		
		//삭제
		map.remove(8);
		System.out.println();
		System.out.println("8번 학생 삭제");
		System.out.println("8번 학생의 이름은: "+map.get(8));
		
		System.out.println();
		System.out.println(map.get(2));
		
		//key 값 중복은 허용한다 -key 2가 참조하는 데이터값을 변경 함 
		map.put(2, "Tow");
		System.out.println("key=2인 데이터 중복 입력"+map.get(2));
	}

}
