package ex;

import java.util.HashSet;
import java.util.Iterator;

//타입 - 참조형 타입으로 선언 6
public class HashSetTest2 {

	public static void main(String[] args) {
		
		HashSet<SimpleNumber> set=new HashSet<SimpleNumber>();
		
		set.add(new SimpleNumber(10));
		set.add(new SimpleNumber(20));
		set.add(new SimpleNumber(10));
		
		System.out.println("저장된 데이터의 개수: "+set.size());
		
		Iterator<SimpleNumber> itr=set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}



}


class SimpleNumber{
	int num;
	public SimpleNumber(int num){
		this.num=num;
	}
	
	public String toString() {
		return String.valueOf(num);
	}
	
	@Override
	public int hashCode() {
		return this.num/2;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result=false;
		
		//num의 값을 비교
	if(obj instanceof SimpleNumber) {
			SimpleNumber sm=(SimpleNumber)obj;
			result=this.num == sm.num;
		}
		return result;
	}


}








