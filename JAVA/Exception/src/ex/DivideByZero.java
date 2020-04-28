package ex;

//try catch 예제 - finally 
public class DivideByZero {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=0;
		int divide=0; 
		
		try { 
			//예외 발생 지점 
			divide = num1/num2;
			
			System.out.println("연산의 결과: "+divide);
		}catch(ArithmeticException e){
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println(e.getMessage());//string 값으로 반환 됨 
			e.printStackTrace(); // 메소드 오류 사항 메세지
			
			return; // main 함수 종료
			
		} finally {
			System.out.println("무조건 실행 finally 블록"); //return해도 출력 
		}
		 
		System.out.println("프로그램을 종료합니다."); //return하면 출력 x 
		

	}

}
