package day0409Ex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class SeverWriter extends Thread {
	Socket socket;
	

	public SeverWriter(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));) {
			
			
			String msg=" ";
			while (true) {
				msg=br.readLine();
				bw.write(msg);
				bw.newLine();
				bw.flush();
				if(msg.equals("quit")) {
					break;
				}
			} 
				
			
		} catch (IOException e) {
			System.out.println("서버를 종료한다.");
		}
	} 

}
