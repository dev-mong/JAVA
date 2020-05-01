package ex;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorEx {

	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<Integer>();

		
		list.add(30); //Auto Boxing
		list.add(new Integer(20));
		list.add(new Integer(10));
		list.add(0);
		list.add(1);
		
		//데이터 참조
		System.out.println("저장된 데이터를 확인합니다.");
		//반복문을 통해서 일괄 참조 가능
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("---------------------------");
		
		//데이터 삭제
		list.remove(1);
		System.out.println("데이터가 삭제되었습니다.");
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
		
		System.out.println("Iterator를 이용한 모든 요소 출력 ");
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext()) {
			int num=itr.next();
			System.out.println(itr.next());
			System.out.println(num);
		}
	}

}
