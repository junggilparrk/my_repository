package day0409Ex;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class TcpWriter extends Thread {
	private Socket socket;	

	public TcpWriter(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try(BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()))){
			//reader기능이 있는 아이를 쓰레드로 만듬
			
			TcpReader r= new TcpReader(socket);//리더 쓰레드도 소켓을 공유
			
			Thread readerThread= new Thread(r);
			//스레드 데몬 생성
			//쓰레드에 데몬을 사용하면 부모 스레드가 종료 시 같이 종료;
			readerThread.setDaemon(true);
			readerThread.start();//쓰레드 시작
			
			Scanner sc = new Scanner(System.in);
		
			while (true) {
				
				String msg = sc.nextLine();
				bw.write(msg);
				System.out.println(msg);
				bw.newLine();
				bw.flush();
				if(msg.equals("quit")) {
					break;
				}
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}	
}
