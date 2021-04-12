package day0409Ex;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;


public class TcpSever {
	public static void main(String[] args) {
			ServerSocket ss;
			Socket socket;
			List<Socket>list=new ArrayList<Socket>();
			try {
				ss=new ServerSocket(7777);
				System.out.println("클라이언트 접속 대기중...");
				
				while(true) {
				socket=ss.accept();
				list.add(socket);
				Thread w=new Thread(new TcpWriter(socket));
				Thread r=new Thread(new TcpReader(socket));
				Thread re=new Thread(new SeverWriter(socket));
				re.start();
				re.join();
				}
				
				
			
				
				
				
			} catch (IOException e) {
				System.out.println("서버 종료");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		
	}
}
