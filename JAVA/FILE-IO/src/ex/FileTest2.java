package ex;

import java.io.File;

public class FileTest2 {

	public static void main(String[] args) {

		//폴더 경로 객체 생성
		File myDir=new File("c:\\myJava");
		
		String[] fNames=myDir.list();
		
//		for(int i=0;i<fNames.length;i++) {
//			System.out.println(fNames[i]);
//		}
		
		File[] files=myDir.listFiles(); //폴더나 파일을 파일 객체로 생성
		
		for(int i=0;i<files.length;i++) {
			
			if(files[i].isDirectory()) {
				System.out.print("[DIR]\t");
			}else {
				System.out.print("[FILE]");
			}
			System.out.println(files[i].getName());
		}
		
		
	}

}