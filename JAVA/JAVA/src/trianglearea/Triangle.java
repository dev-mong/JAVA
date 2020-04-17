package trianglearea;

public class Triangle {
	
	int width;//밑변의 데이터
	int height;//높이 데이터
	
	// 밑변과 높이 데이터를 변경하는 메서드
	void setData(int w, int h) {
		width=w;
		height=h;
	}

	// 삼각형의 넓이를 구해서 반환하는 메서드
	float area() {
		float result=width*height/2f;
		return result;
	}
	
	public static void main(String[] args) {
		
		//삼각형 객체 생성
		Triangle t = new Triangle();
		
		//데이터 설정
		t.setData(5, 3);
		System.out.println("삼각형의 밑변: "+t.width);
		System.out.println("삼각형의 높이: "+t.height);
		
		//넓이를 구하는 메서드
		System.out.println("삼각형의 넓이: "+t.area());
	}
	
	
}
