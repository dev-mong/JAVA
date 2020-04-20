package array;

public class InstanceArray {

	public static void main(String[] args) {
		//참조형(String) 변수를 저장하는 배열 생성
		String[] strArray = new String[3];
		
		//배열의 참조변수 
		strArray[0]="Java";
		strArray[1]="JS";
		strArray[2]="Python";
		
		//String 참조변수 => strArray[]
		System.out.println("문자열의 길이: "+strArray[0].length());
		System.out.println("문자열의 toString(): "+strArray[0].toString()); 
		
		
		
		//배열의 순차적 참조 ( 반복문 이용해서 참조 )
		for(int i=0;i<strArray.length;i++) {
			System.out.println(strArray[i]);
		}
		
		
	}

}
