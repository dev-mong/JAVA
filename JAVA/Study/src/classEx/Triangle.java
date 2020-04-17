package classEx;

public class Triangle {

	// 변수 : 밑변과 높이 

	int height; // 높이 데이터
	int width; // 밑변 데이터
	
	
	//밑변과 높이 데이터를 변경하는 메서드
	int area(int a,int b) {
		height = a;
		width = b;
		int result = height * width * 1/2;
		return result;
		
	}
	
}
