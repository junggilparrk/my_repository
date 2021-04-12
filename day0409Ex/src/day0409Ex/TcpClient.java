package day0409Ex;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient {
	public static void main(String[] args) {
		try(Socket socket=new Socket("127.0.0.1",7777)){
			System.out.println("접속하셨습니다.");
			Thread w=new Thread(new TcpWriter(socket));
			
			w.start();
			w.join();//스레드가 종료할떄까지 기다리는 아이
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("종료");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
