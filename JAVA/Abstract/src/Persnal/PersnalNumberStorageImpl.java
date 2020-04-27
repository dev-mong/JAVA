package Persnal;

import ex.Fightable;


//public class PersnalNumberStorageImpl extends PersonalNumberStorage
public class PersnalNumberStorageImpl implements PersnalNumber{

	PersnalNumberInfo[] perArr;
	int numOfPerInfo;
	
	//초기화 
	PersnalNumberStorageImpl(int num){
		perArr=new PersnalNumberInfo[num];
		numOfPerInfo=0;
	}
	
	@Override
	public void addPersnalInfo(String perNum, String name) { //추상 클래스 오버라이딩
		perArr[numOfPerInfo]=new PersnalNumberInfo(name, perNum); // 배열로 인스턴스 생성
		numOfPerInfo++;
	}

	@Override
	public String searchName(String perNum) { //추상 클래스 오버라이딩
		for(int i=0;i<numOfPerInfo;i++) {
			if(perArr[i].getNumber().equals(perNum)) { //제어자 private
				return perArr[i].getName(); //이름 반환 
				
			}
		}
		return null;
	}



}
