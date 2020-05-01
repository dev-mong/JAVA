package ex;

import java.util.LinkedList;

public class LinkedListTest2 {

	public static void main(String[] args) {
		
		String str1="one";
		String str2="tow";
		String str3="three";
		String str4="four";
		
		Data d1=new Data(str1,str2); 
		
		Data d4=new Data(str4,str2);

		Data d2=new Data(str2,str3);
		Data d3=new Data(str3,null);
		
		
		
		d1.setNextValue(d3); //주소값을 d3으로 참조 
	
	}

}

class Data{
	Object value; //현재?
 	Object nextValue; //다음 참조 해야 할 주소 값
 	
 	Data(Object obj,Object nextObj){
 		this.value=obj;
 		this.nextValue=nextObj;
 	}
 	
 	Object getValue() {
 		return value;
 	}
 	
 	void setNextValue(Object nextValue) {
 		this.nextValue=nextValue;
 	}
 	
 	
 	
}