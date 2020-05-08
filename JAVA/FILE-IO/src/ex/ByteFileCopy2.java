package ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteFileCopy2 {

	public static void main(String[] args)  {

		//원본 파일의 데이터를 프로그램 안으로 가져와야 함
		//=> InputStream 인스턴스 생성
		InputStream in=null;
		//새로운 파일을 생성
		//=> OutputStream 인스턴스 생성
		OutputStream out=null;
		
		
		int copyByte=0;
		int bData;
		try {
			in=new FileInputStream("git.exe");
			out=new FileOutputStream("git-copy.exe");
		while(true) {
				bData=in.read();
				if(bData==-1) {
					break;
				}
				out.write(bData);
				copyByte++;
			} 
		}catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e1) {
				e1.printStackTrace();
			}finally {
				try {
					in.close();
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		System.out.println("복사된 바이트 크기: "+copyByte);
	}
}
