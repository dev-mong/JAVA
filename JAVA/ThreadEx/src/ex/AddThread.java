package ex;

public class AddThread extends Thread {

	//인스턴스를 이용하여 메소드, 변수를 호출
	
	Sum sumInst;
	long start;
	long end;
	
	AddThread(Sum sum,long s,long e){
		this.sumInst=sum;
		this.start=s;
		this.end=e;
	}
	
	
	public void run() {
		for(long i=start;i<=end;i++) {
			sumInst.addNum(i);
		}
	}
	
}
