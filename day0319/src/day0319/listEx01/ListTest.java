package day0319.listEx01;

//java.util안에 있는 모든 "클래스"를 임포트 하겠다.
import java.util.*;

public class ListTest {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		System.out.println("*******list 객체 생성********");
		System.out.println("list의 크기: "+list.size());
		
		list.add("milk");//밀크 추가
		System.out.println("******list에 milk 추가*******");
		System.out.println("list의 크기: "+list.size());
		System.out.println(list);//ArrayList가 toString을 오버라이드 하고 있음
		
		list.add("bread");//bread 추가
		System.out.println("******list에 bread 추가*******");
		System.out.println("list의 크기: "+list.size());
		System.out.println(list);
		
		list.add("buttur");//butter 추가
		System.out.println("******list에 butter 추가*******");
		System.out.println("list의 크기: "+list.size());
		System.out.println(list);
		
		list.add(1, "apple");//index 1번에 apple을 추가
		System.out.println("******list에 index 1번에 apple을 추가*******");
		System.out.println("list의 크기: "+list.size());
		System.out.println(list);
		
		list.set(2, "grape");//index 2번에 grape로 변경
		System.out.println("******list에 index 2번에 grape로 변경*******");
		System.out.println("list의 크기: "+list.size());
		System.out.println(list);
		
		
		list.remove(3);////index 3번 제거
		System.out.println("******list에 index 3번 제거*******");
		System.out.println("list의 크기: "+list.size());
		System.out.println(list);

		//사용하기 위한 꺼내기
		
		System.out.println("******list 0번에 있는 값을 출력하시오*******");
		System.out.println("index 0번: "+list.get(0));
		System.out.println(list);
		
		System.out.println("******list 2번에 있는 값을 출력하시오*******");
		System.out.println("index 2번: "+list.get(2));
		System.out.println(list);
		
		
		
	}

}
