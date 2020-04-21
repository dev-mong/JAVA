package twoarray;

public class TwoDimenArray {

	public static void main(String[] args) {
		//1차원 배열 선언, 생성
		int[][] arr = new int [3][4];
		
		//arr[행의 위치][1차원 배열의 인덱스]
		//arr[0~2][0~3]
		
//		System.out.println("2차원 배열의 size:"+arr.length);
//		System.out.println("arr[0] 1차원 배열의 size:"+arr[0].length);
//		System.out.println("arr[1] 1차원 배열의 size:"+arr[1].length);
//		System.out.println("arr[2] 1차원 배열의 size:"+arr[2].length);	
		
		for(int i=0;i<arr.length;i++) { //i값은 2차원 배열의 행을 의미 
			//1차원 배열의 요소 참조 반복
			for(int j=0;j<arr[i].length;j++) { // 2차원 배열의 열을 의미
				arr[i][j]=i+j;
			}
		}
		
		
		for(int i=0;i<arr.length;i++) { //i값은 2차원 배열의 행을 의미 
			//1차원 배열의 요소 참조 반복
			for(int j=0;j<arr[i].length;j++) { // 2차원 배열의 열을 의미
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		

	}

}
