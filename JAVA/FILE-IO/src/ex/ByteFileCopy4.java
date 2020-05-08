package ex;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteFileCopy4 {

	public static void main(String[] args)  {

		//원본 파일의 데이터를 프로그램 안으로 가져와야 함
		//=> InputStream 인스턴스 생성
		InputStream in=null;
		//새로운 파일을 생성
		//=> OutputStream 인스턴스 생성
		OutputStream out=null;
		
		BufferedInputStream bin=null;
		BufferedOutputStream bout=null;
		
		
		int copyByte=0;
		int bData;
		try {
			
			in=new FileInputStream("git.exe");
			out=new FileOutputStream("git-copy3.exe");
			
			//파일 입출력 - 필터 스트림 생성 (속도 차이)
			bin=new BufferedInputStream(in);
			bout=new BufferedOutputStream(out);
			
		while(true) {
	
			bData=bin.read();
			
				if(bData==-1) {
					break;
				}
				bout.write(bData);
				copyByte++;
			} 
		}catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e1) {
				e1.printStackTrace();
			}finally {
				try { //필터 스트림에서 close - 기본 스트림도 종료 됨 
					bin.close();
					bout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		System.out.println("복사된 바이트 크기: "+copyByte);
	}
}
