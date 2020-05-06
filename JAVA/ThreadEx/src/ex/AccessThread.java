package ex;

public class AccessThread extends Thread {

	TwoNum twoNum;
	
	public AccessThread(TwoNum twoNum) {
		this.twoNum=twoNum;
	}
	
	public void run() {
		twoNum.addOneNumber1();
		twoNum.addTwoNumber1();
		
		twoNum.addOneNumber2();
		twoNum.addTwoNumber2();
	}
	
}
