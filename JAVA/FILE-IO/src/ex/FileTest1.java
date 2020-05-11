package ex;

import java.io.File;

public class FileTest1 {

	public static void main(String[] args) {

//		File myFile=new File("c:\\myJava\\test.txt");
//		File myFile=new File("c:\\myJava","test.txt"); //폴더, 파일 이름 
		File myFile=new File("c:"+File.separator+"myJava"+File.separator+"test.txt"); //운영체제와 상관없이.
		
		
		//파일 존재 유무 확인
		if(myFile.exists()==false) {
			System.out.println("파일이 존재하지 않습니다.");
			return;
		}
		
		
		//----------파일 이동-----------------
		
		//새로운 폴더 생성
		File reDir=new File("c:\\yourJava"); //경로생성
		reDir.mkdir(); //디렉토리 생성
		
		//새로운 파일 경로 생성
		File newFile=new File(reDir,"new.txt");
		myFile.renameTo(newFile);
	
		if(newFile.exists()) {
			System.out.println("파일 이동 성공");
		}else {
			System.out.println("파일 이동 실패");
		}
	
	}

}
