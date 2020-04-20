package array;

public class ArrayAndMethod {

	public static void main(String[] args) {
		
		//원본 배열 생성
		int[] arr = {1,2,3,4,5,6,7};
		
		//결과 저장 할 배열 선언
		int[] ref;
		
		//메서드 호출 -> 반환값을 메서드에 저장 
		ref = addAllArray(arr, 10); ////배열의 주소값 반환 
		
		//메서드에 arr배열의 주소값을 넘겨줘서 ref의 주소값이 같아지므로
		//배열의 값은 변경되서 출력 되는 것 
		System.out.println("동일 배열 참조 여부 확인: "+(arr==ref));
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);  
		}
		
	}
	
	//배열(배열 참조변수)을 전달받고 증가시킬 정수값도 받음
	//모든 배열의 요소에 더해준다. 
	//전달 받은 배열을 반환해준다. =주소값을 반환
	public static int[] addAllArray(int[] ar, int addVal) {
		
		for(int i=0;i<ar.length;i++) {
			ar[i]+=addVal; // 모든 요소에 addVal값을 더해줌
		}
		return ar;
	}

}
