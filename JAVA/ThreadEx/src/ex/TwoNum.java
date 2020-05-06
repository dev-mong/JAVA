package ex;

public class TwoNum {

	int num1=0;
	int num2=0;

	void addOneNumber1() {
		synchronized (this) {
			num1 +=1;
		}
	}
	
	void addTwoNumber1() {
		synchronized (this) {
			num1+=2;			
		}
	}

	void addOneNumber2()
	{
		synchronized (key2) {
			num2+=1;			
		}
	}
	
	void addTwoNumber2()
	{
		synchronized (key2) {
			num2+=2;			
		}
		
	}
	
	Object t1=new Object();
	String key2="key2";
	
	void showNums() {
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
		}
	
	
	
	
	
}
