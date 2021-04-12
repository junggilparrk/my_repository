package day0405.udpEx01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class UdpSender {
	public static void main(String[] args) {
		//udp 정보를 입력
		
		try {
			//목적지를 자신에게 보낼거임.
			InetAddress ip=InetAddress.getByName("192.168.1.26");
			
			//udp는 datagramSocket을 이용하여 보낸다.
			
			DatagramSocket socket=new DatagramSocket();
			
			//보낼 데이터를 바이트 배열로 준비
			Scanner sc=new Scanner(System.in);
			
			while(true) {
			
			String msg=sc.next();
			
			
			//문자열을 getBytes()를 이용하여 바이트 단위로 쪼개서 배열에 담음
			byte[] buf=msg.getBytes();
			
			//준비된 데이터 쏴!
			//목적지의 포트번호, 아이피주소, 데이터 
			//데이터의 바이트 배열 , 배열 길이, ip주소, 포트 번호
			DatagramPacket packet=new DatagramPacket(buf, buf.length, ip, 7777); 
			
			//소켓을 통해 데이터를 보내기
			socket.send(packet);
			}
			//System.out.println("데이터 전송 끝!");
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
