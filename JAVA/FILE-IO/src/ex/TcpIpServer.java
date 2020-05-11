package ex;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpIpServer {

	public static void main(String[] args) {

		ServerSocket serverSocket=null;
		
		try {
			serverSocket=new ServerSocket(7777);
			System.out.println("소켓 서버가 준비되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}

		//클라이언트에서 소켓 연결 요청이 올 때 까지 대기 
		while(true) {
			System.out.println("연결 요청을 기다립니다.");
			
			//요청이 들어오면 연결 소켓 생성
			try {
				Socket socket=serverSocket.accept();//요청이 들어 올 때까지 대기 
				
				System.out.println(socket.getInetAddress()+"로 부터 연결 요청이 들어왔습니다."); //클라이언트로 부터 주소 받아옴
				
				//출력 스크림을 socket 객체로부터 얻음
				OutputStream out=socket.getOutputStream();
				DataOutputStream dos=new DataOutputStream(out);
				
				//클라이언트 소켓으로 데이터 전송
				dos.writeUTF("[Notice] Test Message from Server");
				System.out.println("데이터를 전송했습니다.");
				
				dos.close();
				
				
			} catch (IOException e) {
				e.printStackTrace();
			} 
			
			
			
		}
	}

}
