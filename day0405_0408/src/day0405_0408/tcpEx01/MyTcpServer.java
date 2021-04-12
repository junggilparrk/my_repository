package day0405_0408.tcpEx01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class MyTcpServer {
	public static void main(String[] args) {
		//tcp의 서버
		Socket socket=null;
		BufferedReader br=null;
		BufferedWriter bw=null;
		System.out.println("서버소켓 생성");
		//서버소켓 생성을 해야함.
		//접속 받을 포트를 넣어서 만든다.
		try(ServerSocket serverSocket=new ServerSocket(7777)){
			//서버 소켓의 accept() 요청을 받을 때까지 대기.
			
			System.out.println("요청 대기중...");
			
			socket = serverSocket.accept();//accept를 한번더 쓰면 다른 소켓을 받을 수 도 있음
			while(true) {
			//클라이언트와 연결된 소켓으로 인풋과 아웃풋스트림을 가져온다.
			System.out.println("인풋스트림과 아웃풋스트림을 받아온다");
			//socket.getInputStream()으로 InputStream을 가져옴
			//InputStreamReader을 통해 InputStream을 Reader로 변경한다.
			//BufferedReader로 가공함.
			br=new BufferedReader(new InputStreamReader(socket.getInputStream(),"utf-8"));
			
			//socket에 연결된 outputStream()으로 클라와 연결된 OutputStream을 가져옴
			//OutputStreamWriter로 가공 output-> writer
			//BufferedWriter로 가공
			bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),"utf-8"));
			Scanner sc=new Scanner(System.in);
			String str=sc.next();
			byte[]buf=str.getBytes();
			//클라이언트에게 메세지를 보냄
			System.out.println("메세지를 입력해주세요\n");
			bw.write(buf+"\n");
			
			bw.flush();
			String msg=br.readLine();// '\n'글자가 있는 곳까지 읽음.
			System.out.println("클라이언트에게 받은 메세지: "+msg);
			System.out.println("서버 종료");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try{
				if(br!=null) {br.close();}//reader 닫기
				if(bw!=null) {bw.close();}//writer 닫기
				if(socket!=null) {socket.close();}//소켓닫기
			}catch (IOException e){
				e.printStackTrace();
			}
		}
	}
}
