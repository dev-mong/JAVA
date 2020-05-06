package ex;

//동기화 
public class Increment {
	int num=0;
	
	void increment() {
		synchronized (this) { //다른 쓰레드가 실행되는 중 이면 순차적으로 값 증가
			num++;	
		}
	}
	
	int getNum() {
		return num;
	}
}
