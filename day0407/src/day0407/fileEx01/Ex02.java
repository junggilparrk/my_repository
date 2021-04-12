package day0407.fileEx01;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class Ex02 {
	public static void main(String[] args) {
		//testMyFile 파일을 프로젝트/년/월/일 폴터 안쪽에 만드시오!
		//날짜를 관리하는 클래스
		//Date, Calendar 등등등이 있음 꼭 찾아서 써보기
		//LocalDate
		//LocalDateTime
		LocalDate now=LocalDate.now();
		System.out.println("년도: "+now.getYear());
		System.out.println("월: "+now.getMonthValue());
		System.out.println("일: "+now.getDayOfMonth());
		System.out.println("요일: "+now.getDayOfWeek());
		LocalDateTime nowTime=LocalDateTime.now();
		System.out.println("시: "+nowTime.getHour());
		System.out.println("분: "+nowTime.getMinute());
		System.out.println("초: "+nowTime.getSecond());
		
		//숫자로 처리하기 위해 변수로 받기.
		int year=nowTime.getYear();
		int month=nowTime.getMonthValue();//01,02,03,04,05,,06,07,08,09,10,11,12
		int day=nowTime.getDayOfMonth();
		//format()날짜의 형태를 지정해 주는 아이
		//nowTime.format(DateTimeFormatter.ofPattern(날짜를 표기할 패턴))
		
		String path=nowTime.format(DateTimeFormatter.ofPattern("YYYY/MM/dd"));
		
		String fileName="testMyFile";
		File filePath=new File(path);
		if(!filePath.exists()) {
			filePath.mkdirs();
		} 
		filePath=new File(path, fileName);
		try {
			filePath.createNewFile();
			System.out.println("파일 생성 완료");
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
}
