package day0409Ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class TcpReader extends Thread {
	private Socket socket;

	public TcpReader(Socket socket) {
		this.socket = socket; 
	}

	
	public void run() {
		try(BufferedReader br=	//br이란 변수로 소켓을 받아옴
				new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
			String msg="";//스트링 객체 하나 만들어서 if문으로 적어줌
			while (true) {  
				if(msg==null) {//null값을 반환할 경우에 종료하겠다.
					break;
				}
				msg=br.readLine();//String msg에 한줄(개행이 있을때까지가 한줄)을 집어 넣겠다.
				System.out.println(">>>"+msg);
				
			}
		} catch (IOException e) {//익셉션 표시 대신 종료를 출력하겠다.
			System.out.println("종료!");
		}

	}
}
