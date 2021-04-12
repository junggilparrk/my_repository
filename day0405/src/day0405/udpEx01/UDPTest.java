package day0405.udpEx01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPTest {
	public static void main(String[] args) {
		try {
			InetAddress ip=InetAddress.getByName("192.168.1.51");
			DatagramSocket socket=new DatagramSocket();
			String msg="안녕하세요 DB를 받아랏";
			byte[] buf=msg.getBytes();
			DatagramPacket packet=new DatagramPacket(buf, buf.length, ip, 7777);
			socket.send(packet);
			System.out.println("데이터 전송 완료");
		
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
